<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix ="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%--<%@ include file="/WEB-INF/jsp/search.jsp" %>--%>

<c:set var="root" scope="request">${pageContext.request.contextPath}</c:set>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es" class="no-js">
    <head>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Favicon-->
        <link rel="shortcut icon" href="img/fav.png">
        <!-- Author Meta -->
        <meta name="author" content="CodePixar">
        <!-- Meta Description -->
        <meta name="description" content="">
        <!-- Meta Keyword -->
        <meta name="keywords" content="">
        <!-- meta character set -->
        <meta charset="UTF-8">
        <!-- Site Title -->
        <title>TeachNow</title>

        <link href="https://fonts.googleapis.com/css?family=Poppins:300,500,600" rel="stylesheet">
        <!-- CSS	============================================= -->
        <link href="${root}/css/linearicons.css" rel="stylesheet" type="text/css">
        <link href="${root}/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="${root}/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="${root}/css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="main-wrapper-first">
            <div class="hero-area relative">
                <header>
                    <div class="container">
                        <div class="header-wrap">
                            <div class="header-top d-flex justify-content-between align-items-center">
                                <div class="logo">
                                    <a href="index.html"><img src="img/logo.png" alt=""></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </header>
                <div class="banner-area">
                    <div class="container">
                        <div class="row height align-items-center">
                            <div class="col-lg-7">
                                <div class="banner-content">
                                    <h1 class="text-white text-uppercase mb-10">DEJA DE BUSCAR EN CUALQUIER LUGAR, <br> ESTE ES EL MEJOR SITIO EN LA WEB</h1>
                                    <p class="text-white mb-30">Cientos de oportunidades para expandir tu vocación en un solo lugar.</p>
                                    <a href="${pageContext.request.contextPath}/registernewaccount/newaccount" class="primary-btn d-inline-flex align-items-center"><span class="mr-10">Registrarse</span><span class="lnr lnr-arrow-right"></span></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="main-wrapper">
            <div class="working-process-area">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-lg-6">
                            <div class="section-title text-center">
                                <h2>¿Cómo funciona nuestra web? </h2>
                                <p>Los pasos a seguir son sencillos y no te tomarán más de unos pocos minutos.</p>
                            </div>
                        </div>
                    </div>
                    <div class="total-work-process d-flex flex-wrap justify-content-around align-items-center">
                        <div class="single-work-process">
                            <div class="work-icon-box">
                                <span class="lnr lnr-pencil"></span>
                            </div>
                            <h4 class="caption">1. Registrarse</h4>
                        </div>
                        <div class="work-arrow">
                            <img src="img/elements/work-arrow.png" alt="">
                        </div>
                        <div class="single-work-process">
                            <div class="work-icon-box">
                                <span class="lnr lnr-user"></span>
                            </div>
                            <h4 class="caption">2. Completar perfil</h4>
                        </div>
                        <div class="work-arrow">
                            <img src="img/elements/work-arrow.png" alt="">
                        </div>
                        <div class="single-work-process">
                            <div class="work-icon-box">
                                <span class="lnr lnr-file-add"></span>
                            </div>
                            <h4 class="caption">3. Adjuntar CV</h4>
                        </div>
                        <div class="work-arrow">
                            <img src="img/elements/work-arrow.png" alt="">
                        </div>
                        <div class="single-work-process">
                            <div class="work-icon-box">
                                <span class="lnr lnr-checkmark-circle"></span>
                            </div>
                            <h4 class="caption">4. Enviar perfil</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="main-wrapper">
            <section class="footer-widget-area">

                <footer>
                    <div class="footer">
                        <p>Enseña Ya! &copy; 2020 | Todos los derechos reservados</p>
                    </div>
                </footer>
            </section>
            <!-- End Footer Widget Area -->
        </div>
        
        <script src="${root}/js/vendor/jquery-2.2.4.min.js"></script>
        <script src="${root}/js/vendor/bootstrap.min.js"></script>
        <script src="${root}/js/main.js"></script>
    </body>
</html>
