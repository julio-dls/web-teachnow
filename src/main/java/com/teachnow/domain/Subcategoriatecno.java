/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author jdls
 */
@Entity
public class Subcategoriatecno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idcategoriatecno")
    private Categoriatecno categoriatecno;

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the categoriatecno
     */
    public Categoriatecno getCategoriatecno() {
        return categoriatecno;
    }

    /**
     * @param categoriatecno the categoriatecno to set
     */
    public void setCategoriatecno(Categoriatecno categoriatecno) {
        this.categoriatecno = categoriatecno;
    }



}
