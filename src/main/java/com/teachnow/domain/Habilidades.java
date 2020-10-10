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
public class Habilidades implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min = 0, max = 500)
    private String conocimientos;

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
     * @return the conocimientos
     */
    public String getConocimientos() {
        return conocimientos;
    }

    /**
     * @param conocimientos the conocimientos to set
     */
    public void setConocimientos(String conocimientos) {
        this.conocimientos = conocimientos;
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
