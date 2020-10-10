/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Idioma;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceIdioma {

    Idioma guardarIdioma(Idioma idioma) throws IllegalArgumentException;

    List<Idioma> buscarTodoIdioma() throws IOException;

    void eliminarIdiomaPorId(Integer id) throws IOException;

    List<Idioma> buscarIdiomaPorId(Integer id) throws IOException;
}
