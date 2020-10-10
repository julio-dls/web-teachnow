/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceRecoveraccount {

    boolean sendmail(String to) throws AddressException, MessagingException, IOException;
}
