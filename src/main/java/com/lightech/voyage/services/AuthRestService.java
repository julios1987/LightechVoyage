/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.services;

import com.lightech.voyage.dao.PassagerRepository;
import com.lightech.voyage.dao.RoleRepository;
import com.lightech.voyage.dao.VilleRepository;
import com.lightech.voyage.entities.ERole;
import com.lightech.voyage.entities.Passager;
import com.lightech.voyage.entities.Role;
import com.lightech.voyage.implement.PassagerDetailsImpl;
import com.lightech.voyage.jwt.JwtUtils;
import com.lightech.voyage.request.LoginRequest;
import com.lightech.voyage.request.SignupRequest;
import com.lightech.voyage.response.JwtResponse;
import com.lightech.voyage.response.MessageResponse;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthRestService {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    PassagerRepository passagerRepository;
    @Autowired
    VilleRepository villeRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    PasswordEncoder encoder;
    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getLoginpas(), loginRequest.getPwdpas()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        PassagerDetailsImpl passagerDetails = (PassagerDetailsImpl) authentication.getPrincipal();
        List<String> roles = passagerDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());
        return ResponseEntity.ok(new JwtResponse(jwt,
                passagerDetails.getId(),
                passagerDetails.getUsername(),
                passagerDetails.getEmail(),
                roles));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        if (passagerRepository.existsByLoginpas(signUpRequest.getLoginpas())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is already taken!"));
        }
        if (passagerRepository.existsByEmailpas(signUpRequest.getEmailpas())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already in use!"));
        }
        // Create new user's account
        Passager passager = new Passager(
                signUpRequest.getCivpas(),
                signUpRequest.getNompas(),
                signUpRequest.getPrenompas(),
                signUpRequest.getProfpas(),
                signUpRequest.getDatenaispas(),
                signUpRequest.getPayspas(),
                signUpRequest.getSectpas(),
                signUpRequest.getAdrespas(),
                signUpRequest.getTelpas(),
                signUpRequest.getBppas(),
                signUpRequest.getEmailpas(),
                signUpRequest.getLoginpas(),
                encoder.encode(signUpRequest.getPwdpas()),
                encoder.encode(signUpRequest.getPwdpasconfirm()),
                signUpRequest.getStatus());
        Set<String> strRoles = signUpRequest.getRoles();
        Set<Role> roles = new HashSet<>();
        if (strRoles == null) {
            Role userRole = roleRepository.findByName(ERole.ROLE_USER)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(userRole);
        } else {
            strRoles.forEach(role -> {
                switch (role) {
                    case "admin":
                        Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(adminRole);
                        break;
                    case "mod":
                        Role modRole = roleRepository.findByName(ERole.ROLE_MODERATOR)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(modRole);
                        break;
                    default:
                        Role userRole = roleRepository.findByName(ERole.ROLE_USER)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(userRole);
                }
            });
        }
        passager.setRoles(roles);
        passager.setVille(villeRepository.getById(signUpRequest.getVillepas()));
        passager.setDteCreate(new Date());
        passager.setDteEdit(new Date());
        passagerRepository.save(passager);
        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
}
