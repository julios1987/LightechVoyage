/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.dao;

import com.lightech.voyage.entities.Payement;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PayementRepository extends JpaRepository<Payement, Long> {

    @Query("select paiement from Payement paiement where paiement.reservation.passager.idpas = :x")
    public List<Payement> mesPayements(@Param("x") Long code);

    @Query("select paiement from Payement paiement where paiement.reservation.passager.idpas = :x AND paiement.reservation.stares=true")
    public List<Payement> mesPayementsValider(@Param("x") Long code);

    @Query("select paiement from Payement paiement where paiement.reservation.passager.idpas = :x AND paiement.reservation.stares=false")
    public List<Payement> mesPayementsNonvalider(@Param("x") Long code);

    @Query("select paiement from Payement paiement where paiement.reservation.passager.idpas = :x AND paiement.dtepay = :y")
    public List<Payement> mesPayementsdate(
            @Param("x") Long code,
            @Param("y") Date dpay);

}
