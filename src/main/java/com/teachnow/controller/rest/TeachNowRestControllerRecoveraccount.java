/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller.rest;

import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.teachnow.service.TeachNowServiceRecoveraccount;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jdls
 */
@RestController
@RequestMapping(value = "/recoveraccount/sendmail/api/")
public class TeachNowRestControllerRecoveraccount {

    @Autowired
    private TeachNowServiceRecoveraccount teachNowServiceEnviaremail;

    @RequestMapping(value = "/{string}", method = RequestMethod.GET, produces = "application/json")
    public String send(@PathVariable("string") String email, HttpServletResponse response) throws MessagingException, AddressException, IOException {
        if (email == null) {
            throw new IllegalArgumentException("No se aceptan valores");
        }
        String redirect = "";
        if (teachNowServiceEnviaremail.sendmail(email)) {
            redirect = "signin/email_send_success";
            response.setStatus(200);
        } else {
            redirect = "signin/email_send_unsuccess";
            response.setStatus(200);
        }

        return redirect;
    }
}
