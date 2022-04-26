/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.request;

import java.util.Date;
import java.util.Set;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignupRequest {

    @NotBlank
    @Size(min = 1, max = 2)
    private String civpas;

    @NotBlank
    private String nompas;

    @NotBlank
    private String prenompas;
    @NotBlank
    private String profpas;
    private Date datenaispas;
    private String payspas;
    private Long villepas;
    private String sectpas;
    private String adrespas;
    @Size(max = 20)
    private String telpas;
    private String bppas;
    @NotBlank
    @Size(max = 50)
    @Email
    private String emailpas;
    @NotBlank
    @Size(min = 3, max = 20)
    private String loginpas;
    @NotBlank
    @Size(min = 6, max = 40)
    private String pwdpas;
    @NotBlank
    @Size(min = 6, max = 40)
    private String pwdpasconfirm;
    private String status;

    private Set<String> roles;

    public Set<String> getRoles() {
        return this.roles;
    }

    public void setRole(Set<String> roles) {
        this.roles = roles;
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
}
