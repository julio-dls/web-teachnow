/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Provincia;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceProvincia {

    List<Provincia> mostrarProvincia() throws IOException;

    Provincia mostrarProvinciaPorId(Integer id) throws IOException;
}
