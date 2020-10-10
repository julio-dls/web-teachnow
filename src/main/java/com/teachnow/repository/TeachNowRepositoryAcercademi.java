/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Acercademi;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryAcercademi extends JpaRepository<Acercademi, Integer> {

    @Query("select ac from Acercademi ac where ac.perfil.id = ?1")
    List<Acercademi> findByIdAcercademiOrderById(Integer id);
}
