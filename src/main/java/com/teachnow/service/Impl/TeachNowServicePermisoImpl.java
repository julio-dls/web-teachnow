/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Permiso;
import com.teachnow.domain.Persona;
import com.teachnow.domain.User;
import com.teachnow.repository.TeachNowRepositoryPermiso;
import com.teachnow.repository.TeachNowRepositoryPersona;
import com.teachnow.service.TeachNowServicePermiso;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdls
 */
@Service
@Transactional
public class TeachNowServicePermisoImpl implements TeachNowServicePermiso {

    @Autowired
    private TeachNowRepositoryPermiso teachNowRepositoryPermiso;
    @Autowired
    private TeachNowRepositoryPersona teachNowRepositoryPersona;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Permiso guardarNuevoPermiso(String usuario, String contraseña, String privilegio) throws IllegalArgumentException {
        if (contraseña == null || privilegio == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        Permiso nPermiso = new Permiso();
        nPermiso.setUsername(usuario);
        nPermiso.setPassword(passwordEncoder.encode(contraseña));
        nPermiso.setPrivilegios(privilegio);
        nPermiso.setEnabled(Boolean.TRUE);

        return teachNowRepositoryPermiso.save(nPermiso);
    }

    @Override
    public User loginPerfifPorEmail(String email, String password) throws IllegalArgumentException {
        if (email == null && password == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }
        String token = null;
        Permiso nPermiso = teachNowRepositoryPermiso.buscarPerfilInstitucionPorEmailAppMovile(email);
        User user = new User();
        if (passwordEncoder.matches(password, nPermiso.getPassword())) {
            user.setName(nPermiso.getUsername());
            user.setPassword("");
            user.setPrivilegio(nPermiso.getPrivilegios());
        }

        return user;
    }

    @Override
    public User login(User user) throws IllegalArgumentException {
        if (user == null) {
            throw new IllegalArgumentException("No se aceptan valores null");
        }

        String token = null;
        Persona nPersona = teachNowRepositoryPersona.buscarPerfilPorPermiso(user.getName());

        if (passwordEncoder.matches(user.getPassword(), nPersona.getPermiso().getPassword())) {
            if (nPersona.getPermiso().getPrivilegios().equalsIgnoreCase("institucion")) {
                token = getJWTToken(nPersona.getPermiso().getUsername(), "institucion");
            }
            if (nPersona.getPermiso().getPrivilegios().equalsIgnoreCase("user")) {
                token = getJWTToken(nPersona.getPermiso().getUsername(), "user");
            }
        }

        User nUser = new User();
        nUser.setName(nPersona.getPermiso().getUsername());
        nUser.setPassword("");
        nUser.setToken(token);
        nUser.setPrivilegio(nPersona.getPermiso().getPrivilegios());
        nUser.setIdPerfil(nPersona.getId());

        return nUser;
    }

    @Override
    public int verificarSiPerfilExistePorEmail(String email) throws IllegalArgumentException {
        return teachNowRepositoryPermiso.verificarSiPerfilExistePorEmail(email);
    }

    private String getJWTToken(String username, String rol) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList(rol);

        String token = Jwts
                .builder()
                .setId("TeachNowJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return "Bearer " + token;
    }
}
