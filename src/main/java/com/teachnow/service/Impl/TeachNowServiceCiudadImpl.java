/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Ciudad;
import com.teachnow.repository.TeachNowRepositoryCiudad;
import com.teachnow.service.TeachNowServiceCiudad;
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
public class TeachNowServiceCiudadImpl implements TeachNowServiceCiudad {

    @Autowired
    private TeachNowRepositoryCiudad teachNowRepositoryCiudad;

    @Override
    public List<Ciudad> mostrarCiudad() throws IOException {
        return teachNowRepositoryCiudad.findAll();
    }

    @Override
    public Ciudad mostrarCiudadPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryCiudad.findByIdCiudadOrderById(id);
    }

}
