/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author jdls
 */
@Entity
public class Categoriatecno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String categoria;

    @OneToMany(mappedBy = "categoriatecno")
    private List<Subcategoriatecno> subcategoriatecno;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the subcategoriatecno
     */
    public List<Subcategoriatecno> getSubcategoriatecno() {
        return subcategoriatecno;
    }

    /**
     * @param subcategoriatecno the subcategoriatecno to set
     */
    public void setSubcategoriatecno(List<Subcategoriatecno> subcategoriatecno) {
        this.subcategoriatecno = subcategoriatecno;
    }

}
