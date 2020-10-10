/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Estudio;
import com.teachnow.domain.Perfil;
import com.teachnow.repository.TeachNowRepositoryEstudio;
import com.teachnow.service.TeachNowServiceEstudio;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
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
public class TeachNowServiceEstudioImpl implements TeachNowServiceEstudio {

    @Autowired
    private TeachNowRepositoryEstudio teachNowRepositoryEstudio;
    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Override
    public Estudio guardarEstudio(Estudio estudio) throws IllegalArgumentException {

        if (estudio == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        Perfil nPerfil = teachNowRepositoryPerfil.getOne(estudio.getPerfil().getId());

        Estudio nEstudio = new Estudio();
        nEstudio.setEstado(estudio.getEstado());
        nEstudio.setInstituto(estudio.getInstituto());
        nEstudio.setFechagraduacion(estudio.getFechainicio());
        nEstudio.setFechainicio(estudio.getFechainicio());
        nEstudio.setTitulo(estudio.getTitulo());
        nEstudio.setNivelestudio(estudio.getNivelestudio());
        nEstudio.setCarrera(estudio.getCarrera());
        nEstudio.setPerfil(nPerfil);

        return teachNowRepositoryEstudio.save(nEstudio);
    }

    @Override
    public List<Estudio> buscarTodoEstudio() throws IOException {
        return teachNowRepositoryEstudio.findAll();
    }

    @Override
    public void eliminarEstudio(int id) throws IOException {
        if (id == 0) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        teachNowRepositoryEstudio.deleteById(id);
    }

    @Override
    public List<Estudio> buscarEstudioPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryEstudio.findByidperfilEstudioOrderById(id);
    }

}
