/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Zona;
import com.teachnow.repository.TeachNowRepositoryZona;
import com.teachnow.service.TeachNowServiceZona;
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
public class TeachNowServiceZonaImpl implements TeachNowServiceZona {

    @Autowired
    private TeachNowRepositoryZona teachNowRepositoryZona;

    @Override
    public List<Zona> mostrarZona() throws IOException {
        return teachNowRepositoryZona.findAll();
    }

    @Override
    public Zona mostrarZonaPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryZona.findByIdZonaOrderById(id);
    }

}
