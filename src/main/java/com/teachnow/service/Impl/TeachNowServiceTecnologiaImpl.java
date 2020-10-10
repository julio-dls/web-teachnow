    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Perfil;
import com.teachnow.domain.Tecnologia;
import com.teachnow.repository.TeachNowRepositoryTecnologia;
import com.teachnow.service.TeachNowServiceTecnologia;
import java.io.IOException;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teachnow.repository.TeachNowRepositoryPerfil;

/**
 *
 * @author jdls
 */
@Service
@Transactional
public class TeachNowServiceTecnologiaImpl implements TeachNowServiceTecnologia {

    @Autowired
    private TeachNowRepositoryTecnologia teachNowRepositoryTecnologia;
    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Override
    public Tecnologia guardarTecnologia(Tecnologia tecnologia) throws IllegalArgumentException {

        if (tecnologia == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        Perfil nPerfil = teachNowRepositoryPerfil.getOne(tecnologia.getPerfil().getId());

        Tecnologia nTecnologia = new Tecnologia();
        nTecnologia.setNivel(tecnologia.getNivel());
        nTecnologia.setTecnologia(tecnologia.getTecnologia());
        nTecnologia.setPerfil(nPerfil);

        return teachNowRepositoryTecnologia.save(nTecnologia);
    }

    @Override
    public List<Tecnologia> buscarTodoTecnologia() throws IOException {
        return teachNowRepositoryTecnologia.findAll();
    }

    @Override
    public void eliminarTecnologiaPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        teachNowRepositoryTecnologia.deleteById(id);
    }

    @Override
    public List<Tecnologia> buscarTecnologiaPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryTecnologia.findByIdperfilTecnologiaOrderById(id);
    }
}