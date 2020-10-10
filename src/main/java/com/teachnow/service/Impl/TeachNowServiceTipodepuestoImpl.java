/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Tipodepuesto;
import com.teachnow.repository.TeachNowRepositoryTipodepuesto;
import com.teachnow.service.TeachNowServiceTipodepuesto;
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
public class TeachNowServiceTipodepuestoImpl implements TeachNowServiceTipodepuesto {

    @Autowired
    private TeachNowRepositoryTipodepuesto teachNowRepositoryTipodepuesto;

    @Override
    public List<Tipodepuesto> mostraTipodepuesto() throws IOException {
        return teachNowRepositoryTipodepuesto.findAll();
    }

    @Override
    public Tipodepuesto mostraTipodepuestoPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryTipodepuesto.findByIdTipodepuestoOrderById(id);
    }
}
