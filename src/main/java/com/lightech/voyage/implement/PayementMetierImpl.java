/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.implement;

import com.lightech.voyage.dao.PayementRepository;
import com.lightech.voyage.dao.ReservationRepository;
import com.lightech.voyage.entities.Payement;
import com.lightech.voyage.metier.PayementMetier;
import com.lightech.voyage.model.PayementModel;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayementMetierImpl implements PayementMetier {

    @Autowired
    private PayementRepository payementRepository;
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Payement savePayement(PayementModel payementModel) {
        Payement payement = new Payement();
        payement.setDtePay(payementModel.getDtepay());
        payement.setDescPay(payementModel.getDescpay());
        payement.setReservation(reservationRepository.getById(payementModel.getIdres()));
        payement.setMtPay(payementModel.getMtpay());
        payement.setStaPay(payementModel.getStapay());
        payement.setCodeTransPay(payementModel.getCodetranspay());
        payement.setDteCreate(new Date());
        payement.setDteEdit(new Date());
        return payementRepository.save(payement);
    }

    @Override
    public Payement getPayement(Long code) {
        return payementRepository.findById(code).get();
    }

    @Override
    public List<Payement> listPayement() {
        return payementRepository.findAll();
    }

    //Mes paiements
    @Override
    public List<Payement> mesPayement(Long idpas) {
        return payementRepository.mesPayements(idpas);
    }

    //Mes paiements validés
    @Override
    public List<Payement> mesPayementvalide(Long idpas) {
        return payementRepository.mesPayementsValider(idpas);
    }

    @Override
    public List<Payement> mesPayementNonvalide(Long idpas) {
        return payementRepository.mesPayementsNonvalider(idpas);
    }

    @Override
    public List<Payement> mesPayementdate(Long idpas, Date dte) {
        return payementRepository.mesPayementsdate(idpas, dte);
    }

}
