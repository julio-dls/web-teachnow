/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Habilidades;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceHabilidades {

    Habilidades guardarHabilidades(Habilidades habilidades) throws IllegalArgumentException;

    List<Habilidades> buscarTodoHabilidades() throws IOException;

    void eliminarHabilidades(Integer id) throws IOException;

    List<Habilidades> buscarHabilidadesPorId(Integer id) throws IOException;

}
