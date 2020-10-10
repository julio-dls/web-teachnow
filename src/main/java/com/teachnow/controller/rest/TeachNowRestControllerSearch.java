/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller.rest;

import com.teachnow.domain.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teachnow.service.TeachNowServicePerfil;
import java.io.IOException;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.annotation.Secured;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jdls
 */
@RestController
@RequestMapping("/search/buscar/api")
public class TeachNowRestControllerSearch {

    @Autowired
    private TeachNowServicePerfil teachNowServicePerfil;

    @Secured("institucion")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Perfil> mostrarTodo(Model model) throws IOException {
        return teachNowServicePerfil.buscarTodo();
    }

    @Secured("institucion")
    @RequestMapping(value = "/{idPerfil}", method = RequestMethod.GET, produces = "application/json")
    public Perfil mostrarPorId(@PathVariable("idPerfil") Integer idPerfil) throws IOException {
        if (idPerfil == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        return teachNowServicePerfil.buscarPorId(idPerfil);
    }

    @Secured("institucion")
    @RequestMapping(value = "/{palabraClave}/{page}", method = RequestMethod.GET, produces = "application/json")
    public List<Perfil> buscarPorPalabraClave(@PathVariable("palabraClave") String palabraClave, @PathVariable("page") Integer page, Model model) throws IOException {

        if (palabraClave == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarPerfilPorPalabraClave(palabraClave, pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("pages", page);
        model.addAttribute("current", page + 1);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);

        return listPerfil.getContent();
    }

    @Secured("institucion")
    @RequestMapping(value = "/salario/{idfiltro}/{page}", method = RequestMethod.GET, produces = "application/json")
    public List<Perfil> buscarPorIdFiltroSalario(@PathVariable("idfiltro") Integer idSalario, @PathVariable("page") Integer page, Model model) throws IOException {

        if (idSalario == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarPerfilPorFiltrosSalario(page, pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("pages", page);
        model.addAttribute("current", page + 1);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);

        return listPerfil.getContent();
    }

    @Secured("institucion")
    @RequestMapping(value = "/nivel/{idfiltro}/{page}", method = RequestMethod.GET, produces = "application/json")
    public List<Perfil> buscarPorIdFiltroNivel(@PathVariable("idfiltro") Integer idNivel, @PathVariable("page") Integer page, Model model) throws IOException {

        if (idNivel == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarPerfilPorFiltrosNivel(page, pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("pages", page);
        model.addAttribute("current", page + 1);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);

        return listPerfil.getContent();
    }

    @Secured("institucion")
    @RequestMapping(value = "/tipodepuesto/{idfiltro}/{page}", method = RequestMethod.GET, produces = "application/json")
    public List<Perfil> buscarPorIdFiltroTipoDePuesto(@PathVariable("idfiltro") Integer idPuesto, @PathVariable("page") Integer page, Model model) throws IOException {

        if (idPuesto == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarPerfilPorFiltrosTipodepuesto(page, pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("pages", page);
        model.addAttribute("current", page + 1);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);

        return listPerfil.getContent();
    }

    @Secured("institucion")
    @RequestMapping(value = "/zona/{idzona}/{page}", method = RequestMethod.GET, produces = "application/json")
    public List<Perfil> buscarPorIdFiltroZona(@PathVariable("idzona") Integer idzona, @PathVariable("page") Integer page, Model model) throws IOException {

        if (idzona == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarPerfilPorFiltrosZona(idzona, pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("pages", page);
        model.addAttribute("current", page + 1);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);

        return listPerfil.getContent();
    }
}
