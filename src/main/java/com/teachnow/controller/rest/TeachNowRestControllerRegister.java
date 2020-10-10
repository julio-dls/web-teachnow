/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller.rest;

import com.teachnow.domain.Acercademi;
import com.teachnow.domain.Empleo;
import com.teachnow.domain.Estudio;
import com.teachnow.domain.Habilidades;
import com.teachnow.domain.Idioma;
import com.teachnow.domain.Subcategoriatecno;
import com.teachnow.domain.Tecnologia;
import com.teachnow.service.TeachNowServiceAcercademi;
import com.teachnow.service.TeachNowServiceCv;
import com.teachnow.service.TeachNowServiceEmpleo;
import com.teachnow.service.TeachNowServiceEstudio;
import com.teachnow.service.TeachNowServiceFotoCv;
import com.teachnow.service.TeachNowServiceHabilidades;
import com.teachnow.service.TeachNowServiceIdioma;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.teachnow.service.TeachNowServiceSubcategoriatecno;
import com.teachnow.service.TeachNowServiceTecnologia;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jdls
 */
@RestController
@RequestMapping("register/api")
public class TeachNowRestControllerRegister {

    @Autowired
    private TeachNowServiceEmpleo teachNowServiceEmpleo;
    @Autowired
    private TeachNowServiceEstudio teachNowServiceEstudio;
    @Autowired
    private TeachNowServiceTecnologia teachNowServiceTecnologia;
    @Autowired
    private TeachNowServiceIdioma teachNowServiceIdioma;
    @Autowired
    private TeachNowServiceHabilidades teachNowServiceHabilidades;
    @Autowired
    private TeachNowServiceCv teachNowServiceCv;
    @Autowired
    private TeachNowServiceAcercademi teachNowServiceAcercademi;
    @Autowired
    private TeachNowServiceFotoCv teachNowServiceFotoCv;
    @Autowired
    private TeachNowServiceSubcategoriatecno teachNowServiceSubcategoriatecno;

    @PostMapping("/empleo")
    public Empleo guardar(@RequestBody Empleo empleo) throws IOException {
        if (empleo == null) {
            throw new IllegalArgumentException("No se aceptan valores");
        }
        return teachNowServiceEmpleo.guardarEmpleo(empleo);
    }

    @DeleteMapping("/empleoEliminar/{id}")
    public void eliminarEempleo(@PathVariable("id") Integer id) throws IOException {
        if (id == 0) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        teachNowServiceEmpleo.eliminarEmpleo(id);
    }

    @PostMapping("/estudio")
    public Estudio guardar(@RequestBody Estudio estudio) throws IOException {
        if (estudio == null) {
            throw new IllegalArgumentException("No se aceptan valores");
        }
        return teachNowServiceEstudio.guardarEstudio(estudio);
    }

    @DeleteMapping("/estudioEliminar/{id}")
    public void eliminarEstudio(@PathVariable("id") Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        teachNowServiceEstudio.eliminarEstudio(id);
    }

    @PostMapping("/tecnologia")
    public Tecnologia guardar(@RequestBody Tecnologia tecnologia) throws IOException {
        if (tecnologia == null) {
            throw new IllegalArgumentException("No se aceptan valores");
        }
        return teachNowServiceTecnologia.guardarTecnologia(tecnologia);
    }

    @DeleteMapping("/tecnologiaEliminar/{id}")
    public void eliminarTecnologia(@PathVariable("id") Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        teachNowServiceTecnologia.eliminarTecnologiaPorId(id);
    }

    @PostMapping("/idioma")
    public Idioma guardar(@RequestBody Idioma idioma) throws IOException {
        if (idioma == null) {
            throw new IllegalArgumentException("No se aceptan valores");
        }
        return teachNowServiceIdioma.guardarIdioma(idioma);
    }

    @DeleteMapping("/idiomaEliminar/{id}")
    public void eliminarIdioma(@PathVariable("id") Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        teachNowServiceIdioma.eliminarIdiomaPorId(id);
    }

    @PostMapping("/habilidades")
    public Habilidades guardar(@RequestBody Habilidades habilidades) throws IOException {
        if (habilidades == null) {
            throw new IllegalArgumentException("No se aceptan valores");
        }
        return teachNowServiceHabilidades.guardarHabilidades(habilidades);
    }

    @DeleteMapping("/habilidadesEliminar/{id}")
    public void eliminarHabilidades(@PathVariable("id") Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        teachNowServiceHabilidades.eliminarHabilidades(id);
    }

    @PostMapping("/cv")
    public void guardar(@RequestParam("fileCv") MultipartFile file, @RequestParam("adjuntarCvId") Integer adjuntarCvId, @RequestParam("adjuntarCvNombre") String adjuntarCvNombre,
            @RequestParam("adjuntarCvApellido") String adjuntarCvApellido, HttpServletResponse response) throws IOException {

        teachNowServiceCv.guardarArchivo(file, adjuntarCvId, adjuntarCvNombre, adjuntarCvApellido);

        response.sendRedirect("/teachnow/register/" + adjuntarCvId);
        response.setStatus(200);

    }

    @PostMapping("/image")
    public void guardarImagen(@RequestParam("fotoCv") MultipartFile image, @RequestParam("fotoIdCv") Integer id, HttpServletResponse response) throws IOException {
        teachNowServiceFotoCv.guardarImagenCv(image, id);
        response.sendRedirect("/teachnow/register/" + id);
        response.setStatus(200);
    }

    @DeleteMapping("/acercademiEliminar/{id}")
    public void eliminarAcercademi(@PathVariable("id") Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        teachNowServiceAcercademi.eliminarAcercademiPorId(id);
    }

    @PostMapping("/acercademi")
//    @RequestMapping(value = "/acercademi", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Acercademi guardar(@RequestBody Acercademi acercademi) throws IOException {
        if (acercademi == null) {
            throw new IllegalArgumentException("No se aceptan valores");
        }
        System.out.println("Acerca de mi: " + acercademi.getArea());
        return teachNowServiceAcercademi.guardarAcercademi(acercademi);
    }

    @RequestMapping(value = "/buscar/{id}", method = RequestMethod.GET)
    public List<Subcategoriatecno> buscarCategoriatecoPorId(@PathVariable("id") Integer id, Model model) throws IOException {
        if (id == null || id == 0) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowServiceSubcategoriatecno.buscarSubcategoriatecnoPorId(id);
    }
}
