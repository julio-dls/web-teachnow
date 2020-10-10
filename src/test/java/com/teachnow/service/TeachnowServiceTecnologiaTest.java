
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.TeachnowApplication;
import com.teachnow.domain.Perfil;
import com.teachnow.domain.Tecnologia;
import com.teachnow.repository.TeachNowRepositoryTecnologia;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
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
public class TeachnowServiceTecnologiaTest {

    @Autowired
    private TeachNowServiceTecnologia teachNowServiceTecnologia;

    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Test
    public void agregarTecnologia_noExiste_tecnologia() {

        Perfil nPerfil = teachNowRepositoryPerfil.getOne(1);

        Tecnologia nTecnologia = new Tecnologia();
        nTecnologia.setNivel(10);
        nTecnologia.setTecnologia("html, css, javasceipt, php,MySQL, Derby, Oracle, MS SQL Server, PostgreSQL");
        nTecnologia.setPerfil(nPerfil);

        Tecnologia tecnologia = teachNowServiceTecnologia.guardarTecnologia(nTecnologia);
        assertEquals(tecnologia.getTecnologia(), "html, css, javasceipt, php,MySQL, Derby, Oracle, MS SQL Server, PostgreSQL");
        assertEquals(tecnologia.getNivel(), 10);
    }

    @Test
    public void buscarEstudioPorId_recuperarEstudioPorID_listaEstudio() throws IOException {
        List<Tecnologia> nTecnologia = teachNowServiceTecnologia.buscarTecnologiaPorId(1);
        assertEquals("html, css, javasceipt, php,MySQL, Derby, Oracle, MS SQL Server, PostgreSQL", nTecnologia.get(0).getTecnologia());
        int count = 0;
        for (Tecnologia tecnologia : nTecnologia) {
            System.out.println("tecnologia: " + nTecnologia.get(count).getTecnologia());
            count = +1;
        }
    }

    @Test
    public void eliminarTecnoloigaPorId_eliminarDeLista_tecnologiaEliminada() throws IOException {
        teachNowServiceTecnologia.eliminarTecnologiaPorId(10);
        List<Tecnologia> lTecnologias = teachNowServiceTecnologia.buscarTecnologiaPorId(10);
        assertTrue("Se esperaba al menos un producto", lTecnologias.isEmpty());
    }

}
