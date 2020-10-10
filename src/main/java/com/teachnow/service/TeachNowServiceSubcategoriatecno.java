/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Subcategoriatecno;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceSubcategoriatecno {

    Subcategoriatecno guardarTecnologia(Subcategoriatecno subcategoriatecno) throws IllegalArgumentException;

    List<Subcategoriatecno> mostrarTodoSubcategoriatecno() throws IOException;

    void eliminarSubcategoriatecnoPorId(Integer id) throws IOException;

    List<Subcategoriatecno> buscarSubcategoriatecnoPorId(Integer id) throws IOException;
}
