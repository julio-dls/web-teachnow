/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.TeachnowApplication;
import com.teachnow.domain.Categoriatecno;
import java.io.IOException;
import java.util.List;
import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author jdls
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TeachnowApplication.class)
@Transactional
public class TeachnowServiceCategoriatecnoTest {

    @Autowired
    private TeachNowServiceCategoriatecno teachNowServiceCategoriatecno;

    @Test
    public void mostrarTodo_muchasCategorias_devuelveLista() throws IOException {

        List<Categoriatecno> nCategoriatecno = teachNowServiceCategoriatecno.mostrarTodoCategoriatecno();
        for (Categoriatecno categoriatecno : nCategoriatecno) {
            System.out.println("Categorias: " + categoriatecno.getCategoria());
        }

    }
}
