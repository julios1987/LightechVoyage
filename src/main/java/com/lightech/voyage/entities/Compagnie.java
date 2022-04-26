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
public class Compagnie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcomp;
    private String nomcomp;
    private String siglecomp;
    private String adrescomp;
    private String telcomp;
    private String bpcomp;
    private String emailcomp;
    private String sitewebcomp;
    private Date dtecreate;
    private Date dteedit;

    public Compagnie() {
        super();
    }

    public Compagnie(String nomComp, String sigleComp, String adresComp, String telComp, String bPComp, String emailComp, String siteWebComp, Date dteCreate, Date dteEdit) {
        super();
        this.nomcomp = nomComp;
        this.siglecomp = sigleComp;
        this.adrescomp = adresComp;
        this.telcomp = telComp;
        this.bpcomp = bPComp;
        this.emailcomp = emailComp;
        this.sitewebcomp = siteWebComp;
        this.dtecreate = dteCreate;
        this.dteedit = dteEdit;
    }

    public Long getIdComp() {
        return idcomp;
    }

    public void setIdComp(Long idComp) {
        this.idcomp = idComp;
    }

    public String getNomComp() {
        return nomcomp;
    }

    public void setNomComp(String nomComp) {
        this.nomcomp = nomComp;
    }

    public String getSigleComp() {
        return siglecomp;
    }

    public void setSigleComp(String sigleComp) {
        this.siglecomp = sigleComp;
    }

    public String getAdresComp() {
        return adrescomp;
    }

    public void setAdresComp(String adresComp) {
        this.adrescomp = adresComp;
    }

    public String getTelComp() {
        return telcomp;
    }

    public void setTelComp(String telComp) {
        this.telcomp = telComp;
    }

    public String getbPComp() {
        return bpcomp;
    }

    public void setbPComp(String bPComp) {
        this.bpcomp = bPComp;
    }

    public String getEmailComp() {
        return emailcomp;
    }

    public void setEmailComp(String emailComp) {
        this.emailcomp = emailComp;
    }

    public String getSiteWebComp() {
        return sitewebcomp;
    }

    public void setSiteWebComp(String siteWebComp) {
        this.sitewebcomp = siteWebComp;
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
