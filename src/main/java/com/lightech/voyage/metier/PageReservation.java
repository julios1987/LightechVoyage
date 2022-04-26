/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.metier;

import com.lightech.voyage.entities.Reservation;
import java.io.Serializable;
import java.util.List;

public class PageReservation implements Serializable {

    private List<Reservation> reservations;
    private int page;
    private int nombreReservations;
    private int totalReservations;
    private int totalPages;

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNombreReservations() {
        return nombreReservations;
    }

    public void setNombreReservations(int nombreReservations) {
        this.nombreReservations = nombreReservations;
    }

    public int getTotalReservations() {
        return totalReservations;
    }

    public void setTotalReservations(int totalReservations) {
        this.totalReservations = totalReservations;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
