/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Categoriatecno;
import java.io.IOException;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teachnow.service.TeachNowServiceCategoriatecno;
import com.teachnow.repository.TeachNowRepositoryCategoriatecno;
import com.teachnow.repository.TeachNowRepositorySubcategoriatecno;

/**
 *
 * @author jdls
 */
@Service
@Transactional
public class TeachNowServiceCategoriatecnoImpl implements TeachNowServiceCategoriatecno {

    @Autowired
    private TeachNowRepositoryCategoriatecno teachNowRepositoryCategoriatecno;
    @Autowired
    private TeachNowRepositorySubcategoriatecno teachNowRepositorySubcategoriatecno;

    @Override
    public Categoriatecno guardarCategoriatecno(Categoriatecno categoriatecno) throws IllegalArgumentException {

        if (categoriatecno == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        Categoriatecno nCategoriatecno = new Categoriatecno();
        nCategoriatecno.setCategoria(categoriatecno.getCategoria());
        nCategoriatecno.setSubcategoriatecno(categoriatecno.getSubcategoriatecno());

        return teachNowRepositoryCategoriatecno.save(nCategoriatecno);
    }

    @Override
    public List<Categoriatecno> mostrarTodoCategoriatecno() throws IOException {
        return teachNowRepositoryCategoriatecno.findAll();
    }

    @Override
    public void eliminarCategoriatecnoPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        teachNowRepositoryCategoriatecno.deleteById(id);
    }
}
