/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jdls
 */
@Controller
@RequestMapping(value = "/registersCompany")
public class TeachNowControllerResgisterCompany {

    @GetMapping(value = "/new")
    public String teachNowSearch(Model model) throws IOException {
        model.addAttribute("registersCompany", "registersCompany");    
        return "registersCompany";
    }
}
