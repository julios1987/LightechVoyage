/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.model;

import java.util.Date;

public class PayementModel {

    private Long idpay;
    private Date dtepay;
    private String descpay;
    private Long idres;
    private Long mtpay;
    private Boolean stapay;
    private String codetranspay;
    private Date dtecreate;
    private Date dteedit;

    public PayementModel() {
        super();
    }

    public PayementModel(Date dtepay, String descpay, Long idres, Long mtpay, Boolean stapay, String codetranspay, Date dtecreate, Date dteedit) {
        this.dtepay = dtepay;
        this.descpay = descpay;
        this.idres = idres;
        this.mtpay = mtpay;
        this.stapay = stapay;
        this.codetranspay = codetranspay;
        this.dtecreate = dtecreate;
        this.dteedit = dteedit;
    }

    public Long getIdpay() {
        return idpay;
    }

    public void setIdpay(Long idpay) {
        this.idpay = idpay;
    }

    public Date getDtepay() {
        return dtepay;
    }

    public void setDtepay(Date dtepay) {
        this.dtepay = dtepay;
    }

    public String getDescpay() {
        return descpay;
    }

    public void setDescpay(String descpay) {
        this.descpay = descpay;
    }

    public Long getIdres() {
        return idres;
    }

    public void setIdres(Long idres) {
        this.idres = idres;
    }

    public Long getMtpay() {
        return mtpay;
    }

    public void setMtpay(Long mtpay) {
        this.mtpay = mtpay;
    }

    public Boolean getStapay() {
        return stapay;
    }

    public void setStapay(Boolean stapay) {
        this.stapay = stapay;
    }

    public String getCodetranspay() {
        return codetranspay;
    }

    public void setCodetranspay(String codetranspay) {
        this.codetranspay = codetranspay;
    }

    public Date getDtecreate() {
        return dtecreate;
    }

    public void setDtecreate(Date dtecreate) {
        this.dtecreate = dtecreate;
    }

    public Date getDteedit() {
        return dteedit;
    }

    public void setDteedit(Date dteedit) {
        this.dteedit = dteedit;
    }

}
