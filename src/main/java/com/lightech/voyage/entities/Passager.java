/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "passager",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = "loginpas"),
            @UniqueConstraint(columnNames = "emailpas")
        })
public class Passager implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpas;
    private String civpas;
    private String nompas;
    private String prenompas;
    private String profpas;
    private Date datenaispas;
    private String payspas;
    @ManyToOne
    @JoinColumn(name = "villepas")
    private Ville ville;
    private String sectpas;
    private String adrespas;
    private String telpas;
    private String bppas;
    @NotBlank
    @Size(max = 50)
    @Email
    private String emailpas;
    @NotBlank
    @Size(max = 20)
    private String loginpas;
    @NotBlank
    @Size(max = 120)
    private String pwdpas;
    @NotBlank
    @Size(max = 120)
    private String pwdpasconfirm;
    private String status;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "passager_roles",
            joinColumns = @JoinColumn(name = "passager_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
    private Date dtecreate;
    private Date dteedit;

    public Passager() {
        super();
    }

    public Passager(String civpas, String nompas, String prenompas, String profpas, Date datenaispas, String payspas, Ville ville, String sectpas, String adrespas, String telpas, String bppas, String emailpas, String loginpas, String pwdpas, String pwdpasconfirm, String status, Date dtecreate, Date dteedit) {
        this.civpas = civpas;
        this.nompas = nompas;
        this.prenompas = prenompas;
        this.profpas = profpas;
        this.datenaispas = datenaispas;
        this.payspas = payspas;
        this.ville = ville;
        this.sectpas = sectpas;
        this.adrespas = adrespas;
        this.telpas = telpas;
        this.bppas = bppas;
        this.emailpas = emailpas;
        this.loginpas = loginpas;
        this.pwdpas = pwdpas;
        this.pwdpasconfirm = pwdpasconfirm;
        this.status = status;
        this.dtecreate = dtecreate;
        this.dteedit = dteedit;
    }

    public Passager(String civpas, String nompas, String prenompas, String profpas, Date datenaispas, String payspas, String sectpas, String adrespas, String telpas, String bppas, String emailpas, String loginpas, String pwdpas, String pwdpasconfirm, String status) {
        this.civpas = civpas;
        this.nompas = nompas;
        this.prenompas = prenompas;
        this.profpas = profpas;
        this.datenaispas = datenaispas;
        this.payspas = payspas;
        this.sectpas = sectpas;
        this.adrespas = adrespas;
        this.telpas = telpas;
        this.bppas = bppas;
        this.emailpas = emailpas;
        this.loginpas = loginpas;
        this.pwdpas = pwdpas;
        this.pwdpasconfirm = pwdpasconfirm;
        this.status = status;
    }

    public Long getIdPas() {
        return idpas;
    }

    public void setIdPas(Long idPas) {
        this.idpas = idPas;
    }

    public String getCivPas() {
        return civpas;
    }

    public void setCivPas(String civPas) {
        this.civpas = civPas;
    }

    public String getNomPas() {
        return nompas;
    }

    public void setNomPas(String nomPas) {
        this.nompas = nomPas;
    }

    public String getPrenomPas() {
        return prenompas;
    }

    public void setPrenomPas(String prenomPas) {
        this.prenompas = prenomPas;
    }

    public String getProfPas() {
        return profpas;
    }

    public void setProfPas(String profPas) {
        this.profpas = profPas;
    }

    public Date getDateNaisPas() {
        return datenaispas;
    }

    public void setDateNaisPas(Date dateNaisPas) {
        this.datenaispas = dateNaisPas;
    }

    public String getPaysPas() {
        return payspas;
    }

    public void setPaysPas(String paysPas) {
        this.payspas = paysPas;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public String getSectPas() {
        return sectpas;
    }

    public void setSectPas(String sectPas) {
        this.sectpas = sectPas;
    }

    public String getAdresPas() {
        return adrespas;
    }

    public void setAdresPas(String adresPas) {
        this.adrespas = adresPas;
    }

    public String getTelPas() {
        return telpas;
    }

    public void setTelPas(String telPas) {
        this.telpas = telPas;
    }

    public String getBpPas() {
        return bppas;
    }

    public void setBpPas(String bpPas) {
        this.bppas = bpPas;
    }

    public String getEmailPas() {
        return emailpas;
    }

    public void setEmailPas(String emailPas) {
        this.emailpas = emailPas;
    }

    public String getLoginPas() {
        return loginpas;
    }

    public void setLoginPas(String loginPas) {
        this.loginpas = loginPas;
    }

    public String getPwdPas() {
        return pwdpas;
    }

    public void setPwdPas(String pwdPas) {
        this.pwdpas = pwdPas;
    }

    public String getPwdPasConfirm() {
        return pwdpasconfirm;
    }

    public void setPwdPasConfirm(String pwdPasConfirm) {
        this.pwdpasconfirm = pwdPasConfirm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
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
