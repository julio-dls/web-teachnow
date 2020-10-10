package com.teachnow.service.Impl;

import com.teachnow.domain.Empleo;
import com.teachnow.domain.Estudio;
import com.teachnow.domain.Perfil;
import com.teachnow.domain.Permiso;
import com.teachnow.domain.Persona;
import com.teachnow.domain.Tecnologia;
import com.teachnow.repository.TeachNowRepositoryPersona;
import java.io.IOException;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teachnow.service.TeachNowServicePerfil;
import com.teachnow.repository.TeachNowRepositoryPerfil;
import com.teachnow.service.TeachNowServicePermiso;
import static jdk.nashorn.internal.objects.NativeString.trim;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
@Transactional
public class TeachNowServicePerfilImpl implements TeachNowServicePerfil {

    @Autowired
    private TeachNowRepositoryPerfil teachNowRepositoryPerfil;
    @Autowired
    private TeachNowRepositoryPersona teachNowRepositoryPersona;
    @Autowired
    private TeachNowServicePermisoImpl teachNowServicePermisoImpl;
    @Autowired
    private TeachNowServicePermiso teachNowServicePermiso;

    @Override

    public Perfil modificarPerfil(Persona persona) throws IllegalArgumentException {
        if (persona.getId() == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }

        Persona pModificada = teachNowRepositoryPersona.getOne(persona.getId());

        pModificada.setNombre(persona.getNombre());
        pModificada.setApellido(persona.getApellido());
        pModificada.setNacionalidad(persona.getNacionalidad());
        pModificada.setDireccion(persona.getDireccion());
        pModificada.setTelefono(persona.getTelefono());
        pModificada.setFechanacimiento(persona.getFechanacimiento());

        Perfil perfilModificado = teachNowRepositoryPerfil.getOne(persona.getId());
        perfilModificado.setPersona(pModificada);

        return perfilModificado;
    }

    @Override
    public Perfil guardarPerfil(Persona persona, List<Estudio> estudio, List<Tecnologia> tecnologia, List<Empleo> empleo) throws IllegalArgumentException {

        if (persona == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }

        Perfil nPerfil = new Perfil();
        nPerfil.setPersona(persona);
        nPerfil.setEmpleos(empleo);
        nPerfil.setEstudios(estudio);
        nPerfil.setTecnologias(tecnologia);

        return teachNowRepositoryPerfil.save(nPerfil);
    }

    @Override
    public boolean eliminarPerfil(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        boolean eliminado = false;
        if (teachNowRepositoryPersona.getOne(id) != null) {
            teachNowRepositoryPerfil.deleteById(id);
            eliminado = true;
        }

        return eliminado;
    }

    @Override
    public List<Perfil> buscarTodo() throws IOException {
        return teachNowRepositoryPerfil.findAllActivePerfil();
    }

    @Override
    public Perfil buscarPorId(Integer id) throws IOException {
        if (id == 0) {
            throw new IllegalArgumentException("No se aceptan valores Null");
        }
        return teachNowRepositoryPerfil.burcarPerfilPorId(id);
    }

    @Override
    public List<Perfil> buscarPerfilPorNombre(String name) throws IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }
        return teachNowRepositoryPerfil.findByPersonaNombreOrderByPersonaId(name);
    }

    @Override
    public boolean guardarPerfilPersona(Persona persona) {
        if (persona == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }
        System.out.println("Password: " + persona.getPermiso().getPassword());
        boolean existe = false;
        int usuarios = teachNowServicePermiso.verificarSiPerfilExistePorEmail(persona.getPermiso().getUsername());
        Perfil nPerfil = new Perfil();

        if (usuarios == 0) {
            Permiso nPermiso = teachNowServicePermisoImpl.guardarNuevoPermiso(persona.getPermiso().getUsername(), trim(persona.getPermiso().getPassword()), persona.getPermiso().getPrivilegios());
            persona.setPermiso(nPermiso);
            nPerfil.setPersona(persona);
            teachNowRepositoryPerfil.save(nPerfil);
            existe = true;
        }
        return existe;
    }

    @Override
    public List<Perfil> buscarTodoPerfil() {
        return teachNowRepositoryPerfil.findAllActivePerfil();
    }

    @Override
    public Page<Perfil> buscarPerfilPorPalabraClave(String string, Pageable pageable) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }
        return teachNowRepositoryPerfil.buscarPerfilPorPalabraClave(string, pageable);
    }

    @Override
    public Page<Perfil> buscarPerfilPorFiltrosSalario(Integer id, Pageable pageable) {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }
        return teachNowRepositoryPerfil.buscarPerfilPorIdFiltrosSalario(id, pageable);
    }

    @Override
    public Page<Perfil> buscarPerfilPorFiltrosNivel(Integer id, Pageable pageable) {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }
        return teachNowRepositoryPerfil.buscarPerfilPorIdFiltrosNivel(id, pageable);
    }

    @Override
    public Page<Perfil> buscarPerfilPorFiltrosTipodepuesto(Integer id, Pageable pageable) {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }
        return teachNowRepositoryPerfil.buscarPerfilPorIdFiltrosTipodepuesto(id, pageable);
    }

    @Override
    public Page<Perfil> buscarPerfilPorFiltrosZona(Integer id, Pageable pageable) {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }
        return teachNowRepositoryPerfil.buscarPerfilPorIdFiltrosZona(id, pageable);
    }

    @Override
    public Page<Perfil> buscarTodoPaginado(Pageable pageable) throws IOException {
        return teachNowRepositoryPerfil.findAll(pageable);
    }
}
