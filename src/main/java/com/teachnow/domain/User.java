/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.domain;

/**
 *
 * @author jdls
 */
public class User {

    private Integer idPerfil;
    private String privilegio;
    private String name;
    private String password;
    private String token;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return the idPerfil
     */
    public Integer getIdPerfil() {
        return idPerfil;
    }

    /**
     * @param idPerfil the idPerfil to set
     */
    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    /**
     * @return the privilegio
     */
    public String getPrivilegio() {
        return privilegio;
    }

    /**
     * @param privilegio the privilegio to set
     */
    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

}
