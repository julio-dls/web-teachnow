<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix ="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="root" scope="request">${pageContext.request.contextPath}</c:set>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Iniciar Sesión</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="" />

        <link href="${root}/css/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="${root}/css/css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <style type="text/css"> BODY{ font-family: "Open Sans", sans-serif; } </style>

    </head>
    <body>
        <div class="logoR">	
            <img src="${root}/img/logo_1.png" width="200" height="90" alt="">	
        </div>

        <div class="padre">
            <div class="w3layouts-main">
                <h2>Iniciar sesión</h2>
                <div>
                    <ul class="top-links">
                        <li><a href="${root}/oauth2/authorization/google"><i class="fa fa-google"></i></a></li>
                    </ul>
                </div>
                <span>(o)</span>

                <c:choose>
                    <c:when test="${!empty message}">
                        <div>
                            <ul class="top-links">
                                <li class="text-info alert-danger">${message}</li>
                            </ul>
                        </div>
                    </c:when>
                </c:choose>

                <form class="form-group" action="${root}/signin" method="post">
                    <div class="email">
                        <input name="username" class="form-control" id="username" autofocus="" required type="email" placeholder="Correo electrónico">
                        <span class="icons i1"><i class="fa fa-envelope-o" aria-hidden="true"></i></span>
                    </div>
                    <div class="email">
                        <input name="password" class="form-control" id="password" type="password" required placeholder="Contraseña">
                        <span class="icons i2"><i class="fa fa-unlock" aria-hidden="true"></i></span>
                    </div>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <button type="submit" class="btn btn-primaryCus btn-login">Aceptar</button>

                    <div class="cuenta">
                        <a href="${root}/recoveraccount/account/" style="color: black;">¿No recordás tu contraseña?</a>
                    </div>
                </form>
            </div>	
            <div class="clear"></div>
        </div>
        <div class="footer">
            <p>Enseña Ya! &copy; 2020 | Todos los derechos reservados</p>
        </div>
    </body>
</html>
