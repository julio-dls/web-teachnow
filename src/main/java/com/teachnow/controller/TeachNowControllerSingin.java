/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jdls
 */
@Controller
@RequestMapping(value = "/signin/")
public class TeachNowControllerSingin {

    @GetMapping(value = "/login")
    public String teachNowSingin(Model model) throws IOException {
        model.addAttribute("signin", "signin");
        return "signin";
    }

    @GetMapping(value = "/logout")
    public String teachNowLoguot(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        model.addAttribute("message", "Usuario Deslogueado");
        return "signin";
    }

    @GetMapping(value = "/not_account")
    public String teachNowNotRegister(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        model.addAttribute("message", "El usuario no tiene una cuenta creada con Gmail");
        return "signin";
    }

    @GetMapping(value = "/error")
    public String teachNowLoginError(Model model) throws IOException {
        model.addAttribute("message", "Fallo Authenticacion");
        return "signin";
    }

    @GetMapping(value = "/account_created")
    public String teachNowLoginAccoutnCreated(Model model) throws IOException {
        model.addAttribute("message", "Usuario creado correctamente");
        return "signin";
    }

    @GetMapping(value = "/account_exist")
    public String teachNowLoginExistAccount(Model model) throws IOException {
        model.addAttribute("message", "El usuario ya fue creado");
        return "signin";
    }

    @GetMapping(value = "/email_send_success")
    public String teachNowLoginSendmailSuccess(Model model) throws IOException {
        model.addAttribute("message", "Email enviado");
        return "signin";
    }

    @GetMapping(value = "/email_send_unsuccess")
    public String teachNowLoginSendmailUnSuccess(Model model) throws IOException {
        model.addAttribute("message", "Fallo envio de email");
        return "signin";
    }

    @GetMapping(value = "/token_expired")
    public String teachNowLoginTokenExpired(Model model) throws IOException {
        model.addAttribute("message", "El token a expirado");
        return "signin";
    }

    @GetMapping(value = "/password_change_success")
    public String teachNowLoginPasswordChangeSuccess(Model model) throws IOException {
        model.addAttribute("message", "Se cambio la contraseña correctamente");
        return "signin";
    }

    @GetMapping(value = "/password_change_unsuccess")
    public String teachNowLoginPasswordChangeUnsuccess(Model model) throws IOException {
        model.addAttribute("message", "No se cambio la contraseña, por favor volver a intentar");
        return "signin";
    }
}
