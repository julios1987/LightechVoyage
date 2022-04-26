/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.dao;

import com.lightech.voyage.entities.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query("select res from Reservation res where res.passager.idpas = :x")
    public List<Reservation> chercherReservations(@Param("x") Long code);

    @Query("select res from Reservation res where res.passager.idpas = :x and res.stares=1")
    public List<Reservation> reservationsValide(@Param("x") Long code);

    @Query("select res from Reservation res where res.passager.idpas = :x and res.stares=0")
    public List<Reservation> reservationsEncours(@Param("x") Long code);

    Optional<Reservation> findByPassager(Long idpas);
}
