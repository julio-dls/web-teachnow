/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

/**
 *
 * @author jdls
 */
@Entity
public class Acercademi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String area;
    @Size(min = 0, max = 500)
    private String quiensoy;

    @ManyToOne
    @JoinColumn(name = "idperfil", nullable = false)
    @JsonBackReference
    private Perfil perfil;

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
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the quiensoy
     */
    public String getQuiensoy() {
        return quiensoy;
    }

    /**
     * @param quiensoy the quiensoy to set
     */
    public void setQuiensoy(String quiensoy) {
        this.quiensoy = quiensoy;
    }

    /**
     * @return the perfil
     */
    public Perfil getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}
