/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.repository;

import com.teachnow.domain.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author jdls
 */
public interface TeachNowRepositoryToken extends JpaRepository<Token, Integer> {

    @Query("SELECT t FROM Token t WHERE  t.token =:token")
    Token searchToken(@Param("token") String token);
}
