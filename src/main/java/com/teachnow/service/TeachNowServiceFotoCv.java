/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author jdls
 */
public interface TeachNowServiceFotoCv {

    void guardarImagenCv(MultipartFile image, Integer nombre) throws IOException;

    String mostrarFotoCV(Integer id) throws IOException;
}
