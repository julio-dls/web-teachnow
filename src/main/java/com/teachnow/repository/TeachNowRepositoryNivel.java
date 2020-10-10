/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Nivel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryNivel extends JpaRepository<Nivel, Integer> {

    @Query("SELECT n FROM Nivel n JOIN Persona pe on n.id = pe.nivel where pe.id = ?1")
    Nivel findByIdNivelOrderById(Integer id);
}
