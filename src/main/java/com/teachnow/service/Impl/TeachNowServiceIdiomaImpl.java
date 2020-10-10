/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Idioma;
import com.teachnow.domain.Perfil;
import com.teachnow.repository.TeachNowRepositoryIdioma;
import com.teachnow.service.TeachNowServiceIdioma;
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
public class TeachNowServiceIdiomaImpl implements TeachNowServiceIdioma {

    @Autowired
    private TeachNowRepositoryIdioma teachNowRepositoryIdioma;
    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Override
    public Idioma guardarIdioma(Idioma idioma) throws IllegalArgumentException {

        if (idioma == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        Perfil nPerfil = teachNowRepositoryPerfil.getOne(idioma.getPerfil().getId());

        Idioma nIdioma = new Idioma();
        nIdioma.setIdioma(idioma.getIdioma());
        nIdioma.setNivel(idioma.getNivel());
        nIdioma.setPerfil(nPerfil);

        return teachNowRepositoryIdioma.save(nIdioma);
    }

    @Override
    public List<Idioma> buscarTodoIdioma() throws IOException {
        return teachNowRepositoryIdioma.findAll();
    }

    @Override
    public void eliminarIdiomaPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        teachNowRepositoryIdioma.deleteById(id);
    }

    @Override
    public List<Idioma> buscarIdiomaPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryIdioma.findByIdperfilIdiomaOrderById(id);
    }

}
