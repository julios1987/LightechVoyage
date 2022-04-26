/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horaire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idh;
    private String hdepart;
    private Date dtecreate;
    private Date dteedit;

    public Horaire() {
        super();
    }

    public Horaire(String hDepart, Date dteCreate, Date dteEdit) {
        super();
        this.hdepart = hDepart;
        this.dtecreate = dteCreate;
        this.dteedit = dteEdit;
    }

    public Long getIdH() {
        return idh;
    }

    public void setIdH(Long idH) {
        this.idh = idH;
    }

    public String gethDepart() {
        return hdepart;
    }

    public void sethDepart(String hDepart) {
        this.hdepart = hDepart;
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
