<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix ="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="root" scope="request">${pageContext.request.contextPath}</c:set>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Recuperar contraseña</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Sign up and Subscribe Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />

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
                <h2 style="font-size: 20px;">Recuperar contraseña</h2>					
                <form action="#" method="post">
                    <div class="email">
                        <input placeholder="Correo electrenico registrado" name="Email" type="email" id="emailReover" required>
                        <span class="icons i1"><i class="fa fa-envelope-o" aria-hidden="true"></i></span>
                    </div>
                    <button type="button" class="btn btn-primaryCus btn-senderEmail">Recuperar</button>

                    <div class="cuenta">
                        <a href="${pageContext.request.contextPath}/signin/login/" style="color: black;">Volver a intentar acceso</a>
                    </div>
                    <p>Si no estas registrado</p> 	
                    <a href="${pageContext.request.contextPath}/registernewaccount/newaccount" style="color: #74be7f; text-decoration:underline;">Registrate aqui</a> 

                </form>
            </div>	
            <div class="clear"></div>
        </div>
        <div class="footer">
            <p style="margin-top: 140px !important;">Enseña Ya! &copy; 2020 | Todos los derechos reservados</p>
        </div>
        <!-- </div> -->
        <script src="${root}/js/lib/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="${root}/js/vendor/bootstrap.min.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/recoverAccountService.js" type="text/javascript"></script>
    </body>
</html>
