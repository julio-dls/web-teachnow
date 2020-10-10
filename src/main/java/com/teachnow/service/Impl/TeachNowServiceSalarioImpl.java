/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Salario;
import com.teachnow.repository.TeachNowRepositorySalario;
import com.teachnow.service.TeachNowServiceSalario;
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
public class TeachNowServiceSalarioImpl implements TeachNowServiceSalario {

    @Autowired
    private TeachNowRepositorySalario teachNowRepositorySalario;

    @Override
    public List<Salario> mostrarSalario() throws IOException {
        return teachNowRepositorySalario.findAll();
    }

    @Override
    public Salario mostrarSalarioPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositorySalario.findByIdSalarioOrderById(id);
    }

}
