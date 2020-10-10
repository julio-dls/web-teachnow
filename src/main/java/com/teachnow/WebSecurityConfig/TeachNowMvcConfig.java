/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.WebSecurityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author jdls
 */
@Configuration
public class TeachNowMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/home").setViewName("index");
        registry.addViewController("/search").setViewName("search");
        registry.addViewController("/signin").setViewName("signin");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/renovate").setViewName("renovate");
        registry.addViewController("/registersCompany").setViewName("registersCompany");
        registry.addViewController("/registernewaccount").setViewName("registernewaccount");
    }
}
