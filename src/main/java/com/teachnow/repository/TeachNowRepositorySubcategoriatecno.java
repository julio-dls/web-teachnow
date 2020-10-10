/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Subcategoriatecno;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositorySubcategoriatecno extends JpaRepository<Subcategoriatecno, Integer> {

    @Query("select sc.nombre from Subcategoriatecno sc where sc.categoriatecno.id = ?1")
    public List<Subcategoriatecno> findByIdcategoriatecnoSubcategoriatecnoById(Integer id);
}
