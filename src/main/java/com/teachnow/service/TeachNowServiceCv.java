/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceCv {

    void guardarArchivo(MultipartFile file, Integer id, String nombre, String apellido) throws IOException;

    String getExtension(String fileName) throws IOException;
}
