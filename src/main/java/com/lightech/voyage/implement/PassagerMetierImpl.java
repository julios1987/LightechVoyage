/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.implement;

import com.lightech.voyage.dao.PassagerRepository;
import com.lightech.voyage.dao.VilleRepository;
import com.lightech.voyage.entities.Passager;
import com.lightech.voyage.metier.PassagerMetier;
import com.lightech.voyage.model.PassagerModel;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PassagerMetierImpl implements PassagerMetier, UserDetailsService {

    @Autowired
    private PassagerRepository passagerRepository;
    @Autowired
    private VilleRepository villeRepository;

    @Override
    public Passager savePassager(PassagerModel passagerModel) {
        Passager passager = new Passager();
        passager.setCivPas(passagerModel.getCivpas());
        passager.setNomPas(passagerModel.getNompas());
        passager.setPrenomPas(passagerModel.getPrenompas());
        passager.setProfPas(passagerModel.getProfpas());
        passager.setDateNaisPas(passagerModel.getDatenaispas());
        passager.setPaysPas(passagerModel.getPayspas());
        passager.setVille(villeRepository.getById(passagerModel.getVillepas()));
        passager.setSectPas(passagerModel.getSectpas());
        passager.setAdresPas(passagerModel.getAdrespas());
        passager.setTelPas(passagerModel.getTelpas());
        passager.setBpPas(passagerModel.getBppas());
        passager.setEmailPas(passagerModel.getEmailpas());
        passager.setLoginPas(passagerModel.getLoginpas());
        passager.setPwdPas(passagerModel.getPwdpas());
        passager.setPwdPasConfirm(passagerModel.getPwdpasconfirm());
        passager.setStatus("1");
        passager.setDteCreate(new Date());
        passager.setDteEdit(new Date());
        return passagerRepository.save(passager);
    }

    @Override
    public Passager getPassager(Long code) {
        return passagerRepository.findById(code).get();
    }

    @Override
    public List<Passager> listPassager() {
        return passagerRepository.findAll();
    }

    @Override
    public Passager updatePassager(Long id, PassagerModel passagerModel) {
        Passager passager = new Passager();
        passager.setCivPas(passagerModel.getCivpas());
        passager.setNomPas(passagerModel.getNompas());
        passager.setPrenomPas(passagerModel.getPrenompas());
        passager.setProfPas(passagerModel.getProfpas());
        passager.setDateNaisPas(passagerModel.getDatenaispas());
        passager.setPaysPas(passagerModel.getPayspas());
        passager.setVille(villeRepository.getById(passagerModel.getVillepas()));
        passager.setSectPas(passagerModel.getSectpas());
        passager.setAdresPas(passagerModel.getAdrespas());
        passager.setTelPas(passagerModel.getTelpas());
        passager.setBpPas(passagerModel.getBppas());
        passager.setEmailPas(passagerModel.getEmailpas());
        passager.setLoginPas(passagerModel.getLoginpas());
        passager.setPwdPas(passagerModel.getPwdpas());
        passager.setPwdPasConfirm(passagerModel.getPwdpasconfirm());
        passager.setStatus(passagerModel.getStatus());
        passager.setDteEdit(new Date());
        return passagerRepository.save(passager);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Passager passager = passagerRepository.findByLoginpas(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
        return PassagerDetailsImpl.build(passager);
    }

}
