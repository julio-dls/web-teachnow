/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Estudio;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceEstudio {

    Estudio guardarEstudio(Estudio estudio) throws IllegalArgumentException;
    
    List<Estudio> buscarTodoEstudio() throws IOException;
    
    void eliminarEstudio(int id) throws IOException;
    
    List<Estudio> buscarEstudioPorId(Integer id) throws IOException;
}
