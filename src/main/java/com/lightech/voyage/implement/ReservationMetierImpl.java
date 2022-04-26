/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.implement;

import com.lightech.voyage.dao.AxesRespository;
import com.lightech.voyage.dao.CompagnieRepository;
import com.lightech.voyage.dao.HoraireRepository;
import com.lightech.voyage.dao.PassagerRepository;
import com.lightech.voyage.dao.ReservationRepository;
import com.lightech.voyage.dao.VilleRepository;
import com.lightech.voyage.entities.Reservation;
;
import com.lightech.voyage.metier.ReservationMetier;
import com.lightech.voyage.model.ReservationModel;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ReservationMetierImpl implements ReservationMetier {

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private AxesRespository axesRespository;
    @Autowired
    private CompagnieRepository compagnieRepository;
    @Autowired
    private VilleRepository villeRepository;
    @Autowired
    private HoraireRepository horaireRepository;
    @Autowired
    private PassagerRepository passagerRepository;

    @Override
    public Reservation saveReservation(ReservationModel reservationModel) {
        Reservation reservation = new Reservation();
        reservation.setAxe(axesRespository.getById(reservationModel.getIdaxe()));
        reservation.setPassager(passagerRepository.getById(reservationModel.getIdpas()));
        reservation.setCompagnie(compagnieRepository.getById(reservationModel.getIdcomp()));
        reservation.setDteVoyage(reservationModel.getDtevoyage());
        reservation.setVille(villeRepository.getById(reservationModel.getVildepres()));
        reservation.setVilles(villeRepository.getById(reservationModel.getVildestres()));
        reservation.setHoraire(horaireRepository.getById(reservationModel.getIdh()));
        reservation.setStaRes(reservationModel.getStares());
        reservation.setColPas(reservationModel.getColpas());
        reservation.setDescColPas(reservationModel.getDesccolpas());
        reservation.setPhotoCol(reservationModel.getPhotocol());
        reservation.setDteCreate(new Date());
        reservation.setDteEdit(new Date());
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservation(Long code) {
        return reservationRepository.findById(code).get();
    }

    @Override
    public List<Reservation> listReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public List<Reservation> listReservationHeure(Long idh) {
        return (List<Reservation>) reservationRepository.findById(idh).get();
    }

//    @Override
//    public PageReservation getReservations(String idHeure, int page, int size) {
//        Sort sort = Sort.by(Sort.Direction.ASC, "id");
//        Pageable pageable = PageRequest.of(page, size, sort);
//        Page<Reservation> ops = reservationRepository.getReservations(idHeure, (java.awt.print.Pageable) pageable);
//        PageReservation pres = new PageReservation();
//        pres.setReservations(ops.getContent());
//        pres.setNombreReservations(ops.getNumberOfElements());
//        pres.setPage(ops.getNumber());
//        pres.setTotalPages(ops.getTotalPages());
//        pres.setTotalReservations((int) ops.getTotalElements());
//        return pres;
//    }
    @Override
    public Reservation updateReservation(Long id, ReservationModel reservationModel) {
        Reservation reservation = new Reservation();
        reservation.setAxe(axesRespository.getById(reservationModel.getIdaxe()));
        reservation.setPassager(passagerRepository.getById(reservationModel.getIdpas()));
        reservation.setCompagnie(compagnieRepository.getById(reservationModel.getIdcomp()));
        reservation.setDteVoyage(reservationModel.getDtevoyage());
        reservation.setVille(villeRepository.getById(reservationModel.getVildepres()));
        reservation.setVilles(villeRepository.getById(reservationModel.getVildestres()));
        reservation.setHoraire(horaireRepository.getById(reservationModel.getIdh()));
        reservation.setStaRes(reservationModel.getStares());
        reservation.setColPas(reservationModel.getColpas());
        reservation.setDescColPas(reservationModel.getDesccolpas());
        reservation.setPhotoCol(reservationModel.getPhotocol());
        reservation.setDteCreate(new Date());
        reservation.setDteEdit(new Date());
        reservation.setIdRes(id);
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> listRervationpas(Long id) {
        return reservationRepository.chercherReservations(id);
    }

    @Override
    public List<Reservation> listReservationsvalide(Long id) {
        return reservationRepository.reservationsValide(id);
    }

    @Override
    public List<Reservation> listReservationsencours(Long id) {
        return reservationRepository.reservationsEncours(id);
    }

    @Override
    public Optional<Reservation> getReservationPas(Long idpas) {
        return reservationRepository.findByPassager(idpas);
    }
}
