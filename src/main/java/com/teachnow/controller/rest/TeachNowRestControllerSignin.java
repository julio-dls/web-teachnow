/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller.rest;

import com.teachnow.domain.User;
import com.teachnow.service.TeachNowServicePermiso;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jdls
 */
@CrossOrigin(origins = "http://localhost:8080/teachnow")
@RestController
@RequestMapping("signin/api")
public class TeachNowRestControllerSignin {

    @Autowired
    private TeachNowServicePermiso teachNowServicePermiso;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    public User login(@RequestBody User user, HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
        if (user == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        User nUser = teachNowServicePermiso.login(user);

        return nUser;
    }
}
