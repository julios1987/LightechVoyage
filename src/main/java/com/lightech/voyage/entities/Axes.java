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
public class Axes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idaxe;
    @ManyToOne
    @JoinColumn(name = "vildep")
    private Ville ville;
    @ManyToOne
    @JoinColumn(name = "vildes")
    private Ville villes;
    @ManyToOne
    @JoinColumn(name = "idcomp")
    private Compagnie compagnie;
    @ManyToOne
    @JoinColumn(name = "idh")
    private Horaire horaire;
    private Long prixaxe;
    private Date dtecreate;
    private Date dteedit;

    public Axes() {
        super();
    }

    public Axes(Ville ville, Ville villes, Compagnie compagnie, Horaire horaire, Long prixAxe, Date dteCreate, Date dteEdit) {
        super();
        this.ville = ville;
        this.villes = villes;
        this.compagnie = compagnie;
        this.horaire = horaire;
        this.prixaxe = prixAxe;
        this.dtecreate = dteCreate;
        this.dteedit = dteEdit;
    }

    public Long getIdAxe() {
        return idaxe;
    }

    public void setIdAxe(Long idAxe) {
        this.idaxe = idAxe;
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

    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    public Horaire getHoraire() {
        return horaire;
    }

    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }

    public Long getPrixAxe() {
        return prixaxe;
    }

    public void setPrixAxe(Long prixAxe) {
        this.prixaxe = prixAxe;
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
