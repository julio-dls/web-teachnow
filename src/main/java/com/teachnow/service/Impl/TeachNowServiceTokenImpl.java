/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Token;
import com.teachnow.repository.TeachNowRepositoryToken;
import com.teachnow.service.TeachNowServiceToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdls
 */
@Service
@Transactional
public class TeachNowServiceTokenImpl implements TeachNowServiceToken {

    @Autowired
    TeachNowRepositoryToken teachNowRepositoryToken;

    @Override
    public Token addNewToken(Integer idPerfil, String token) throws IOException {
        if (idPerfil == null || token == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }
        Date date = new Date();

        Token nToken = new Token();
        nToken.setId_perfil(idPerfil);
        nToken.setFecha(date);
        nToken.setToken(token);

        return teachNowRepositoryToken.save(nToken);
    }

    @Override
    public boolean timeOutToken(String token) throws IOException {
        if (token == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }

        boolean expiredTime = true;
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        Token nToken = teachNowRepositoryToken.searchToken(token);
        String fechaSolicitud = formatter.format(nToken.getFecha()).toString().substring(0, 10);
        String fechaActual = formatter.format(date).substring(0, 10);

        if (fechaSolicitud.equalsIgnoreCase(fechaActual)) {
            int horaSol = Integer.parseInt(formatter.format(nToken.getFecha()).substring(11, 13).replace(":", ""));
            int minSol = Integer.parseInt(formatter.format(nToken.getFecha()).substring(13, 16).replace(":", ""));

            int horaAct = Integer.parseInt(formatter.format(date).substring(11, 13).replace(":", ""));
            int minAct = Integer.parseInt(formatter.format(date).substring(13, 16).replace(":", ""));

            int catMinSol = (horaSol * 60) + minSol;
            int catMinAct = (horaAct * 60) + minAct;

            double restarMinutos = (catMinSol - catMinAct) * -1;
            double hora = (int) (restarMinutos / 60);

            BigDecimal number = new BigDecimal(hora);
            BigDecimal fraccion = number.remainder(BigDecimal.ONE);

            double numberDecimal = Double.parseDouble(fraccion.toString());
            int minutos = (int) (numberDecimal * 60);

            if (hora < 1) {
                System.out.println("Minutos: " + minutos);
                if (minutos < 30) {
                    expiredTime = false;
                }
            }

        } else {
            expiredTime = true;
        }
        return expiredTime;
    }

}
