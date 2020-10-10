/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.TeachnowApplication;
import com.teachnow.domain.Estudio;
import com.teachnow.domain.Perfil;
import com.teachnow.repository.TeachNowRepositoryEstudio;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
public class TeachnowServiceEstudioTest {

    @Autowired
    private TeachNowServiceEstudio teachNowServiceEstudio;

    @Autowired
    private TeachNowRepositoryEstudio teachNowRepositoryEstudio;

    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Test
    public void agregarUnEstudio_noExiste_estudio() throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaGraduacion = format.parse("2002-11-11");
        Date fechainicio = format.parse("2002-11-11");

        Perfil nPerfil = teachNowRepositoryPerfil.getOne(2);

        Estudio nEstudio = new Estudio();
        nEstudio.setEstado("Cursando");
        nEstudio.setInstituto("Escuela Da Vinci");
        nEstudio.setFechagraduacion(fechaGraduacion);
        nEstudio.setFechainicio(fechainicio);
        nEstudio.setTitulo("Analista de Sistemas");
        nEstudio.setNivelestudio("Terciario");
        nEstudio.setCarrera("Tecnico Informatico");
        nEstudio.setPerfil(nPerfil);

        Estudio estudio = teachNowServiceEstudio.guardarEstudio(nEstudio);
        assertEquals(estudio.getNivelestudio(), "Terciario");
    }

    @Test
    public void eliminarEstudio_seEncuentraEnLaLista_estudioEliminado() throws IOException {
        teachNowServiceEstudio.eliminarEstudio(2);
        assertNotEquals(2, teachNowRepositoryEstudio.findById(2));
    }

    @Test
    public void busarEstudio_recuperarTodoLosEstudio_listaEstuido() throws IOException {
        List<Estudio> estudios = teachNowServiceEstudio.buscarTodoEstudio();
        assertEquals("Maestria", estudios.get(1).getEstado());
    }

    @Test
    public void buscarEstudioPorId_recuperarEstudioPorID_listaEstudio() throws IOException {
        List<Estudio> estudios = teachNowServiceEstudio.buscarEstudioPorId(115);
        int count = 0;
        for (Estudio estudio : estudios) {
            System.out.println("Estudios: " + estudios.get(count).getNivelestudio());
            count = +1;
        }
    }
}
