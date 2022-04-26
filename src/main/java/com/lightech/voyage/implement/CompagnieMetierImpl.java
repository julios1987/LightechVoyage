/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.implement;

import com.lightech.voyage.dao.CompagnieRepository;
import com.lightech.voyage.entities.Compagnie;
import com.lightech.voyage.metier.CompagnieMetier;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompagnieMetierImpl implements CompagnieMetier {

    @Autowired
    private CompagnieRepository compagnieRepository;

    @Override
    public Compagnie saveCompagnie(Compagnie cp) {
        cp.setDteCreate(new Date());
        cp.setDteEdit(new Date());
        return compagnieRepository.save(cp);
    }

    @Override
    public Compagnie getCompagnie(Long code) {
        return compagnieRepository.findById(code).get();
    }

    @Override
    public List<Compagnie> listCompagnie() {
        return compagnieRepository.findAll();
    }

    @Override
    public Compagnie updateCompagnie(Long id, Compagnie c) {
        c.setDteEdit(new Date());
        c.setDteCreate(c.getDteCreate());
        c.setIdComp(id);
        return compagnieRepository.save(c);
    }

    @Override
    public void deleteCompagnie(Long id) {
        compagnieRepository.deleteById(id);
    }

}
