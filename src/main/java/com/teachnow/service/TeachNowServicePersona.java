/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Persona;
import java.io.IOException;

/**
 *
 * @author jdls
 */
public interface TeachNowServicePersona {

    Persona guardarPersona(Persona persona) throws IllegalArgumentException;

    boolean modificarPersona(Persona persona) throws IllegalArgumentException;

    boolean agrefarFiltrosPersona(Persona persona) throws IllegalArgumentException;

    boolean updatePwsPerona(Persona persona) throws IllegalArgumentException;

    Persona obtenerDetallesUsuario(String usuario) throws IllegalArgumentException;

    String obtenerPrivilegioPerfifPorEmail(String email) throws IllegalArgumentException;

    boolean existsUser(String email) throws IOException;
}
