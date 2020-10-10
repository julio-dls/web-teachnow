/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.TeachnowApplication;
import com.teachnow.domain.Empleo;
import com.teachnow.domain.Perfil;
import com.teachnow.repository.TeachNowRepositoryEmpleo;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.transaction.Transactional;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.teachnow.repository.TeachNowRepositoryPerfil;

/**
 *
 * @author jdls
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TeachnowApplication.class)
@Transactional
public class TeachnowServiceEmpleoTest {

    @Autowired
    private TeachNowServiceEmpleo teachNowServiceEmpleo;

    @Autowired
    private TeachNowRepositoryEmpleo teachNowRepositoryEmpleo;

    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Test
    public void agregarNuevoEmpleo_noExiste_empleo() throws ParseException, IOException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Date fechafin = format.parse("2002-11-11");
        Date fechainicio = format.parse("2012-12-12");

        Perfil nPerfil = teachNowRepositoryPerfil.getOne(2);

        Empleo nEmpleo = new Empleo();
        nEmpleo.setEmpresa("Google");
        nEmpleo.setFechafin(fechafin);
        nEmpleo.setFechainicio(fechainicio);
        nEmpleo.setCargo("Arquitecto de sistemas");
        nEmpleo.setResponsabilidad("Servir de interfaz con los usuarios y patrocinadores, así como cualquier otro que está involucrado en determinar sus necesidades");
        nEmpleo.setPerfil(nPerfil);

        Empleo empleo = teachNowServiceEmpleo.guardarEmpleo(nEmpleo);
        assertEquals(empleo.getEmpresa(), "Google");
        assertEquals(empleo.getCargo(), "Arquitecto de sistemas");
    }

    @Test
    public void eliminarEmpleo_listaDeEmpleos_empledoEliminado() throws IOException {
        teachNowServiceEmpleo.eliminarEmpleo(2);
        assertNotEquals(2, teachNowRepositoryEmpleo.findById(2));

    }
}
