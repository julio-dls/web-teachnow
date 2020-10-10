/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Zona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryZona extends JpaRepository<Zona, Integer> {

    @Query("SELECT z FROM Zona z JOIN Persona pe on z.id = pe.zona where pe.id = ?1")
    Zona findByIdZonaOrderById(Integer id);
}
