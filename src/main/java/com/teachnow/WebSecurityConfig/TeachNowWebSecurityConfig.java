/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.WebSecurityConfig;

import com.teachnow.service.TeachNowServicePersona;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.authority.mapping.GrantedAuthoritiesMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.IdTokenClaimNames;
import org.springframework.security.oauth2.core.user.OAuth2UserAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;

/**
 *
 * @author jdls
 */
@Configuration
@EnableWebSecurity
public class TeachNowWebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private TeachNowServicePersona teachNowServicePersona;
    private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    private String googleEmail = "";

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().ignoringAntMatchers("/nocsrf", "/register/api/**", "/registersCompany/new/api/**", "/renovate/renew/api/**", "/mobile/api/login", "/mobile/api/google");
        http
                .authorizeRequests()
                .antMatchers("/include/**", "/css/**", "/icons/**", "/img/**", "/js/**", "/layer/**", "/fonts/**", "/api/**").permitAll()
                .antMatchers("/", "/home", "/renovate/**", "/registersCompany/**", "/registernewaccount/**", "/recoveraccount/**", "/register/new").permitAll()
                .antMatchers("/register/api/**", "/registersCompany/new/api/**", "/signin/account_created", "/signin/account_exist", "/signin/email_send_success", "/signin/email_send_unsuccess", "/signin/token_expired").permitAll()
                .antMatchers("/renovate/renew/api/**", "/signin/password_change_success", "/signin/password_change_unsuccess").permitAll()
                .antMatchers("/mobile/api/login", "/mobile/api/google", "/mobile/api/search/**").permitAll()
                .antMatchers("/auth/**", "/oauth2/**").permitAll()
                .antMatchers("/register/**").hasAnyAuthority("user")
                .antMatchers("/search/**").hasAnyAuthority("institucion")
                .anyRequest().authenticated()
                .and()
                .logout()
                .logoutSuccessUrl("/logout")
                .permitAll()
                .and()
                .formLogin()
                .loginPage("/signin")
                .permitAll()
                .failureUrl("/signin/error")
                .usernameParameter("username")
                .passwordParameter("password")
                .successHandler((HttpServletRequest request, HttpServletResponse response, Authentication a) -> {
                    Set<String> roles = AuthorityUtils.authorityListToSet(a.getAuthorities());

                    if (roles.contains("user")) {
                        redirectStrategy.sendRedirect(request, response, "/register/" + teachNowServicePersona.obtenerDetallesUsuario(a.getName()).getId());
                    }
                    if (roles.contains("institucion")) {
                        redirectStrategy.sendRedirect(request, response, "/search/buscar");
                    }
                })
                .and()
                .oauth2Login()
                .clientRegistrationRepository(this.clientRegistrationRepository())
                .userInfoEndpoint()
                .userAuthoritiesMapper(this.userAuthoritiesMapper())
                .and()
                .successHandler((HttpServletRequest request, HttpServletResponse response, Authentication a) -> {
                    Set<String> roles = AuthorityUtils.authorityListToSet(a.getAuthorities());

                    if (roles.contains("user")) {
                        redirectStrategy.sendRedirect(request, response, "/register/" + teachNowServicePersona.obtenerDetallesUsuario(googleEmail).getId());
                    }
                    if (roles.contains("institucion")) {
                        redirectStrategy.sendRedirect(request, response, "/search/buscar");
                    }
                    if (roles.contains("anonymous")) {
                        redirectStrategy.sendRedirect(request, response, "/signin/not_account");
                    }
                });
    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().passwordEncoder(passwordEncoder())
                .dataSource(dataSource)
                .usersByUsernameQuery("SELECT pso.username, pso.password, pso.enabled FROM Permiso pso WHERE pso.username=?")
                .authoritiesByUsernameQuery("SELECT pso.username, pso.privilegios FROM Permiso pso WHERE pso.username=?");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    private GrantedAuthoritiesMapper userAuthoritiesMapper() {
        return (authorities) -> {
            Set<GrantedAuthority> mappedAuthorities = new HashSet<>();
            authorities.forEach(authority -> {

                OAuth2UserAuthority oauth2UserAuthority = (OAuth2UserAuthority) authority;
                Map<String, Object> userAttributes = oauth2UserAuthority.getAttributes();

                for (Map.Entry<String, Object> userAttributesentry : userAttributes.entrySet()) {
                    String key = userAttributesentry.getKey();
                    Object value = userAttributesentry.getValue();

                    if (key.equalsIgnoreCase("email")) {
                        String email = (String) value;
                        if (teachNowServicePersona.obtenerPrivilegioPerfifPorEmail(email).equalsIgnoreCase("institucion")) {
                            mappedAuthorities.add(new SimpleGrantedAuthority("institucion"));
                            googleEmail = email;
                        }
                        if (teachNowServicePersona.obtenerPrivilegioPerfifPorEmail(email).equalsIgnoreCase("user")) {
                            mappedAuthorities.add(new SimpleGrantedAuthority("user"));
                            googleEmail = email;
                        }
                        if (teachNowServicePersona.obtenerPrivilegioPerfifPorEmail(email).equalsIgnoreCase("anonymous")) {
                            mappedAuthorities.add(new SimpleGrantedAuthority("anonymous"));
                        }
                    }
                }
            });

            return mappedAuthorities;
        };
    }

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        return new InMemoryClientRegistrationRepository(this.googleClientRegistration());
    }

    private ClientRegistration googleClientRegistration() {
        return ClientRegistration.withRegistrationId("google")
                .clientId("727244426649-0150o9c9fdhva5ft7j7bocbsvkl27bvu.apps.googleusercontent.com")
                .clientSecret("R1FgCQu5LSQyg3YQhQtYBPL_")
                .clientAuthenticationMethod(ClientAuthenticationMethod.BASIC)
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .redirectUriTemplate("http://localhost:8080/teachnow/login/oauth2/code/google")
                .scope("openid", "profile", "email", "address", "phone")
                .authorizationUri("https://accounts.google.com/o/oauth2/auth")
                .tokenUri("https://oauth2.googleapis.com/token")
                .userInfoUri("https://www.googleapis.com/oauth2/v3/userinfo")
                .userNameAttributeName(IdTokenClaimNames.SUB)
                .jwkSetUri("https://www.googleapis.com/oauth2/v3/certs")
                .clientName("Google")
                .build();
    }
}
