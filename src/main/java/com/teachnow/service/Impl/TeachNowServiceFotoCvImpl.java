/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.service.TeachNowServiceFotoCv;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.sound.midi.Patch;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author jdls
 */
@Service
@Transactional
public class TeachNowServiceFotoCvImpl implements TeachNowServiceFotoCv {

    @Override
    public void guardarImagenCv(MultipartFile image, Integer nombre) throws IOException {

        String imageName = StringUtils.cleanPath(image.getOriginalFilename());
        final String extension = getExtension(imageName);
        final String jpg = "jpg";
        final String jepg = "jepg";

        if ((extension.compareToIgnoreCase(jpg) == 0) || (extension.compareToIgnoreCase(jepg) == 0)) {
            File directorio = new File("D:\\Proyectos\\TeachNowWeb\\TeachNowWeb\\src\\main\\webapp\\img\\" + nombre.toString() + "\\img_" + nombre.toString() + "_cv." + getExtension(imageName));

            if (!directorio.exists()) {
                directorio.mkdirs();
            }
            String path_archivos = directorio.getAbsolutePath();

            try (InputStream inputStream = image.getInputStream()) {
                Files.copy(inputStream, Paths.get(path_archivos), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to store file " + imageName, e);
            }
        }
    }

    @Override
    public String mostrarFotoCV(Integer id) throws IOException {
        if (id == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        String pathImg = null;
        File directorio = new File("D:\\Proyectos\\TeachNowWeb\\TeachNowWeb\\src\\main\\webapp\\img\\" + id.toString() + "\\");
        String[] ficheros = directorio.list();

        if (directorio.exists()) {
            if (ficheros != null || ficheros.length > 0) {
                pathImg = "img/" + id.toString() + "/" + ficheros[0];
            } else {
                pathImg = "img/avatar/avatar.jpg";
            }
        } else {
            pathImg = "img/avatar/avatar.jpg";
        }

        return pathImg;
    }

    public String getExtension(String fileName) {
        String extension = null;
        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            extension = fileName.substring(i + 1);
        }
        return extension;
    }
}
