/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryPersona extends JpaRepository<Persona, Integer> {

    @Query("SELECT p FROM Persona p JOIN p.permiso pso WHERE pso.username like %:string% GROUP BY p.id ORDER BY p.id")
    Persona buscarPerfilPorUsername(@Param("string") String string);

    @Query("SELECT pso.privilegios FROM Persona p JOIN p.permiso pso WHERE pso.username like %:string% GROUP BY p.id ORDER BY p.id")
    String buscarPrivilegioPerfilPorEmail(@Param("string") String string);

    @Query("SELECT p FROM Persona p JOIN p.permiso pso WHERE p.nombre like %:nombre% or pso.username like %:username% GROUP BY p.id ORDER BY p.id")
    Persona buscarPersonaPerNombreApellidoEmail(@Param("username") String username, @Param("nombre") String nombre);

    @Query("SELECT p FROM Persona p JOIN p.permiso pso WHERE pso.username like %:username% GROUP BY p.id ORDER BY p.id")
    Persona buscarPersonaEmail(@Param("username") String username);

    @Query("SELECT count(p) FROM Persona p JOIN p.permiso pso WHERE pso.username =:username")
    Integer contarPersonaEmail(@Param("username") String username);

    @Query("SELECT p FROM Persona p JOIN p.permiso pso WHERE pso.username = :email ")
    Persona buscarPerfilPorPermiso(@Param("email") String email);
}
