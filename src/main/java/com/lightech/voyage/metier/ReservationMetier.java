/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.metier;

import com.lightech.voyage.entities.Reservation;
import com.lightech.voyage.model.ReservationModel;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ReservationMetier {

    public Reservation saveReservation(ReservationModel reservationModel);

    public Reservation updateReservation(Long id, ReservationModel reservationModel);

    public Reservation getReservation(Long code);

    //Liste des reservations
    public List<Reservation> listReservation();

    //Liste des reservations par heure
    public List<Reservation> listReservationHeure(Long idh);

    //Liste des reservations par passager
    public List<Reservation> listRervationpas(Long id);

    //Liste des reservations par passager
    public List<Reservation> listReservationsvalide(Long id);

    //Liste des reservations par passager
    public List<Reservation> listReservationsencours(Long id);

    //Liste des reservations par passager
    public Optional<Reservation> getReservationPas(Long idpas);
    //Liste des reservations par heure
    //public PageReservation getReservations(String idHeure, int page, int size);
}
