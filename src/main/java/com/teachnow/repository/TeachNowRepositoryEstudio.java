/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Estudio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryEstudio extends JpaRepository<Estudio, Integer> {

    @Query("select e from Estudio e where e.perfil.id = ?1")
    List<Estudio> findByidperfilEstudioOrderById(Integer id);
}
