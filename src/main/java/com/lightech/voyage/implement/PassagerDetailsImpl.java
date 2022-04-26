/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.implement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lightech.voyage.entities.Passager;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author LENOVO
 */
public class PassagerDetailsImpl implements UserDetails {

    private static final long serialVersionUID = 1L;
    private Long idpas;
    private String loginpas;
    private String emailpas;
    @JsonIgnore
    private String pwdpas;
    private Collection<? extends GrantedAuthority> authorities;

    public PassagerDetailsImpl(Long id, String username, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.idpas = id;
        this.loginpas = username;
        this.emailpas = email;
        this.pwdpas = password;
        this.authorities = authorities;
    }

    public static PassagerDetailsImpl build(Passager passager) {
        List<GrantedAuthority> authorities = passager.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName().name()))
                .collect(Collectors.toList());
        return new PassagerDetailsImpl(
                passager.getIdPas(),
                passager.getLoginPas(),
                passager.getEmailPas(),
                passager.getPwdPas(),
                authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public Long getId() {
        return idpas;
    }

    public String getEmail() {
        return emailpas;
    }

    @Override
    public String getPassword() {
        return pwdpas;
    }

    @Override
    public String getUsername() {
        return loginpas;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PassagerDetailsImpl passagerDetailsImpl = (PassagerDetailsImpl) o;
        return Objects.equals(idpas, passagerDetailsImpl.idpas);
    }
}
