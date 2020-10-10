/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Empleo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryEmpleo extends JpaRepository<Empleo, Integer> {

    @Query("select em from Empleo em where em.perfil.id = ?1")
    List<Empleo> findByIdperfilEmpleoOrderById(Integer id);
}
