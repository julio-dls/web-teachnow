/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Acercademi;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceAcercademi {

    Acercademi guardarAcercademi(Acercademi acercademi) throws IllegalArgumentException;

    List<Acercademi> buscarTodoAcercademi() throws IOException;

    void eliminarAcercademiPorId(Integer id) throws IOException;

    List<Acercademi> buscarAcercademiPorId(Integer id) throws IOException;
}
