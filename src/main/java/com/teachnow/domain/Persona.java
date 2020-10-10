/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    private String nacionalidad;
    private String pais;
    private String region;
    private String ciudad;
    private String direccion;
    private String dirskype;
    private String tipotelefono;
    private String telefono;
    private String tipodocumento;
    private String documento;
    private String licconducir;
    private String vehiculo;
    private String discapacidad;
    private String cp;
    private String estadocivil;
    private String genero;
    private String razonsocial;
    private String institucion;
    private String cuitinstitucion;
    private String tipo;
    private Integer salario;
    private Integer nivel;
    private Integer tipodepuesto;
    private Integer zona;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idpermiso")
    private Permiso permiso;

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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fechanacimiento
     */
    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     * @param fechanacimiento the fechanacimiento to set
     */
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the dirskype
     */
    public String getDirskype() {
        return dirskype;
    }

    /**
     * @param dirskype the dirskype to set
     */
    public void setDirskype(String dirskype) {
        this.dirskype = dirskype;
    }

    /**
     * @return the tipotelefono
     */
    public String getTipotelefono() {
        return tipotelefono;
    }

    /**
     * @param tipotelefono the tipotelefono to set
     */
    public void setTipotelefono(String tipotelefono) {
        this.tipotelefono = tipotelefono;
    }

    /**
     * @return the tipodocumento
     */
    public String getTipodocumento() {
        return tipodocumento;
    }

    /**
     * @param tipodocumento the tipodocumento to set
     */
    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    /**
     * @return the licconducir
     */
    public String getLicconducir() {
        return licconducir;
    }

    /**
     * @param licconducir the licconducir to set
     */
    public void setLicconducir(String licconducir) {
        this.licconducir = licconducir;
    }

    /**
     * @return the vehiculo
     */
    public String getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return the discapacidad
     */
    public String getDiscapacidad() {
        return discapacidad;
    }

    /**
     * @param discapacidad the discapacidad to set
     */
    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * @return the cp
     */
    public String getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * @return the estadocivil
     */
    public String getEstadocivil() {
        return estadocivil;
    }

    /**
     * @param estadocivil the estadocivil to set
     */
    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the razonsocial
     */
    public String getRazonsocial() {
        return razonsocial;
    }

    /**
     * @param razonsocial the razonsocial to set
     */
    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    /**
     * @return the insitucion
     */
    public String getInsitucion() {
        return institucion;
    }

    /**
     * @param insitucion the insitucion to set
     */
    public void setInsitucion(String insitucion) {
        this.institucion = insitucion;
    }

    /**
     * @return the cuitintitucion
     */
    public String getCuitintitucion() {
        return cuitinstitucion;
    }

    /**
     * @param cuitintitucion the cuitintitucion to set
     */
    public void setCuitintitucion(String cuitintitucion) {
        this.cuitinstitucion = cuitintitucion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the permiso
     */
    public Permiso getPermiso() {
        return permiso;
    }

    /**
     * @param permiso the permiso to set
     */
    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the salario
     */
    public Integer getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    /**
     * @return the nivel
     */
    public Integer getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the tipodepuesto
     */
    public Integer getTipodepuesto() {
        return tipodepuesto;
    }

    /**
     * @param tipodepuesto the tipodepuesto to set
     */
    public void setTipodepuesto(Integer tipodepuesto) {
        this.tipodepuesto = tipodepuesto;
    }

    /**
     * @return the zona
     */
    public Integer getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(Integer zona) {
        this.zona = zona;
    }

}
