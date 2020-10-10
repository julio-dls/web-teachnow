/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.domain.Tipodepuesto;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceTipodepuesto {

    List<Tipodepuesto> mostraTipodepuesto() throws IOException;

    Tipodepuesto mostraTipodepuestoPorId(Integer id) throws IOException;
}
