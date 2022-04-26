/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.model;

import java.util.Date;

public class AxesModel {

    private Long idAxe;
    private Long vildep;
    private Long vildes;
    private Long idcomp;
    private Long idh;
    private Long prixaxe;
    private Date dtecreate;
    private Date dteedit;

    public AxesModel() {
        super();
    }

    public AxesModel(Long vildep, Long vildes, Long idcomp, Long idh, Long prixaxe, Date dtecreate, Date dteedit) {
        this.vildep = vildep;
        this.vildes = vildes;
        this.idcomp = idcomp;
        this.idh = idh;
        this.prixaxe = prixaxe;
        this.dtecreate = dtecreate;
        this.dteedit = dteedit;
    }

    public Long getIdAxe() {
        return idAxe;
    }

    public void setIdAxe(Long idAxe) {
        this.idAxe = idAxe;
    }

    public Long getVildep() {
        return vildep;
    }

    public void setVildep(Long vildep) {
        this.vildep = vildep;
    }

    public Long getVildes() {
        return vildes;
    }

    public void setVildes(Long vildes) {
        this.vildes = vildes;
    }

    public Long getIdcomp() {
        return idcomp;
    }

    public void setIdcomp(Long idcomp) {
        this.idcomp = idcomp;
    }

    public Long getIdh() {
        return idh;
    }

    public void setIdh(Long idh) {
        this.idh = idh;
    }

    public Long getPrixaxe() {
        return prixaxe;
    }

    public void setPrixaxe(Long prixaxe) {
        this.prixaxe = prixaxe;
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
