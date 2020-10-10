/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller.rest;

import com.teachnow.domain.Persona;
import com.teachnow.service.TeachNowServicePersona;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jdls
 */
@RestController
@RequestMapping(value = "/renovate/renew/api/")
public class TeachNowRestControllerRenovate {

    @Autowired
    private TeachNowServicePersona teachNowServicePersona;

    @RequestMapping(value = "/new", method = RequestMethod.POST, produces = "application/json")
    public String renovatePwd(@RequestBody Persona persona, HttpServletResponse response) throws IOException {
        if (persona == null) {
            throw new IllegalArgumentException("No se aceptan valores");
        }

        String redirect = "";
        if (teachNowServicePersona.updatePwsPerona(persona)) {
            redirect = "signin/password_change_success";
            response.setStatus(200);
        } else {
            redirect = "signin/password_change_unsuccess";
            response.setStatus(200);
        }
        return redirect;
    }
}
