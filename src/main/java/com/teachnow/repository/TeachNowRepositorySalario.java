/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Salario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositorySalario extends JpaRepository<Salario, Integer> {

    @Query("SELECT s FROM Salario s JOIN Persona pe on s.id = pe.salario where pe.id = ?1")
    Salario findByIdSalarioOrderById(Integer id);
}
