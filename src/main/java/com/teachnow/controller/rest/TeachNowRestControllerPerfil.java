package com.teachnow.controller.rest;

import com.teachnow.domain.Perfil;
import com.teachnow.domain.Persona;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teachnow.service.TeachNowServicePerfil;
import com.teachnow.service.TeachNowServicePersona;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("register/api")
public class TeachNowRestControllerPerfil {

    @Autowired
    private TeachNowServicePerfil teachNowServicePerfil;
    @Autowired
    private TeachNowServicePersona teachNowServicePersona;

    @GetMapping("{nombre}")
    public List<Perfil> buscarPerfilPorNombre(@PathVariable("nombre") String nombre) throws IOException {
        if (nombre == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        return teachNowServicePerfil.buscarPerfilPorNombre(nombre);
    }

    @RequestMapping(value = "/perfil", method = RequestMethod.POST, produces = "application/json")
    public String guardarPerfil(@RequestBody Persona persona, HttpServletResponse response) throws IOException {
        String redirect = "";
        if (teachNowServicePerfil.guardarPerfilPersona(persona) == true) {
            redirect = "signin/account_created";
            response.setStatus(200);
        } else {
            redirect = "signin/account_exists";
            response.setStatus(200);
        }
        return redirect;
    }

    @RequestMapping(value = "/perfilModificar", method = RequestMethod.POST, produces = "application/json")
    public String modificarPerfil(@RequestBody Persona persona, HttpServletResponse response) throws IOException {
        if (persona == null) {
            throw new IllegalArgumentException("No se aceptan valores");
        }

        String redirect = "";
        if (teachNowServicePersona.modificarPersona(persona) == true) {
            redirect = "signin/update_success";
            response.setStatus(200);
        } else {
            redirect = "signin/update_unsuccess";
            response.setStatus(200);
        }
        return redirect;
    }

    @RequestMapping(value = "/perfilAgregarFiltros", method = RequestMethod.POST, produces = "application/json")
    public String agregarFiltros(@RequestBody Persona persona, HttpServletResponse response) throws IOException {
        if (persona == null) {
            throw new IllegalArgumentException("No se aceptan valores");
        }

        String redirect = "";
        if (teachNowServicePersona.agrefarFiltrosPersona(persona) == true) {
            redirect = "signin/update_success";
            response.setStatus(200);
        } else {
            redirect = "signin/update_unsuccess";
            response.setStatus(200);
        }
        return redirect;
    }

    @DeleteMapping("/perfilEliminar/{id}")
    public String eliminarPerfil(@PathVariable("id") Integer id, HttpServletResponse response) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        String redirect = "";
        if (teachNowServicePerfil.eliminarPerfil(id) == true) {
            redirect = "signin/delete_success";
            response.setStatus(200);
        } else {
            redirect = "signin/delete_unsuccess";
            response.setStatus(200);
        }
        return redirect;
    }
}
