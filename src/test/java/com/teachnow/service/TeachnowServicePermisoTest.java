/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service;

import com.teachnow.TeachnowApplication;
import com.teachnow.domain.Permiso;
import java.io.IOException;
import javax.transaction.Transactional;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TeachnowApplication.class)
@Transactional
public class TeachnowServicePermisoTest {

    @Autowired
    private TeachNowServicePermiso teachNowServicePermiso;

    @Test
    public void crearNuevoPermiso_noExiste_nuevoPermiso() throws IOException {
        Permiso permiso = teachNowServicePermiso.guardarNuevoPermiso("julio", "qwerty", "user");
        assertEquals(permiso.getPrivilegios(), "user");
    }
}
