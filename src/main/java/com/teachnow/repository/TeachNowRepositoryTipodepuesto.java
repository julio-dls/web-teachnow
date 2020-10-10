/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Tipodepuesto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryTipodepuesto extends JpaRepository<Tipodepuesto, Integer> {

    @Query("SELECT t FROM Tipodepuesto t JOIN Persona pe on t.id = pe.tipodepuesto where pe.id = ?1")
    Tipodepuesto findByIdTipodepuestoOrderById(Integer id);
}
