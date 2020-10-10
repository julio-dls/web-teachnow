/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller;

import com.teachnow.service.TeachNowServiceToken;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jdls
 */
@Controller
@RequestMapping(value = "/renovate/")
public class TeachNowControllerRenovate {

    @Autowired
    TeachNowServiceToken teachNowServiceToken;

    @GetMapping(value = "/renew")
    public String teachNowControllerRenovate(Model model) throws IOException {
        model.addAttribute("renovate", "renovate");
        return "renovate";
    }

    @GetMapping(value = "/renew/new")
    public String teachNowControllerRenovateToken(@RequestParam(name = "token") String token, @RequestParam(name = "id") Integer id, HttpServletResponse response, Model model) throws IOException {
        if (token == null || id == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }

        String redirect = "";
        if (teachNowServiceToken.timeOutToken(token)) {
            response.sendRedirect("/teachnow/signin/token_expired");
            response.setStatus(200);
        } else {
            model.addAttribute("renovate", "renovate");
            model.addAttribute("idPerfil", id);
            redirect = "renovate";
        }
        return redirect;
    }
}
