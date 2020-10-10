/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Token;
import java.io.IOException;
/**
 *
 * @author jdls
 */
public interface TeachNowServiceToken {

    Token addNewToken(Integer idPerfil, String token) throws IOException;

    boolean timeOutToken(String token) throws IOException;
}
