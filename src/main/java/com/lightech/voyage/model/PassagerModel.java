/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.model;

import java.util.Date;

public class PassagerModel {

    private String civpas;
    private String nompas;
    private String prenompas;
    private String profpas;
    private Date datenaispas;
    private String payspas;
    private Long villepas;
    private String sectpas;
    private String adrespas;
    private String telpas;
    private String bppas;
    private String emailpas;
    private String loginpas;
    private String pwdpas;
    private String pwdpasconfirm;
    private String status;
    private Date dtecreate;
    private Date dteedit;

    public PassagerModel() {
        super();
    }

    public PassagerModel(String civpas, String nompas, String prenompas, String profpas, Date datenaispas, String payspas, Long villepas, String sectpas, String adrespas, String telpas, String bppas, String emailpas, String loginpas, String pwdpas, String pwdpasconfirm, String status, Date dtecreate, Date dteedit) {
        this.civpas = civpas;
        this.nompas = nompas;
        this.prenompas = prenompas;
        this.profpas = profpas;
        this.datenaispas = datenaispas;
        this.payspas = payspas;
        this.villepas = villepas;
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

    public String getCivpas() {
        return civpas;
    }

    public void setCivpas(String civpas) {
        this.civpas = civpas;
    }

    public String getNompas() {
        return nompas;
    }

    public void setNompas(String nompas) {
        this.nompas = nompas;
    }

    public String getPrenompas() {
        return prenompas;
    }

    public void setPrenompas(String prenompas) {
        this.prenompas = prenompas;
    }

    public String getProfpas() {
        return profpas;
    }

    public void setProfpas(String profpas) {
        this.profpas = profpas;
    }

    public Date getDatenaispas() {
        return datenaispas;
    }

    public void setDatenaispas(Date datenaispas) {
        this.datenaispas = datenaispas;
    }

    public String getPayspas() {
        return payspas;
    }

    public void setPayspas(String payspas) {
        this.payspas = payspas;
    }

    public Long getVillepas() {
        return villepas;
    }

    public void setVillepas(Long villepas) {
        this.villepas = villepas;
    }

    public String getSectpas() {
        return sectpas;
    }

    public void setSectpas(String sectpas) {
        this.sectpas = sectpas;
    }

    public String getAdrespas() {
        return adrespas;
    }

    public void setAdrespas(String adrespas) {
        this.adrespas = adrespas;
    }

    public String getTelpas() {
        return telpas;
    }

    public void setTelpas(String telpas) {
        this.telpas = telpas;
    }

    public String getBppas() {
        return bppas;
    }

    public void setBppas(String bppas) {
        this.bppas = bppas;
    }

    public String getEmailpas() {
        return emailpas;
    }

    public void setEmailpas(String emailpas) {
        this.emailpas = emailpas;
    }

    public String getLoginpas() {
        return loginpas;
    }

    public void setLoginpas(String loginpas) {
        this.loginpas = loginpas;
    }

    public String getPwdpas() {
        return pwdpas;
    }

    public void setPwdpas(String pwdpas) {
        this.pwdpas = pwdpas;
    }

    public String getPwdpasconfirm() {
        return pwdpasconfirm;
    }

    public void setPwdpasconfirm(String pwdpasconfirm) {
        this.pwdpasconfirm = pwdpasconfirm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
