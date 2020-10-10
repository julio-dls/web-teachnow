/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Permiso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryPermiso extends JpaRepository<Permiso, Integer> {

    @Query("SELECT pso FROM Permiso pso WHERE pso.username = :email")
    Permiso buscarPerfilInstitucionPorEmailAppMovile(@Param("email") String email);

    @Query("SELECT count(pso) FROM Permiso pso WHERE pso.username = :email")
    int verificarSiPerfilExistePorEmail(@Param("email") String email);
}
