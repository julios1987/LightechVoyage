/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.model;

import java.util.Date;

public class ReservationModel {

    private Long idres;
    private Long idaxe;
    private Long idpas;
    private Long idcomp;
    private Date dtevoyage;
    private Long vildepres;
    private Long vildestres;
    private Long idh;
    private Boolean stares;
    private Boolean colpas;
    private String desccolpas;
    private String photocol;
    private Date dtecreate;
    private Date dteedit;

    public ReservationModel() {
        super();
    }

    public ReservationModel(Long idaxe, Long idpas, Long idcomp, Date dtevoyage, Long vildepres, Long vildestres, Long idh, Boolean stares, Boolean colpas, String desccolpas, String photocol, Date dtecreate, Date dteedit) {
        this.idaxe = idaxe;
        this.idpas = idpas;
        this.idcomp = idcomp;
        this.dtevoyage = dtevoyage;
        this.vildepres = vildepres;
        this.vildestres = vildestres;
        this.idh = idh;
        this.stares = stares;
        this.colpas = colpas;
        this.desccolpas = desccolpas;
        this.photocol = photocol;
        this.dtecreate = dtecreate;
        this.dteedit = dteedit;
    }

    public Long getIdres() {
        return idres;
    }

    public void setIdres(Long idres) {
        this.idres = idres;
    }

    public Long getIdaxe() {
        return idaxe;
    }

    public void setIdaxe(Long idaxe) {
        this.idaxe = idaxe;
    }

    public Long getIdpas() {
        return idpas;
    }

    public void setIdpas(Long idpas) {
        this.idpas = idpas;
    }

    public Long getIdcomp() {
        return idcomp;
    }

    public void setIdcomp(Long idcomp) {
        this.idcomp = idcomp;
    }

    public Date getDtevoyage() {
        return dtevoyage;
    }

    public void setDtevoyage(Date dtevoyage) {
        this.dtevoyage = dtevoyage;
    }

    public Long getVildepres() {
        return vildepres;
    }

    public void setVildepres(Long vildepres) {
        this.vildepres = vildepres;
    }

    public Long getVildestres() {
        return vildestres;
    }

    public void setVildestres(Long vildestres) {
        this.vildestres = vildestres;
    }

    public Long getIdh() {
        return idh;
    }

    public void setIdh(Long idh) {
        this.idh = idh;
    }

    public Boolean getStares() {
        return stares;
    }

    public void setStares(Boolean stares) {
        this.stares = stares;
    }

    public Boolean getColpas() {
        return colpas;
    }

    public void setColpas(Boolean colpas) {
        this.colpas = colpas;
    }

    public String getDesccolpas() {
        return desccolpas;
    }

    public void setDesccolpas(String desccolpas) {
        this.desccolpas = desccolpas;
    }

    public String getPhotocol() {
        return photocol;
    }

    public void setPhotocol(String photocol) {
        this.photocol = photocol;
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
