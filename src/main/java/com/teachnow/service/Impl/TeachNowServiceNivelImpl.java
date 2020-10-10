/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Nivel;
import com.teachnow.repository.TeachNowRepositoryNivel;
import com.teachnow.service.TeachNowServiceNivel;
import java.io.IOException;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdls
 */
@Service
@Transactional
public class TeachNowServiceNivelImpl implements TeachNowServiceNivel {

    @Autowired
    private TeachNowRepositoryNivel teachNowRepositoryNivel;

    @Override
    public List<Nivel> mostrarNivel() throws IOException {
        return teachNowRepositoryNivel.findAll();
    }

    @Override
    public Nivel mostrarNivelPorNivel(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryNivel.findByIdNivelOrderById(id);
    }
}
