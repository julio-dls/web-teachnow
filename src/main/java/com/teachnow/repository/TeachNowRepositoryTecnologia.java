/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Tecnologia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryTecnologia extends JpaRepository<Tecnologia, Integer> {

    @Query("select t from Tecnologia t where t.perfil.id = ?1")
    List<Tecnologia> findByIdperfilTecnologiaOrderById(Integer id);
}
