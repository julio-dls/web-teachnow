/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Permiso;
import com.teachnow.domain.User;

/**
 *
 * @author jdls
 */
public interface TeachNowServicePermiso {

    Permiso guardarNuevoPermiso(String usuario, String contraseña, String privilegio) throws IllegalArgumentException;

    User loginPerfifPorEmail(String email, String password) throws IllegalArgumentException;

    User login(User user) throws IllegalArgumentException;

    int verificarSiPerfilExistePorEmail(String email) throws IllegalArgumentException;
}
