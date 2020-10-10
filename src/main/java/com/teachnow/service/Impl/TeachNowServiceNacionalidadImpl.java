/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Nacionalidad;
import com.teachnow.repository.TeachNowRepositoryNacionalidad;
import com.teachnow.service.TeachNowServiceNacionalidad;
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
public class TeachNowServiceNacionalidadImpl implements TeachNowServiceNacionalidad {

    @Autowired
    private TeachNowRepositoryNacionalidad teachNowRepositoryNacionalidad;

    @Override
    public List<Nacionalidad> mostrarNacionalidad() throws IOException {
        return teachNowRepositoryNacionalidad.findAll();
    }

}
