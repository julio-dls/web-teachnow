/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller.rest;

import com.teachnow.domain.Perfil;
import com.teachnow.domain.User;
import com.teachnow.service.TeachNowServicePerfil;
import com.teachnow.service.TeachNowServicePermiso;
import com.teachnow.service.TeachNowServicePersona;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jdls
 */
@RestController
@RequestMapping("/mobile/api")
public class TeachNowRestControllerAppMobile {

    @Autowired
    private TeachNowServicePermiso teachNowServicePermiso;
    @Autowired
    private TeachNowServicePerfil teachNowServicePerfil;
    @Autowired
    private TeachNowServicePersona teachNowServicePersona;

    @PostMapping("/login")
    public User signinAppMobile(@RequestParam("email") String email, @RequestParam("pwd") String pwd) throws IOException {
        if (email == null && pwd == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        return teachNowServicePermiso.loginPerfifPorEmail(email, pwd);
    }

    @PostMapping("/google")
    public boolean signinAppMobileGoogle(@RequestParam("email") String email) throws IOException {
        if (email == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        boolean login = false;
        if (teachNowServicePersona.obtenerPrivilegioPerfifPorEmail(email).equalsIgnoreCase("institucion")) {
            login = true;
        }
        return login;
    }

    @RequestMapping(value = "/search/all", method = RequestMethod.GET)
    public List<Perfil> mostrarTodoAppMobile(Model model) throws IOException {
        return teachNowServicePerfil.buscarTodo();
    }
    
    @RequestMapping(value = "/search/{idPerfil}", method = RequestMethod.GET, produces = "application/json")
    public Perfil mostrarPorId(@PathVariable("idPerfil") Integer idPerfil) throws IOException {
        if (idPerfil == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        return teachNowServicePerfil.buscarPorId(idPerfil);
    }
}
