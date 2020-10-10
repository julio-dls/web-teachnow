/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Estudio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String nivelestudio;
    private String instituto;
    @Temporal(TemporalType.DATE)
    private Date fechagraduacion;
    @Temporal(TemporalType.DATE)
    private Date fechainicio;
    private String estado;
    private String carrera;

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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the nivelestudio
     */
    public String getNivelestudio() {
        return nivelestudio;
    }

    /**
     * @param nivelestudio the nivelestudio to set
     */
    public void setNivelestudio(String nivelestudio) {
        this.nivelestudio = nivelestudio;
    }

    /**
     * @return the instituto
     */
    public String getInstituto() {
        return instituto;
    }

    /**
     * @param instituto the instituto to set
     */
    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    /**
     * @return the fechagraduacion
     */
    public Date getFechagraduacion() {
        return fechagraduacion;
    }

    /**
     * @param fechagraduacion the fechagraduacion to set
     */
    public void setFechagraduacion(Date fechagraduacion) {
        this.fechagraduacion = fechagraduacion;
    }

    /**
     * @return the fechainicio
     */
    public Date getFechainicio() {
        return fechainicio;
    }

    /**
     * @param fechainicio the fechainicio to set
     */
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
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
