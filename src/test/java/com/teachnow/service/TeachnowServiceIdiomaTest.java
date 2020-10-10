/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.TeachnowApplication;
import com.teachnow.domain.Idioma;
import com.teachnow.domain.Perfil;
import java.io.IOException;
import java.util.List;
import javax.transaction.Transactional;
import static org.junit.Assert.assertEquals;
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
public class TeachnowServiceIdiomaTest {

    @Autowired
    private TeachNowServiceIdioma teachNowServiceIdioma;
    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Test
    public void agregarIdioma_noExiste_idioma() {

        Perfil nPerfil = teachNowRepositoryPerfil.getOne(1);

        Idioma nIdioma = new Idioma();
        nIdioma.setIdioma("Ingles");
        nIdioma.setNivel("Avanzado");
        nIdioma.setPerfil(nPerfil);

        Idioma idioma = teachNowServiceIdioma.guardarIdioma(nIdioma);
        assertEquals(idioma.getIdioma(), "Ingles");
        assertEquals(idioma.getNivel(), "Avanzado");
    }

    @Test
    public void buscarIdiomaPorId_recuperarIdiomaPorID_listaIdioma() throws IOException {
        List<Idioma> nIdioma = teachNowServiceIdioma.buscarIdiomaPorId(1);
        assertEquals("Ingles", nIdioma.get(0).getIdioma());
        int count = 0;
        for (Idioma idioma : nIdioma) {
            System.out.println("Ingles: " + nIdioma.get(count).getIdioma());
            count = +1;
        }
    }

    @Test
    public void eliminarIdiomaPorId_eliminarDeLista_idiomaEliminado() throws IOException {
        teachNowServiceIdioma.eliminarIdiomaPorId(6);
        List<Idioma> lTecnologias = teachNowServiceIdioma.buscarIdiomaPorId(6);
        assertTrue("Se esperaba al menos un producto", lTecnologias.isEmpty());
    }
}
