/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.request;

import javax.validation.constraints.NotBlank;

public class LoginRequest {

    @NotBlank
    private String loginpas;

    @NotBlank
    private String pwdpas;

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

}
