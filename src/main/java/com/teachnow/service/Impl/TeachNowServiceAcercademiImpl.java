/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Acercademi;
import com.teachnow.domain.Perfil;
import com.teachnow.repository.TeachNowRepositoryAcercademi;
import com.teachnow.service.TeachNowServiceAcercademi;
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
public class TeachNowServiceAcercademiImpl implements TeachNowServiceAcercademi {

    @Autowired
    private TeachNowRepositoryAcercademi teachNowRepositoryAcercademi;
    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Override
    public Acercademi guardarAcercademi(Acercademi acercademi) throws IllegalArgumentException {
        if (acercademi == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }  

        Perfil nPerfil = teachNowRepositoryPerfil.burcarPerfilPorId(acercademi.getPerfil().getId());
        Acercademi nAcercademi = new Acercademi();
        nAcercademi.setArea(acercademi.getArea());
        nAcercademi.setQuiensoy(acercademi.getQuiensoy());
        nAcercademi.setPerfil(nPerfil);

        return teachNowRepositoryAcercademi.save(nAcercademi);
    }

    @Override
    public List<Acercademi> buscarTodoAcercademi() throws IOException {
        return teachNowRepositoryAcercademi.findAll();
    }

    @Override
    public void eliminarAcercademiPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        teachNowRepositoryAcercademi.deleteById(id);
    }

    @Override
    public List<Acercademi> buscarAcercademiPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryAcercademi.findByIdAcercademiOrderById(id);
    }

}
