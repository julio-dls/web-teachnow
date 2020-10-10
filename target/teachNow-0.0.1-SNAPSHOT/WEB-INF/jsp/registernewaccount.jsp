<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix ="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%--<%@ include file="/WEB-INF/jsp/search.jsp" %>--%>

<c:set var="root" scope="request">${pageContext.request.contextPath}</c:set>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Registrarse</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Sign up and Subscribe Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />

        <link href="${root}/css/css/style.css" rel="stylesheet" type="text/css"/>	
        <link href="${root}/css/css/font-awesome.css" rel="stylesheet"/>  

        <style type="text/css"> BODY{ font-family: "Open Sans", sans-serif; } </style>
    </head>
    <body>
        <div class="logoR">	
            <img src="${root}/img/logo_1.png" width="200" height="90" alt="">	
        </div>
        <div class="padre">
            <div class="w3layouts-main">
                <h2>Registrarse</h2>
                <form>
                    <div class="email">
                        <input placeholder="Correo electrónico" name="Correo" type="email" id="inputCorreoRna">
                        <span><i class="fa fa-envelope-o" aria-hidden="true"></i></span>
                    </div>
                    <div class="email">
                        <input placeholder="Contraseña" name="Password" type="password" id="inputContraseñaRna">
                        <span><i class="fa fa-unlock" aria-hidden="true"></i></span>
                    </div>
                    <div>
                        <input type="checkbox" name="sociedad" id="checkboxSoyInstitucionRna" value="false">
                        <label for="sociedad">Soy Institución</label><br>
                        <button type="button" class="btn btn-primaryCus btn-aceptar-rna">Aceptar</button>

                    </div>
                    <div class="cuenta">
                        <a href="${pageContext.request.contextPath}/signin/login" style="color: black;">Ya tengo cuenta</a>
                    </div>
                </form>
            </div>	
            <div class="clear"></div>
        </div>
        <div class="footer">
            <p>Enseña Ya! &copy; 2020 | Todos los derechos reservados</p>
        </div>
        <!-- </div> -->
        <script src="${root}/js/lib/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="${root}/js/vendor/bootstrap.min.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/registerNewAccountService.js" type="text/javascript"></script>
    </body>
</html>

