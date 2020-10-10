/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.TeachnowApplication;
import com.teachnow.domain.Acercademi;
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
import java.util.Map;

/**
 *
 * @author jdls
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TeachnowApplication.class)
@Transactional
public class TeachnowServiceAcercademiTest {

    @Autowired
    private TeachNowServiceAcercademi teachNowServiceAcercademi;

    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Test
    public void agregarAcercademi_noExiste_acercademi() throws IOException {

        Perfil nPerfil = teachNowRepositoryPerfil.burcarPerfilPorId(9);

        Acercademi nAcercademi = new Acercademi();
        nAcercademi.setArea("Técnico laboral en gestión de negocios.");
        nAcercademi.setQuiensoy("Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales."
                + "Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.");
        nAcercademi.setPerfil(nPerfil);

        Acercademi acercademi = teachNowServiceAcercademi.guardarAcercademi(nAcercademi);
        assertEquals(acercademi.getArea(), "Técnico laboral en gestión de negocios.");
    }

//    @Test
//    public void buscarAcercademiPorId_recuperarAcercademiPorID_listaAcercademi() throws IOException {
//
//        List<Acercademi> nAcercademi = teachNowServiceAcercademi.buscarAcercademiPorId(1);
//        assertEquals("Técnico laboral en gestión de negocios", nAcercademi.get(0).getArea());
//
//        for (Acercademi acercademi : nAcercademi) {
//            System.out.println("tecnologia: " + acercademi.getQuiensoy());
//        }
//    }
//
//    @Test
//    public void eliminarAcercademiPorId_eliminarDeLista_acercademiEliminada() throws IOException {
//        teachNowServiceAcercademi.eliminarAcercademiPorId(5);
//        List<Acercademi> lAcercademi = teachNowServiceAcercademi.buscarAcercademiPorId(5);
//        assertTrue("Se esperaba al vacia", lAcercademi.isEmpty());
//    }
//
//    @Test
//    public void buscarPerfilPorId_retornaAcercaDeMi_noEncuentreLanzaExcepcion() throws IOException {
//        List<Acercademi> lAcercademi = teachNowServiceAcercademi.buscarAcercademiPorId(9);
//        assertTrue("No se esperaba Vacio",lAcercademi.isEmpty());
//        lAcercademi.forEach(action -> {
//            System.out.println("Quien Soy: " + action.getQuiensoy());
//        });
//    }
}
