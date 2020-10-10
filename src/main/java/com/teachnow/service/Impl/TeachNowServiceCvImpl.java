/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.service.TeachNowServiceCv;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author jdls
 */
@Service
public class TeachNowServiceCvImpl implements TeachNowServiceCv {

    @Override
    public void guardarArchivo(MultipartFile file, Integer id, String nombre, String apellido) {

        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        final String extension = getExtension(filename);
        final String docx = "docx";
        final String pdf = "pdf";
        final String pptx = "pptx";

        if ((extension.compareToIgnoreCase(docx) == 0) || (extension.compareToIgnoreCase(pdf) == 0) || (extension.compareToIgnoreCase(pptx) == 0)) {
            File directorio = new File("D:\\Proyectos\\TeachNowWeb\\TeachNowWeb\\src\\main\\resources\\files\\cvs\\" + id.toString() + "\\" + nombre + "_" + apellido + "." + extension);

            if (!directorio.exists()) {
                directorio.mkdirs();
            }

            String path_archivos = directorio.getAbsolutePath();

            try {
                if (file.isEmpty()) {
                    throw new IllegalArgumentException("Failed to store empty file " + filename);
                }
                if (filename.contains("..")) {
                    throw new IllegalArgumentException("Cannot store file with relative path outside current directory");
                }
                try (InputStream inputStream = file.getInputStream()) {
                    Files.copy(inputStream, Paths.get(path_archivos), StandardCopyOption.REPLACE_EXISTING);
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to store file " + filename, e);
            }
        }
    }

    @Override
    public String getExtension(String fileName) {
        String extension = null;
        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            extension = fileName.substring(i + 1);
        }
        return extension;
    }
}
