/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Permiso;
import com.teachnow.domain.Persona;
import com.teachnow.repository.TeachNowRepositoryPermiso;
import com.teachnow.repository.TeachNowRepositoryPersona;
import com.teachnow.service.TeachNowServicePersona;
import java.io.IOException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdls
 */
@Service
@Transactional
public class TeachNowServicePersonaImpl implements TeachNowServicePersona {

    @Autowired
    private TeachNowRepositoryPersona teachNowRepositoryPersona;
    @Autowired
    private TeachNowRepositoryPermiso teachNowRepositoryPermiso;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Persona guardarPersona(Persona persona) throws IllegalArgumentException {

        if (persona.getNombre() == null || persona.getApellido() == null || persona.getFechanacimiento() == null) { //|| persona.getPermiso() == null
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        return teachNowRepositoryPersona.save(persona);
    }

    @Override
    public boolean modificarPersona(Persona persona) throws IllegalArgumentException {
        boolean modificado = false;
        if (persona == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        } else {
            Permiso mPermiso = teachNowRepositoryPermiso.getOne(persona.getId());
            mPermiso.setUsername(persona.getPermiso().getUsername());
            mPermiso.setPassword(passwordEncoder.encode(persona.getPermiso().getPassword()));

            Persona mPersona = teachNowRepositoryPersona.getOne(persona.getId());
            mPersona.setNombre(persona.getNombre());
            mPersona.setApellido(persona.getApellido());
            mPersona.setNacionalidad(persona.getNacionalidad());
            mPersona.setDireccion(persona.getDireccion());
            mPersona.setTelefono(persona.getTelefono());
            mPersona.setNacionalidad(persona.getNacionalidad());
            mPersona.setFechanacimiento(persona.getFechanacimiento());
            mPersona.setPais(persona.getPais());
            mPersona.setRegion(persona.getRegion());
            mPersona.setCiudad(persona.getCiudad());
            mPersona.setZona(persona.getZona());
            mPersona.setTipotelefono(persona.getTipotelefono());
            mPersona.setTelefono(persona.getTelefono());
            mPersona.setTipodocumento(persona.getTipodocumento());
            mPersona.setDocumento(persona.getDocumento());
            mPersona.setLicconducir(persona.getLicconducir());
            mPersona.setVehiculo(persona.getVehiculo());
            mPersona.setDiscapacidad(persona.getDiscapacidad());
            mPersona.setEstadocivil(persona.getEstadocivil());
            mPersona.setGenero(persona.getGenero());
            mPersona.setCp(persona.getCp());
            mPersona.setTipo(persona.getTipo());
            mPersona.setSalario(persona.getSalario());
            mPersona.setTipodepuesto(persona.getTipodepuesto());
            mPersona.setNivel(persona.getNivel());
            mPersona.setPermiso(mPermiso);

            teachNowRepositoryPersona.save(mPersona);
            modificado = true;
        }
        return modificado;
    }

    @Override
    public boolean updatePwsPerona(Persona persona) throws IllegalArgumentException {
        boolean updatePwd = false;

        if (persona.getId() == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        } else {
            Persona mPersona = teachNowRepositoryPersona.getOne(persona.getId());

            Permiso mPermiso = teachNowRepositoryPermiso.getOne(mPersona.getPermiso().getId());
            mPermiso.setPassword(passwordEncoder.encode(persona.getPermiso().getPassword()));

            mPersona.setPermiso(mPermiso);
            teachNowRepositoryPersona.save(mPersona);
            updatePwd = true;
        }
        return updatePwd;
    }

    @Override
    public Persona obtenerDetallesUsuario(String usuario) throws IllegalArgumentException {
        if (usuario == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        return teachNowRepositoryPersona.buscarPerfilPorUsername(usuario);
    }

    @Override
    public String obtenerPrivilegioPerfifPorEmail(String email) throws IllegalArgumentException {
        if (email == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        String privilegios = teachNowRepositoryPersona.buscarPrivilegioPerfilPorEmail(email);

        if (privilegios == null) {
            privilegios = "anonymous";
        }
        return privilegios;
    }

    @Override
    public boolean existsUser(String email) throws IOException {
        if (email == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        boolean exists = true;
        if (teachNowRepositoryPersona.contarPersonaEmail(email) == 0) {
            exists = false;
        }
        return exists;
    }

    @Override
    public boolean agrefarFiltrosPersona(Persona persona) throws IllegalArgumentException {
        boolean modificado = false;
        if (persona == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        } else {
            Persona mPersona = teachNowRepositoryPersona.getOne(persona.getId());
            mPersona.setSalario(persona.getSalario());
            mPersona.setTipodepuesto(persona.getTipodepuesto());
            mPersona.setNivel(persona.getNivel());
            teachNowRepositoryPersona.save(mPersona);
            modificado = true;
        }
        return modificado;
    }
}
