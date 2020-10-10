/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller;

import com.teachnow.domain.Perfil;
import com.teachnow.service.TeachNowServiceNivel;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.teachnow.service.TeachNowServicePerfil;
import com.teachnow.service.TeachNowServiceSalario;
import com.teachnow.service.TeachNowServiceTipodepuesto;
import com.teachnow.service.TeachNowServiceZona;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jdls
 */
@Controller
@RequestMapping(value = "/search/")
public class TeachNowControllerSearch {

    @Autowired
    private TeachNowServicePerfil teachNowServicePerfil;
    @Autowired
    private TeachNowServiceZona teachNowServiceZona;
    @Autowired
    private TeachNowServiceTipodepuesto teachNowServiceTipodepuesto;
    @Autowired
    private TeachNowServiceSalario teachNowServiceSalario;
    @Autowired
    private TeachNowServiceNivel teachNowServiceNivel;

    @Secured("institucion")
    @GetMapping(value = "/buscar")
    public String teachNowSearch(@RequestParam(name = "page", defaultValue = "0") int page, Model model) throws IOException {

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarTodoPaginado(pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("current", page);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);

        model.addAttribute("listPerfil", listPerfil.getContent());
        model.addAttribute("listZona", teachNowServiceZona.mostrarZona());
        model.addAttribute("listTipodepuesto", teachNowServiceTipodepuesto.mostraTipodepuesto());
        model.addAttribute("listSalario", teachNowServiceSalario.mostrarSalario());
        model.addAttribute("listNivel", teachNowServiceNivel.mostrarNivel());
        return "search";
    }

    @Secured("institucion")
    @GetMapping(value = "/buscar/zona")
    public String teachNowSearchZona(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "id", defaultValue = "1") int id, Model model) throws IOException {

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarPerfilPorFiltrosZona(id, pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("current", page);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);
        model.addAttribute("filtro", "zona");
        model.addAttribute("idFiltro", id);

        model.addAttribute("listPerfil", listPerfil.getContent());
        model.addAttribute("listZona", teachNowServiceZona.mostrarZona());
        model.addAttribute("listTipodepuesto", teachNowServiceTipodepuesto.mostraTipodepuesto());
        model.addAttribute("listSalario", teachNowServiceSalario.mostrarSalario());
        model.addAttribute("listNivel", teachNowServiceNivel.mostrarNivel());
        return "search";
    }

    @Secured("institucion")
    @GetMapping(value = "/buscar/nivel")
    public String teachNowSearchNivel(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "id", defaultValue = "1") int id, Model model) throws IOException {

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarPerfilPorFiltrosNivel(id, pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("current", page);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);
        model.addAttribute("filtro", "nivel");
        model.addAttribute("idFiltro", id);

        model.addAttribute("listPerfil", listPerfil.getContent());
        model.addAttribute("listZona", teachNowServiceZona.mostrarZona());
        model.addAttribute("listTipodepuesto", teachNowServiceTipodepuesto.mostraTipodepuesto());
        model.addAttribute("listSalario", teachNowServiceSalario.mostrarSalario());
        model.addAttribute("listNivel", teachNowServiceNivel.mostrarNivel());
        return "search";
    }

    @Secured("institucion")
    @GetMapping(value = "/buscar/tipodepuesto")
    public String teachNowSearchTipoDePuesto(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "id", defaultValue = "1") int id, Model model) throws IOException {

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarPerfilPorFiltrosTipodepuesto(id, pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("current", page);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);
        model.addAttribute("filtro", "tipodepuesto");
        model.addAttribute("idFiltro", id);

        model.addAttribute("listPerfil", listPerfil.getContent());
        model.addAttribute("listZona", teachNowServiceZona.mostrarZona());
        model.addAttribute("listTipodepuesto", teachNowServiceTipodepuesto.mostraTipodepuesto());
        model.addAttribute("listSalario", teachNowServiceSalario.mostrarSalario());
        model.addAttribute("listNivel", teachNowServiceNivel.mostrarNivel());
        return "search";
    }

    @Secured("institucion")
    @GetMapping(value = "/buscar/salario")
    public String teachNowSearchSalario(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "id", defaultValue = "1") int id, Model model) throws IOException {

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarPerfilPorFiltrosSalario(id, pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("current", page);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);
        model.addAttribute("filtro", "salario");
        model.addAttribute("idFiltro", id);

        model.addAttribute("listPerfil", listPerfil.getContent());
        model.addAttribute("listZona", teachNowServiceZona.mostrarZona());
        model.addAttribute("listTipodepuesto", teachNowServiceTipodepuesto.mostraTipodepuesto());
        model.addAttribute("listSalario", teachNowServiceSalario.mostrarSalario());
        model.addAttribute("listNivel", teachNowServiceNivel.mostrarNivel());
        return "search";
    }

    @Secured("institucion")
    @GetMapping(value = "/buscar/palabraClave")
    public String teachNowSearchSalario(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "palabraClave", defaultValue = "") String palabraClave, Model model) throws IOException {

        Pageable pageable = PageRequest.of(page, 10);
        Page<Perfil> listPerfil = teachNowServicePerfil.buscarPerfilPorPalabraClave(palabraClave, pageable);

        int totalPage = listPerfil.getTotalPages();

        model.addAttribute("current", page);
        model.addAttribute("next", page + 1);
        model.addAttribute("prev", page - 1);
        model.addAttribute("last", totalPage);
        model.addAttribute("filtro", "salario");
        model.addAttribute("palabra", palabraClave);

        model.addAttribute("listPerfil", listPerfil.getContent());
        model.addAttribute("listZona", teachNowServiceZona.mostrarZona());
        model.addAttribute("listTipodepuesto", teachNowServiceTipodepuesto.mostraTipodepuesto());
        model.addAttribute("listSalario", teachNowServiceSalario.mostrarSalario());
        model.addAttribute("listNivel", teachNowServiceNivel.mostrarNivel());
        return "search";
    }

    @Secured("institucion")
    @GetMapping(value = "/buscar/csv/{dirName}/{fileName}/{firstName_lastName}")
    public ResponseEntity<Resource> getFile(@PathVariable("dirName") String dirName, @PathVariable("fileName") String fileName, @PathVariable("firstName_lastName") String firstName_lastName) throws IOException {

        if (dirName == null || fileName == null || firstName_lastName == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        String path = "D:\\Proyectos\\TeachNowWeb\\TeachNowWeb\\src\\main\\resources\\files\\cvs\\" + dirName + "\\" + firstName_lastName;
        System.out.println("Path: " + path);
        String file_cvs = "";
        String extension = "";
        File file = null;
        Map<Integer, String> listExtension = new HashMap<Integer, String>();
        listExtension.put(1, ".docx");
        listExtension.put(2, ".pdf");
        listExtension.put(3, ".pptx");

        for (Map.Entry<Integer, String> entry : listExtension.entrySet()) {
            file = new File(path + entry.getValue());
            if (file.exists()) {
                file_cvs = file.getAbsolutePath();
                extension = entry.getValue();
            }
        }

        InputStreamResource resource = new InputStreamResource(new FileInputStream(file_cvs));

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + firstName_lastName + extension)
                .contentType(MediaType.parseMediaType("application/csv"))
                .body(resource);
    }
}
