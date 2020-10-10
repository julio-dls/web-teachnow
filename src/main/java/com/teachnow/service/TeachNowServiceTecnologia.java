/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Tecnologia;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceTecnologia {

    Tecnologia guardarTecnologia(Tecnologia tecnologia) throws IllegalArgumentException;

    List<Tecnologia> buscarTodoTecnologia() throws IOException;

    void eliminarTecnologiaPorId(Integer id) throws IOException;

    List<Tecnologia> buscarTecnologiaPorId(Integer id) throws IOException;
}