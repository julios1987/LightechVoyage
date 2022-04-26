/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.implement;

import com.lightech.voyage.dao.VilleRepository;
import com.lightech.voyage.entities.Ville;
import com.lightech.voyage.metier.VilleMetier;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VilleMetierImpl implements VilleMetier {

    @Autowired
    private VilleRepository villeRepository;

    @Override
    public Ville saveVille(Ville v) {
        v.setDteCreate(new Date());
        v.setDteEdit(new Date());
        return villeRepository.save(v);
    }

    @Override
    public List<Ville> listVille() {
        return villeRepository.findAll();
    }

    @Override
    public Ville updateVille(Long id, Ville v) {
        v.setDteEdit(new Date());
        v.setDteCreate(v.getDteCreate());
        v.setIdVil(id);
        return villeRepository.save(v);
    }

    @Override
    public void deleteVille(Long id) {
        villeRepository.deleteById(id);
    }

    @Override
    public Ville listVilles(Long idVil) {
        return villeRepository.findById(idVil).get();
    }

    @Override
    public Ville getVilleDesignation(String nomVil) {
        return villeRepository.findByNomvil(nomVil).get();
    }

}
