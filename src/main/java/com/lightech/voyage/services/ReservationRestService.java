/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.services;

import com.lightech.voyage.entities.Reservation;
import com.lightech.voyage.implement.ReservationMetierImpl;
import com.lightech.voyage.model.ReservationModel;
//import com.lightech.voyage.metier.PageReservation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/lightech")
public class ReservationRestService {

    @Autowired
    private ReservationMetierImpl reservationMetierImpl;

    @RequestMapping(value = "/reservations", method = RequestMethod.POST)
    public Reservation saveReservation(@RequestBody ReservationModel reservationModel) {
        return reservationMetierImpl.saveReservation(reservationModel);
    }

    @RequestMapping(value = "/reservations/{code}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable Long code) {
        return reservationMetierImpl.getReservation(code);
    }

    @RequestMapping(value = "/reservation", method = RequestMethod.GET)
    public List<Reservation> listReservation() {
        return reservationMetierImpl.listReservation();
    }

    @RequestMapping(value = "/reservation/{idpas}", method = RequestMethod.GET)
    public Reservation getReservationPas(@PathVariable Long idpas) {
        return reservationMetierImpl.getReservation(idpas);
    }

//    @RequestMapping(value = "/reservations", method = RequestMethod.GET)
//    public PageReservation getReservations(
//            @RequestParam String idHeure,
//            @RequestParam int page,
//            @RequestParam int size) {
//        return reservationMetierImpl.getReservations(idHeure, page, size);
//    }
    //UPDATE
    @RequestMapping(value = "/reservations/{idres}", method = RequestMethod.PUT)
    public Reservation updateReservation(@PathVariable(name = "idres") Long idres, @RequestBody ReservationModel reservationModel) {
        return reservationMetierImpl.updateReservation(idres, reservationModel);
    }

    @RequestMapping(value = "/myreservation", method = RequestMethod.GET)
    public List<Reservation> getReservations(
            @RequestParam Long idpas) {
        return reservationMetierImpl.listRervationpas(idpas);
    }

    @RequestMapping(value = "/myreservationvalide", method = RequestMethod.GET)
    public List<Reservation> getReservationsvalide(
            @RequestParam Long idpas) {
        return reservationMetierImpl.listReservationsvalide(idpas);
    }

    @RequestMapping(value = "/myreservationencours", method = RequestMethod.GET)
    public List<Reservation> getReservationsencours(
            @RequestParam Long idpas) {
        return reservationMetierImpl.listReservationsencours(idpas);
    }
}
