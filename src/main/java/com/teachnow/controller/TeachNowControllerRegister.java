/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.controller;

import com.teachnow.service.TeachNowServiceAcercademi;
import com.teachnow.service.TeachNowServiceCategoriatecno;
import com.teachnow.service.TeachNowServiceCiudad;
import com.teachnow.service.TeachNowServiceEmpleo;
import com.teachnow.service.TeachNowServiceEstudio;
import com.teachnow.service.TeachNowServiceFotoCv;
import com.teachnow.service.TeachNowServiceHabilidades;
import com.teachnow.service.TeachNowServiceIdioma;
import com.teachnow.service.TeachNowServiceIdiomas;
import com.teachnow.service.TeachNowServiceNacionalidad;
import com.teachnow.service.TeachNowServiceNivel;
import com.teachnow.service.TeachNowServicePerfil;
import com.teachnow.service.TeachNowServiceProvincia;
import com.teachnow.service.TeachNowServiceSalario;
import com.teachnow.service.TeachNowServiceSubcategoriatecno;
import com.teachnow.service.TeachNowServiceTecnologia;
import com.teachnow.service.TeachNowServiceTipodepuesto;
import com.teachnow.service.TeachNowServiceZona;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jdls
 */
@Controller
@RequestMapping(value = "/register/")
public class TeachNowControllerRegister {

    @Autowired
    private TeachNowServiceEmpleo teachNowServiceEmpleo;
    @Autowired
    private TeachNowServiceEstudio teachNowServiceEstudio;
    @Autowired
    private TeachNowServicePerfil teachNowServicePerfil;
    @Autowired
    private TeachNowServiceTecnologia teachNowServiceTecnologia;
    @Autowired
    private TeachNowServiceIdioma teachNowServiceIdioma;
    @Autowired
    private TeachNowServiceHabilidades teachNowServiceHabilidades;
    @Autowired
    private TeachNowServiceAcercademi teachNowServiceAcercademi;
    @Autowired
    private TeachNowServiceFotoCv teachNowServiceFotoCv;
    @Autowired
    private TeachNowServiceProvincia teachNowServiceProvincia;
    @Autowired
    private TeachNowServiceNacionalidad teachNowServiceNacionalidad;
    @Autowired
    private TeachNowServiceIdiomas teachNowServiceIdiomas;
    @Autowired
    private TeachNowServiceCategoriatecno teachNowServiceCategoriatecno;
    @Autowired
    private TeachNowServiceSubcategoriatecno teachNowServiceSubcategoriatecno;
    @Autowired
    private TeachNowServiceCiudad teachNowServiceCiudad;
    @Autowired
    private TeachNowServiceSalario teachNowServiceSalario;
    @Autowired
    private TeachNowServiceTipodepuesto teachNowServiceTipodepuesto;
    @Autowired
    private TeachNowServiceNivel teachNowServiceNivel;
    @Autowired
    private TeachNowServiceZona teachNowServiceZona;

    @GetMapping(value = "/new")
    public String teachnowView(Model model) throws IOException {
        model.addAttribute("listaProvincias", teachNowServiceProvincia.mostrarProvincia());
        model.addAttribute("listaNacionalidades", teachNowServiceNacionalidad.mostrarNacionalidad());
        model.addAttribute("listaIdiomasFiltro", teachNowServiceIdiomas.mostrarIdiomas());
        model.addAttribute("listaCategoriatecno", teachNowServiceCategoriatecno.mostrarTodoCategoriatecno());
        model.addAttribute("listaSubcategoriatecno", teachNowServiceSubcategoriatecno.mostrarTodoSubcategoriatecno());
        model.addAttribute("listaCiudad", teachNowServiceCiudad.mostrarCiudad());
        model.addAttribute("listaSalario", teachNowServiceSalario.mostrarSalario());
        model.addAttribute("listaTipodeuesto", teachNowServiceTipodepuesto.mostraTipodepuesto());
        model.addAttribute("listaNivel", teachNowServiceNivel.mostrarNivel());
        model.addAttribute("listaZona", teachNowServiceZona.mostrarZona());

        return "register";
    }

    @Secured("user")
    @GetMapping(value = "/{id}")
    public String teachnowViewById(@PathVariable("id") Integer id, Model model) throws IOException {
        if (id == null || id == 0) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        model.addAttribute("nPerfil", teachNowServicePerfil.buscarPorId(id));
        model.addAttribute("listaProvincias", teachNowServiceProvincia.mostrarProvincia());
        model.addAttribute("listaCiudad", teachNowServiceCiudad.mostrarCiudad());
        model.addAttribute("listaEmpleos", teachNowServiceEmpleo.buscarEmpleoPorId(id));
        model.addAttribute("listaEstudios", teachNowServiceEstudio.buscarEstudioPorId(id));
        model.addAttribute("listaIdiomas", teachNowServiceIdioma.buscarIdiomaPorId(id));
        model.addAttribute("listaTecnologias", teachNowServiceTecnologia.buscarTecnologiaPorId(id));
        model.addAttribute("listaHabilidades", teachNowServiceHabilidades.buscarHabilidadesPorId(id));
        model.addAttribute("listaAcercademi", teachNowServiceAcercademi.buscarAcercademiPorId(id));
        model.addAttribute("fotoCV", teachNowServiceFotoCv.mostrarFotoCV(id));

        model.addAttribute("listaIdiomasFiltro", teachNowServiceIdiomas.mostrarIdiomas());
        model.addAttribute("listaProvinciaPorId", teachNowServiceProvincia.mostrarProvinciaPorId(id));
        model.addAttribute("listaCiudadPorId", teachNowServiceCiudad.mostrarCiudadPorId(id));
        model.addAttribute("listaSalarioPorId", teachNowServiceSalario.mostrarSalarioPorId(id));
        model.addAttribute("listaTipodeuestoPorId", teachNowServiceTipodepuesto.mostraTipodepuestoPorId(id));
        model.addAttribute("listaZonaPorId", teachNowServiceZona.mostrarZonaPorId(id));
        model.addAttribute("listaNivelPorId", teachNowServiceNivel.mostrarNivelPorNivel(id));

        model.addAttribute("listaCiudad", teachNowServiceCiudad.mostrarCiudad());
        model.addAttribute("listaSalario", teachNowServiceSalario.mostrarSalario());
        model.addAttribute("listaTipodeuesto", teachNowServiceTipodepuesto.mostraTipodepuesto());
        model.addAttribute("listaNivel", teachNowServiceNivel.mostrarNivel());
        model.addAttribute("listaZona", teachNowServiceZona.mostrarZona());

        return "register";
    }
}
