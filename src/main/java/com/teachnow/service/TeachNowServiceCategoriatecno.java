/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Categoriatecno;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceCategoriatecno {

    Categoriatecno guardarCategoriatecno(Categoriatecno categoriatecno) throws IllegalArgumentException;

    List<Categoriatecno> mostrarTodoCategoriatecno() throws IOException;

    void eliminarCategoriatecnoPorId(Integer id) throws IOException;
}
