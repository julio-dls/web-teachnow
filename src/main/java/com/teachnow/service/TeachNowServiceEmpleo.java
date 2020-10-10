/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Empleo;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceEmpleo {

    Empleo guardarEmpleo(Empleo empleo) throws IllegalArgumentException;

    List<Empleo> buscarTodoEmpleo() throws IOException;

    void eliminarEmpleo(Integer id) throws IOException;

    List<Empleo> buscarEmpleoPorId(Integer id) throws IOException;
}
