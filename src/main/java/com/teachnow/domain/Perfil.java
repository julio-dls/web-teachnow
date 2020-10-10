/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Perfil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @JsonManagedReference
    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL)
    private List<Estudio> estudios;

    @JsonManagedReference
    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL)
    private List<Tecnologia> tecnologias;

    @JsonManagedReference
    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL)
    private List<Empleo> empleos;

    @JsonManagedReference
    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL)
    private List<Idioma> idiomas;

    @JsonManagedReference
    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL)
    private List<Acercademi> acercademi;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * @return the estudios
     */
    public List<Estudio> getEstudios() {
        return estudios;
    }

    /**
     * @param estudios the estudios to set
     */
    public void setEstudios(List<Estudio> estudios) {
        this.estudios = estudios;
    }

    /**
     * @return the tecnologias
     */
    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    /**
     * @param tecnologias the tecnologias to set
     */
    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    /**
     * @return the empleos
     */
    public List<Empleo> getEmpleos() {
        return empleos;
    }

    /**
     * @param empleos the empleos to set
     */
    public void setEmpleos(List<Empleo> empleos) {
        this.empleos = empleos;
    }

    /**
     * @return the idiomas
     */
    public List<Idioma> getIdiomas() {
        return idiomas;
    }

    /**
     * @param idiomas the idiomas to set
     */
    public void setIdiomas(List<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    /**
     * @return the acercademi
     */
    public List<Acercademi> getAcercademi() {
        return acercademi;
    }

    /**
     * @param acercademi the acercademi to set
     */
    public void setAcercademi(List<Acercademi> acercademi) {
        this.acercademi = acercademi;
    }
}
