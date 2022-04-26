/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ville implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvil;
    private String nomvil;
    private Date dtecreate;
    private Date dteedit;

    public Ville() {
        super();
    }

    public Ville(String nomVil, Date dteCreate, Date dteEdit) {
        super();
        this.nomvil = nomVil;
        this.dtecreate = dteCreate;
        this.dteedit = dteEdit;
    }

    public Long getIdVil() {
        return idvil;
    }

    public void setIdVil(Long idVil) {
        this.idvil = idVil;
    }

    public String getNomVil() {
        return nomvil;
    }

    public void setNomVil(String nomVil) {
        this.nomvil = nomVil;
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
