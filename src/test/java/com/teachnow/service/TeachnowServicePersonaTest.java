/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.TeachnowApplication;
import com.teachnow.domain.Permiso;
import com.teachnow.domain.Persona;
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

/**
 *
 * @author jdls
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TeachnowApplication.class)
@Transactional
public class TeachnowServicePersonaTest {

    @Autowired
    private TeachNowServicePersona teachNowServicePersona;

    @Test
    public void agregarNuevaPersona_pernosaNoCargadaAnteriormente_persona() throws IOException, ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = format.parse("2000-09-15");

        Permiso nuevoPermiso = new Permiso();
        nuevoPermiso.setPassword("qwerty05*");
        nuevoPermiso.setUsername("quirogajulio27@gmail.com");

        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Patricia");
        nuevaPersona.setApellido("Santana");
        nuevaPersona.setTelefono("");
        nuevaPersona.setFechanacimiento(fecha);
        nuevaPersona.setNacionalidad("Argentino");
        nuevaPersona.setRegion("CABA");
        nuevaPersona.setCiudad("Buenos Aires");
        nuevaPersona.setGenero("M");
//        nuevaPersona.setPermiso(nuevoPermiso);

        Persona persona = teachNowServicePersona.guardarPersona(nuevaPersona);
        assertEquals(persona.getNombre(), "Patricia");
        assertEquals(persona.getApellido(), "Santana");
    }

    @Test
    public void obtenerDetallesUsuario_devuelvePersona_lanzaExepcion() throws IllegalArgumentException {
        Persona nPersona = teachNowServicePersona.obtenerDetallesUsuario("julio.quiroga@davinci.edu.ar");
        assertNotNull("The object you enter return null", nPersona);
    }

    @Test
    public void obtenerPrivilegioPerfilPorEmail_devuelveStringPrivilegio_devuelveAnonymousPrivilegio() throws IllegalArgumentException {
        String privilegio = teachNowServicePersona.obtenerPrivilegioPerfifPorEmail("julio.quiroga@davinci.edu.ar");
        assertEquals("anonymous", privilegio);
    }
}
