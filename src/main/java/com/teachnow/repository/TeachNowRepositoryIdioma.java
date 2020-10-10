/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Idioma;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryIdioma extends JpaRepository<Idioma, Integer> {

    @Query("select i from Idioma i where i.perfil.id = ?1")
    List<Idioma> findByIdperfilIdiomaOrderById(Integer id);
}
