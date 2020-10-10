/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Provincia;
import com.teachnow.repository.TeachNowRepositoryProvincia;
import com.teachnow.service.TeachNowServiceProvincia;
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
public class TeachNowServiceProvinciaImpl implements TeachNowServiceProvincia {

    @Autowired
    private TeachNowRepositoryProvincia teachNowRepositoryProvincia;

    @Override
    public List<Provincia> mostrarProvincia() throws IOException {
        return teachNowRepositoryProvincia.findAll();
    }

    @Override
    public Provincia mostrarProvinciaPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryProvincia.findByIdProvinciadOrderById(id);
    }

}
