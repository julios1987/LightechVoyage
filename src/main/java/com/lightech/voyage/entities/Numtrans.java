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
public class Numtrans implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idnum;
    private Long anne;
    private Long mois;
    private Long sequences;
    private Date dtecreate;

    public Long getIdnum() {
        return idnum;
    }

    public void setIdnum(Long idnum) {
        this.idnum = idnum;
    }

    public Long getAnne() {
        return anne;
    }

    public void setAnne(Long anne) {
        this.anne = anne;
    }

    public Long getMois() {
        return mois;
    }

    public void setMois(Long mois) {
        this.mois = mois;
    }

    public Long getSequences() {
        return sequences;
    }

    public void setSequences(Long sequences) {
        this.sequences = sequences;
    }

    public Date getDtecreate() {
        return dtecreate;
    }

    public void setDtecreate(Date dtecreate) {
        this.dtecreate = dtecreate;
    }

    public Numtrans(Long anne, Long mois, Long sequences, Date dtecreate) {
        super();
        this.anne = anne;
        this.mois = mois;
        this.sequences = sequences;
        this.dtecreate = dtecreate;
    }

    public Numtrans() {
        super();
    }
}
