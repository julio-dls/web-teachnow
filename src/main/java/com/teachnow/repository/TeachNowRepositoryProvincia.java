/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryProvincia extends JpaRepository<Provincia, Integer> {

    @Query("SELECT p FROM Provincia p JOIN Persona pe on p.id = pe.ciudad where pe.id = ?1")
    Provincia findByIdProvinciadOrderById(Integer id);
}
