/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Empleo;
import com.teachnow.domain.Perfil;
import com.teachnow.repository.TeachNowRepositoryEmpleo;
import com.teachnow.service.TeachNowServiceEmpleo;
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
public class TeachNowServiceEmpleoImpl implements TeachNowServiceEmpleo {

    @Autowired
    private TeachNowRepositoryEmpleo teachNowRepositoryEmpleo;
    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Override
    public Empleo guardarEmpleo(Empleo empleo) throws IllegalArgumentException {

        if (empleo == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        Perfil nPerfil = teachNowRepositoryPerfil.getOne(empleo.getPerfil().getId());

        Empleo nEmpleo = new Empleo();
        nEmpleo.setEmpresa(empleo.getEmpresa());
        nEmpleo.setFechafin(empleo.getFechafin());
        nEmpleo.setFechainicio(empleo.getFechainicio());
        nEmpleo.setCargo(empleo.getCargo());
        nEmpleo.setResponsabilidad(empleo.getResponsabilidad());
        nEmpleo.setPerfil(nPerfil);
        
        return teachNowRepositoryEmpleo.save(nEmpleo);
    }

    @Override
    public List<Empleo> buscarTodoEmpleo() throws IOException {
        return teachNowRepositoryEmpleo.findAll();
    }

    @Override
    public void eliminarEmpleo(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        teachNowRepositoryEmpleo.deleteById(id);
    }

    @Override
    public List<Empleo> buscarEmpleoPorId(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryEmpleo.findByIdperfilEmpleoOrderById(id);
    }
}
