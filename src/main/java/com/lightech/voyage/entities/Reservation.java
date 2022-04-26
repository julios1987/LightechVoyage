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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idres;
    @ManyToOne
    @JoinColumn(name = "idaxe")
    private Axes axe;
    @ManyToOne
    @JoinColumn(name = "idpas")
    private Passager passager;
    @ManyToOne
    @JoinColumn(name = "idcomp")
    private Compagnie compagnie;
    private Date dtevoyage;
    @ManyToOne
    @JoinColumn(name = "vildepres")
    private Ville ville;
    @ManyToOne
    @JoinColumn(name = "vildestres")
    private Ville villes;
    @ManyToOne
    @JoinColumn(name = "idh")
    private Horaire horaire;
    private Boolean stares;
    private Boolean colpas;
    private String desccolpas;
    private String photocol;
    private Date dtecreate;
    private Date dteedit;

    public Reservation() {
        super();
    }

    public Reservation(Axes axe, Passager passager, Compagnie compagnie, Date dteVoyage, Ville ville, Ville villes, Horaire horaire, Boolean staRes, Boolean colPas, String descColPas, String photoCol, Date dteCreate, Date dteEdit) {
        super();
        this.axe = axe;
        this.passager = passager;
        this.compagnie = compagnie;
        this.dtevoyage = dteVoyage;
        this.ville = ville;
        this.villes = villes;
        this.horaire = horaire;
        this.stares = staRes;
        this.colpas = colPas;
        this.desccolpas = descColPas;
        this.photocol = photoCol;
        this.dtecreate = dteCreate;
        this.dteedit = dteEdit;
    }

    public Long getIdRes() {
        return idres;
    }

    public void setIdRes(Long idRes) {
        this.idres = idRes;
    }

    public Axes getAxe() {
        return axe;
    }

    public void setAxe(Axes axe) {
        this.axe = axe;
    }

    public Passager getPassager() {
        return passager;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    public Date getDteVoyage() {
        return dtevoyage;
    }

    public void setDteVoyage(Date dteVoyage) {
        this.dtevoyage = dteVoyage;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public Ville getVilles() {
        return villes;
    }

    public void setVilles(Ville villes) {
        this.villes = villes;
    }

    public Horaire getHoraire() {
        return horaire;
    }

    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }

    public Boolean getStaRes() {
        return stares;
    }

    public void setStaRes(Boolean staRes) {
        this.stares = staRes;
    }

    public Boolean getColPas() {
        return colpas;
    }

    public void setColPas(Boolean colPas) {
        this.colpas = colPas;
    }

    public String getDescColPas() {
        return desccolpas;
    }

    public void setDescColPas(String descColPas) {
        this.desccolpas = descColPas;
    }

    public String getPhotoCol() {
        return photocol;
    }

    public void setPhotoCol(String photoCol) {
        this.photocol = photoCol;
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
