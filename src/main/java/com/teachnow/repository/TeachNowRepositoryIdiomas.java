/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.IdiomaFiltro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryIdiomas extends JpaRepository<IdiomaFiltro, Integer> {

}
