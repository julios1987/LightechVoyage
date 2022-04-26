package com.lightech.voyage.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpay;
    private Date dtepay;
    private String descpay;
    @ManyToOne
    @JoinColumn(name = "idres")
    private Reservation reservation;
    private Long mtpay;
    private Boolean stapay;
    private String codetranspay;
    private Date dtecreate;
    private Date dteedit;

    public Payement() {
        super();
    }

    public Payement(Date dtePay, String descPay, Reservation reservation, Long mtPay, Boolean staPay, String codeTransPay, Date dteCreate, Date dteEdit) {
        super();
        this.dtepay = dtePay;
        this.descpay = descPay;
        this.reservation = reservation;
        this.mtpay = mtPay;
        this.stapay = staPay;
        this.codetranspay = codeTransPay;
        this.dtecreate = dteCreate;
        this.dteedit = dteEdit;
    }

    public Long getIdPay() {
        return idpay;
    }

    public void setIdPay(Long idPay) {
        this.idpay = idPay;
    }

    public Date getDtePay() {
        return dtepay;
    }

    public void setDtePay(Date dtePay) {
        this.dtepay = dtePay;
    }

    public String getDescPay() {
        return descpay;
    }

    public void setDescPay(String descPay) {
        this.descpay = descPay;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Long getMtPay() {
        return mtpay;
    }

    public void setMtPay(Long mtPay) {
        this.mtpay = mtPay;
    }

    public Boolean getStaPay() {
        return stapay;
    }

    public void setStaPay(Boolean staPay) {
        this.stapay = staPay;
    }

    public String getCodeTransPay() {
        return codetranspay;
    }

    public void setCodeTransPay(String codeTransPay) {
        this.codetranspay = codeTransPay;
    }

    public Date getDteCreate() {
        return dtecreate;
    }

    public void setDteCreate(Date dteCreate) {
        this.dtecreate = dteCreate;
    }

    public Date getDteEdit() {
        return dteedit;
    }

    public void setDteEdit(Date dteEdit) {
        this.dteedit = dteEdit;
    }

}
