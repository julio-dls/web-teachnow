/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Habilidades;
import com.teachnow.domain.Perfil;
import com.teachnow.repository.TeachNowRepositoryHabilidades;
import com.teachnow.service.TeachNowServiceHabilidades;
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
public class TeachNowServiceHabilidadesImpl implements TeachNowServiceHabilidades {

    @Autowired
    private TeachNowRepositoryHabilidades teachNowRepositoryHabilidades;
    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Override
    public Habilidades guardarHabilidades(Habilidades habilidades) throws IllegalArgumentException {

        if (habilidades == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        Perfil nPerfil = teachNowRepositoryPerfil.getOne(habilidades.getPerfil().getId());

        Habilidades nHabilidades = new Habilidades();
        nHabilidades.setConocimientos(habilidades.getConocimientos());
        nHabilidades.setPerfil(nPerfil);

        return teachNowRepositoryHabilidades.save(nHabilidades);
    }

    @Override
    public List<Habilidades> buscarTodoHabilidades() throws IOException {
        return teachNowRepositoryHabilidades.findAll();
    }

    @Override
    public void eliminarHabilidades(Integer id) throws IOException {

        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        teachNowRepositoryHabilidades.deleteById(id);
    }

    @Override
    public List<Habilidades> buscarHabilidadesPorId(Integer id) throws IOException {

        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        return teachNowRepositoryHabilidades.findByIdperfilHabilidadesOrderById(id);
    }

}
