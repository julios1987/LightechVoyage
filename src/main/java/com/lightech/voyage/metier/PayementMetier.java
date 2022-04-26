/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.metier;

import com.lightech.voyage.entities.Payement;
import com.lightech.voyage.model.PayementModel;
import java.util.Date;
import java.util.List;

public interface PayementMetier {

    public Payement savePayement(PayementModel payementModel);

    public Payement getPayement(Long code);

    public List<Payement> listPayement();

    public List<Payement> mesPayement(Long idpas);

    public List<Payement> mesPayementvalide(Long idpas);

    public List<Payement> mesPayementNonvalide(Long idpas);

    public List<Payement> mesPayementdate(Long idpas, Date dte);

}
