package com.teachnow.service;

import com.teachnow.TeachnowApplication;
import com.teachnow.domain.Empleo;
import com.teachnow.domain.Estudio;
import com.teachnow.domain.Perfil;
import com.teachnow.domain.Permiso;
import com.teachnow.domain.Persona;
import com.teachnow.domain.Tecnologia;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TeachnowApplication.class)
@Transactional
public class TeachnowServicePerfilTest {

    @Autowired
    private TeachNowServicePerfil teachNowServicePerfil;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void agragarNuevoPerfil_noExistePerfi_Perfil() throws IOException, ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        Date fecha = format.parse("04-11-1985");

        Permiso nPermiso = new Permiso();
        nPermiso.setPassword("qwerty");
        nPermiso.setUsername("quirogajulio27@gmail.com");

        Persona nPersona = new Persona();
        nPersona.setNombre("Julio");
        nPersona.setApellido("Quiroga");
        nPersona.setFechanacimiento(fecha);
        nPersona.setTelefono("");
        nPersona.setDireccion("Tucuman 3172");
        nPersona.setNacionalidad("Argentina");
//        nPersona.setPermiso(nPermiso);

        Perfil nPerfil = new Perfil();
        nPerfil.setPersona(nPersona);

        Tecnologia nTecnologia = new Tecnologia();
        nTecnologia.setNivel(5);
        nTecnologia.setTecnologia("java Spring");
        nTecnologia.setPerfil(nPerfil);

        Tecnologia nTecnologiaX = new Tecnologia();
        nTecnologiaX.setNivel(5);
        nTecnologiaX.setTecnologia("java Spring");
        nTecnologiaX.setPerfil(nPerfil);

        Empleo nEmpleo = new Empleo();
        nEmpleo.setCargo("Jefe De personal");
        nEmpleo.setPerfil(nPerfil);

        Estudio eEstudio = new Estudio();
        eEstudio.setNivelestudio("Posgrado");
        eEstudio.setPerfil(nPerfil);

        Estudio eEstudioX = new Estudio();
        eEstudioX.setNivelestudio("Maestria");
        eEstudioX.setPerfil(nPerfil);

        List<Tecnologia> lTecnologia = new ArrayList<>();
        lTecnologia.add(nTecnologia);
        lTecnologia.add(nTecnologiaX);

        List<Empleo> lEmpleo = new ArrayList<>();
        lEmpleo.add(nEmpleo);

        List<Estudio> lEstudio = new ArrayList<>();
        lEstudio.add(eEstudioX);
        lEstudio.add(eEstudio);

        Perfil perfil = teachNowServicePerfil.guardarPerfil(nPersona, lEstudio, lTecnologia, lEmpleo);
        assertEquals("Julio", perfil.getPersona().getNombre());
        assertEquals("Maestria", perfil.getEstudios().get(0).getNivelestudio());
    }

    @Test
    public void agregarPerfil_sinTecnologiaEmpleoEstudio_nuevoPerfil() throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        Date fecha = format.parse("04-11-1985");

        Permiso nPermiso = new Permiso();
        nPermiso.setPassword(passwordEncoder.encode("1234"));
        nPermiso.setUsername("quirogajulio27@gmail.com");
        nPermiso.setPrivilegios("institucion");

        Persona nPersona = new Persona();
        nPersona.setNombre("Patricia");
        nPersona.setApellido("Santana");
        nPersona.setFechanacimiento(fecha);
        nPersona.setTelefono("");
        nPersona.setDireccion("Tucuman 3172");
        nPersona.setNacionalidad("España");
        nPersona.setPermiso(nPermiso);
        nPersona.setPais("");
        nPersona.setCiudad("");
        nPersona.setRegion("");
        nPersona.setLicconducir("");
        nPersona.setCp("");

        teachNowServicePerfil.guardarPerfilPersona(nPersona);
//        assertEquals("Patricia", perfil.getPersona().getNombre());
    }

    @Test
    public void modificarPerfil_actualizaPerfilYSusRelaciones_lanzaExcepcion() throws IOException {
        Persona personaModificar = new Persona();

        personaModificar.setId(2);
        personaModificar.setNombre("Osbaldo");
        personaModificar.setApellido("Marquicio");

        Perfil perfil = teachNowServicePerfil.modificarPerfil(personaModificar);
        assertEquals("Osbaldo", perfil.getPersona().getNombre());
    }

    @Test
    public void buscarPerfilPorNombre_devuelveListaDePerfil_lanzaExcepcion() throws IOException {
        List<Perfil> perfiles = teachNowServicePerfil.buscarPerfilPorNombre("Julio");
        assertEquals(Arrays.asList("Julio"), Arrays.asList(perfiles.get(1).getPersona().getNombre()));
    }

    @Test
    public void buscarTodo_devuelveListaDePerfiles_lanzaExcepcion() throws IOException {
        List<Perfil> perfiles = teachNowServicePerfil.buscarTodo();
        assertEquals("Patricia", perfiles.get(1).getPersona().getNombre());
    }

    @Test
    public void eliminarPerfil_eliminaPerfilConExito_lanzaExcepcion() throws IOException {
        teachNowServicePerfil.eliminarPerfil(2);
    }

    @Test
    public void buscarPorId_encuentraPerfil_lanzaExcepcion() throws IOException {
        assertEquals("Patricia", teachNowServicePerfil.buscarPorId(1).getPersona().getNombre());
    }

    @Test
    public void buscarTodoPorPerfil_encuentraPerfil_lanzaExepcion() throws IOException {
        List<Perfil> listaPerfiles = teachNowServicePerfil.buscarTodoPerfil();

        listaPerfiles.forEach((listaPerfil) -> {
            System.out.println("Lista de Perfiles: " + listaPerfil.getPersona().getNombre());
        });
    }

    @Test
    public void buscarPerfilPorPalabraClave_encuentraPerfil_lanzaExepcion() throws IOException {
        Pageable pageable = PageRequest.of(1, 10);
        List<Perfil> listaPerfiles = (List<Perfil>) teachNowServicePerfil.buscarPerfilPorPalabraClave("primaria", pageable);

        listaPerfiles.forEach((listaPerfil) -> {
            System.out.println("Perfil por Palabra Clave: " + listaPerfil.getPersona().getApellido());
        });
    }
}
