/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.implement;

import com.lightech.voyage.dao.NumtransRepository;
import com.lightech.voyage.entities.Numtrans;
import com.lightech.voyage.metier.NumtransMetier;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumtransMetierImpl implements NumtransMetier {

    @Autowired
    private NumtransRepository numtransRepository;

    @Override
    public Numtrans saveNumtrans(Numtrans n) {
        n.setDtecreate(new Date());
        return numtransRepository.save(n);
    }

    @Override
    public void updateNumtrans(Long id, Numtrans seq) {
        seq.setIdnum(id);
        seq.setDtecreate(new Date());
        numtransRepository.save(seq);
    }

    @Override
    public List<Numtrans> sommeNumtrans(Long anne, Long mois) {
        return numtransRepository.sommeNumtrans(anne, mois);
    }

    @Override
    public Long identifiantNumtrans(Long anne, Long mois) {
        return numtransRepository.identifiantNumtrans(anne, mois);
    }

    @Override
    public List<Numtrans> listeNumtrans() {
        return numtransRepository.findAll();
    }

    @Override
    public void updateNum(Long s, Long id) {
        numtransRepository.updateNum(s, id);
    }

}
