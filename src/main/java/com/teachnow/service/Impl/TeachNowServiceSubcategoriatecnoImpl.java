/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Subcategoriatecno;
import com.teachnow.domain.Categoriatecno;
import java.io.IOException;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teachnow.service.TeachNowServiceSubcategoriatecno;
import com.teachnow.repository.TeachNowRepositoryCategoriatecno;
import com.teachnow.repository.TeachNowRepositorySubcategoriatecno;

/**
 *
 * @author jdls
 */
@Service
@Transactional
public class TeachNowServiceSubcategoriatecnoImpl implements TeachNowServiceSubcategoriatecno {

    @Autowired
    private TeachNowRepositoryCategoriatecno teachNowRepositoryCategoriatecno;

    @Autowired
    private TeachNowRepositorySubcategoriatecno teachNowRepositorySubcategoriatecno;

    @Override
    public Subcategoriatecno guardarTecnologia(Subcategoriatecno subcategoriatecno) throws IllegalArgumentException {
        if (subcategoriatecno == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        Categoriatecno nTecnologia = teachNowRepositoryCategoriatecno.getOne(subcategoriatecno.getCategoriatecno().getId());

        Subcategoriatecno nSubtecnologia = new Subcategoriatecno();
        nSubtecnologia.setNombre(subcategoriatecno.getNombre());
        nSubtecnologia.setCategoriatecno(nTecnologia);

        return teachNowRepositorySubcategoriatecno.save(nSubtecnologia);
    }

    @Override
    public List<Subcategoriatecno> mostrarTodoSubcategoriatecno() throws IOException {
        return teachNowRepositorySubcategoriatecno.findAll();
    }

    @Override
    public void eliminarSubcategoriatecnoPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        teachNowRepositorySubcategoriatecno.deleteById(id);
    }

    @Override
    public List<Subcategoriatecno> buscarSubcategoriatecnoPorId(Integer id) throws IOException {
        return teachNowRepositorySubcategoriatecno.findByIdcategoriatecnoSubcategoriatecnoById(id);
    }
}
