package com.teachnow.service;

import com.teachnow.domain.Empleo;
import com.teachnow.domain.Estudio;
import com.teachnow.domain.Perfil;
import com.teachnow.domain.Persona;
import com.teachnow.domain.Tecnologia;
import java.io.IOException;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TeachNowServicePerfil {

    Perfil buscarPorId(Integer id) throws IOException;

    List<Perfil> buscarPerfilPorNombre(String name) throws IOException;

    Perfil guardarPerfil(Persona persona, List<Estudio> estudio, List<Tecnologia> tecnologia, List<Empleo> empleo) throws IOException;

    Perfil modificarPerfil(Persona persona) throws IOException;

    boolean eliminarPerfil(Integer id) throws IOException;

    List<Perfil> buscarTodo() throws IOException;

    boolean guardarPerfilPersona(Persona persona);

    List<Perfil> buscarTodoPerfil();

    Page<Perfil> buscarPerfilPorPalabraClave(String string, Pageable pageable);

    Page<Perfil> buscarPerfilPorFiltrosSalario(Integer id, Pageable pageable);

    Page<Perfil> buscarPerfilPorFiltrosNivel(Integer id, Pageable pageable);

    Page<Perfil> buscarPerfilPorFiltrosTipodepuesto(Integer id, Pageable pageable);

    Page<Perfil> buscarPerfilPorFiltrosZona(Integer id, Pageable pageable);

    Page<Perfil> buscarTodoPaginado(Pageable pageable) throws IOException;
}
