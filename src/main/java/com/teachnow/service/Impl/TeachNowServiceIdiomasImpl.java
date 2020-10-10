/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.IdiomaFiltro;
import com.teachnow.repository.TeachNowRepositoryIdiomas;
import com.teachnow.service.TeachNowServiceIdiomas;
import java.io.IOException;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdls
 */
@Service
@Transactional
public class TeachNowServiceIdiomasImpl implements TeachNowServiceIdiomas {

    @Autowired
    private TeachNowRepositoryIdiomas teachNowRepositoryIdiomas;

    @Override
    public List<IdiomaFiltro> mostrarIdiomas() throws IOException {
        return teachNowRepositoryIdiomas.findAll();
    }

}
