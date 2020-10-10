/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller.rest;

/**
 *
 * @author jdls
 */
import com.teachnow.domain.Persona;
import com.teachnow.service.TeachNowServicePerfil;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registersCompany/new/api")
public class TeachNowRestControllerResgisterCompany {

    @Autowired
    private TeachNowServicePerfil teachNowServicePerfil;

    @PostMapping("/institucion")
    public String guardar(@RequestBody Persona persona, HttpServletResponse httpServletResponse) throws IOException {
        String redirect = "";
        if (teachNowServicePerfil.guardarPerfilPersona(persona) == true) {
            redirect = "signin/account_created";
            httpServletResponse.setStatus(200);
        } else {
            redirect = "signin/account_exist";
            httpServletResponse.setStatus(200);
        }
        return redirect;
    }
}
