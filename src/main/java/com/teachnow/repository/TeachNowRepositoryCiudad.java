/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryCiudad extends JpaRepository<Ciudad, Integer> {

    @Query("SELECT c FROM Ciudad c JOIN Persona pe on c.id = pe.ciudad where pe.id = ?1")
    Ciudad findByIdCiudadOrderById(Integer id);
}
