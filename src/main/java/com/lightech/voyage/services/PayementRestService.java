/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.services;

import com.lightech.voyage.entities.Payement;
import com.lightech.voyage.implement.PayementMetierImpl;
import com.lightech.voyage.model.PayementModel;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/lightech")
public class PayementRestService {

    @Autowired
    private PayementMetierImpl payementMetierImpl;

    @RequestMapping(value = "/payements", method = RequestMethod.POST)
    public Payement savePayement(@RequestBody PayementModel payementModel) {
        return payementMetierImpl.savePayement(payementModel);
    }

    @RequestMapping(value = "/payements/{code}", method = RequestMethod.GET)
    public Payement getPayement(@PathVariable Long code) {
        return payementMetierImpl.getPayement(code);
    }

    @RequestMapping(value = "/payements", method = RequestMethod.GET)
    public List<Payement> listPayement() {
        return payementMetierImpl.listPayement();
    }

    //Mes paiements
    @RequestMapping(value = "/paiements", method = RequestMethod.GET)
    public List<Payement> mesPaiements(
            @RequestParam Long idpas) {
        return payementMetierImpl.mesPayement(idpas);
    }

    //Mes paiements validés
    @RequestMapping(value = "/paiementsvalid", method = RequestMethod.GET)
    public List<Payement> mesPaiementsvalide(
            @RequestParam Long idpas) {
        return payementMetierImpl.mesPayementvalide(idpas);
    }

    //Mes paiements non validés
    @RequestMapping(value = "/paiementsnonvalid", method = RequestMethod.GET)
    public List<Payement> mesPaiementsnonvalide(
            @RequestParam Long idpas) {
        return payementMetierImpl.mesPayementNonvalide(idpas);
    }

    //Mes paiements à date
    @RequestMapping(value = "/paiementsdate", method = RequestMethod.GET)
    public List<Payement> mesPaiementsdate(
            @RequestParam Long idpas,
            @RequestParam Date dte) {
        return payementMetierImpl.mesPayementdate(idpas, dte);
    }
}
