/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.implement;

import com.lightech.voyage.dao.HoraireRepository;
import com.lightech.voyage.entities.Horaire;
import com.lightech.voyage.metier.HoraireMetier;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoraireMetierImpl implements HoraireMetier {

    @Autowired
    private HoraireRepository horaireRepository;

    @Override
    public Horaire saveHoraire(Horaire h) {
        h.setDteCreate(new Date());
        h.setDteEdit(new Date());
        return horaireRepository.save(h);
    }

    @Override
    public List<Horaire> listHoraire() {
        return horaireRepository.findAll();
    }

    @Override
    public Horaire updateHoraire(Long id, Horaire h) {
        h.setDteEdit(new Date());
        h.setDteCreate(h.getDteCreate());
        h.setIdH(id);
        return horaireRepository.save(h);
    }

    @Override
    public void deleteHoraire(Long id) {
        horaireRepository.deleteById(id);
    }

    @Override
    public Horaire listHoraires(Long id) {
        return horaireRepository.findById(id).get();
    }

}
