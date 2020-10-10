/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.TeachnowApplication;
import com.teachnow.domain.Habilidades;
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
public class TeachnowServiceHabilidadesTest {

    @Autowired
    private TeachNowServiceHabilidades teachNowServiceHabilidades;

    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;

    @Test
    public void agregarHabilidades_noExiste_habilidades() {

        Perfil nPerfil = teachNowRepositoryPerfil.getOne(1);

        Habilidades nHabilidades = new Habilidades();
        nHabilidades.setConocimientos("capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.");
        nHabilidades.setPerfil(nPerfil);

        Habilidades habilidades = teachNowServiceHabilidades.guardarHabilidades(nHabilidades);
        assertEquals(habilidades.getConocimientos(), "capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.");
    }

    @Test
    public void buscarHabilidadesPorId_recuperarHabilidadesPorID_listaHabilidades() throws IOException {
        List<Habilidades> nHabilidades = teachNowServiceHabilidades.buscarHabilidadesPorId(1);
        assertEquals("capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.", nHabilidades.get(0).getConocimientos());
        int count = 0;
        for (Habilidades habilidades : nHabilidades) {
            System.out.println("tecnologia: " + nHabilidades.get(count).getConocimientos());
            count = +1;
        }
    }

    @Test
    public void eliminarHabilidadesPorId_eliminarHabilidadesDeLista_habilidadesEliminada() throws IOException {
        teachNowServiceHabilidades.eliminarHabilidades(3);
        List<Habilidades> lHabilidades = teachNowServiceHabilidades.buscarHabilidadesPorId(3);
        assertTrue("Se esperaba al menos un producto", lHabilidades.isEmpty());
    }
}
