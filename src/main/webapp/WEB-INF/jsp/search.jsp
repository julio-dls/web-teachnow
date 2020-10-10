<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix ="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="root" scope="request">${pageContext.request.contextPath}</c:set>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″ />
        <title>Ofertas de perfiles</title>

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="${root}/css/search.css" rel="stylesheet" type="text/css"/>
        <link href="${root}/css/modal.css" rel="stylesheet" type="text/css"/>
        <link href="${root}/css/css/font-awesome.css" rel="stylesheet"/>   
        <link href="${root}/css/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="${root}/js/lib/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="${root}/js/lib/bootstrap.min.js" type="text/javascript"></script>
        <style type="text/css"> BODY{font-family: "Open Sans", sans-serif; } </style>

    </head>

    <body style="background-color: #f5f5f5;">
        <div class="fondo-buscador pt-5">
            <div class="container pt-2">
                <div class="row">
                    <div class="col-12">
                        <form class="busquedas p-5">
                            <div class="form-row align-items-center">
                                <div class="col-md-8">
                                    <input placeholder="Escribe palabra clave" type="text" class="form-control pl-5" id="palabraCleve" >
                                </div>
                                <div class="col-md-3 alinear">
                                    <button style="float:right;" type="button" class="btn btn-info col-3 col-md-6" id="enviarBuscarPalabraClave">Buscar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <section class="mt-5">
            <div class="container">
                <div class="row">
                    <div class="col-12 col-md-3 bg-light">
                        <hr>
                        <ul class="list-unstyled">
                            <button type="button" class="btn btn-secondary btn-logout">Logout</button>
                        </ul>
                        <hr>
                        <p>Administracion</p>
                        <ul class="list-unstyled">
                            <c:forEach var="listSalario" items="${listSalario}">
                                <li class="text-info filtroSalario" data-idSalario="${listSalario.id}">${listSalario.monto}</li>
                                </c:forEach>
                        </ul>
                        <p>Laboral</p>
                        <ul class="list-unstyled">
                            <c:forEach var="listNivel" items="${listNivel}">
                                <li class="text-info filtroNivel" data-idNivel="${listNivel.id}">${listNivel.nombre}</li>
                                </c:forEach>
                        </ul>
                        <p>Tipo de puesto</p>
                        <ul class="list-unstyled">
                            <c:forEach var="listTipodepuesto" items="${listTipodepuesto}">
                                <li class="text-info filtroTipodepuesto" data-idTipodepuesto="${listTipodepuesto.id}">${listTipodepuesto.nombre}</li>
                                </c:forEach>
                        </ul>
                        <p>Lugar de trabajo</p>
                        <ul class="list-unstyled">
                            <c:forEach var="listZona" items="${listZona}">
                                <li class="text-info filtroZona" data-idZona="${listZona.id}">${listZona.nombre}</a></li>
                                </c:forEach>
                        </ul>
                    </div><!-- fin row -->

                    <!-- LISTA DE PERFILES -->
                    <div class="DivPalabraClave">
                    </div>

                    <div class="col-12 col-md-9">
                        <div class="div-listaperfiles">
                            <c:forEach var="listPerfil" items="${listPerfil}">
                                <div class="row border panel margenBottom p-2 margen div-modelPerfil" data-perfilId="${listPerfil.id}">
                                    <div class="col-6 col-sm-3">
                                        <img src="${root}/img/${listPerfil.id}/img_${listPerfil.id}_cv.jpg" alt="img" class="img-fluid img-thumbnail">
                                    </div>

                                    <div class="col-md-7">
                                        <h5 style="font-size: 1.1rem; font-weight: normal !important;">${listPerfil.persona.apellido}, ${listPerfil.persona.nombre}</h5> 

                                        <c:forEach var="listEstudios" items="${listPerfil.estudios}">
                                            <h6 style="font-size: 13px; font-weight: normal !important;">${listEstudios.titulo}, ${listEstudios.nivelestudio}, ${listEstudios.estado}, ${listEstudios.instituto}, ${listEstudios.carrera}</h6>
                                        </c:forEach>

                                        <c:forEach var="listtecnologias" items="${listPerfil.tecnologias}">
                                            <p style="font-size: 13px;">${listtecnologias.tecnologia}, ${listtecnologias.nivel}<a href="#myModal" data-toggle="modal" class="text-info">  Ver más</a> </p>
                                        </c:forEach>
                                    </div>
                                    <div class="col-6 col-md-2">
                                        <a href="${root}/search/buscar/csv/${listPerfil.id}/${listPerfil.id}/${listPerfil.persona.nombre}_${listPerfil.persona.apellido}" class="text-info descargarcv">Descargar CV  <i class="fa fa-download"></i></a>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>

                        <!-- Inicio Modal -->
                        <div class="modal" id="myModal">
                            <div class="modal-dialog">
                                <div class="modal-content">

                                    <!-- Modal Header -->
                                    <div class="modal-header">
                                        <button type="button" class="close close_self" data-dismiss="modal">&times;</button>
                                    </div>
                                    
                                    <!-- Modal body -->
                                    <div class="modal-body" id="help_modal">
                                        <div class="main-wrapper">
                                            <div class="container px-3 px-lg-5">
                                                <article class="resume-wrapper mx-auto theme-bg-light p-5 mb-5 my-5 shadow-lg">

                                                    <div class="resume-header">
                                                        <div class="row align-items-center">
                                                            <div class="resume-title col-12 col-md-6 col-lg-8 col-xl-9 div-nombre-titulo">

                                                            </div><!--//resume-title-->
                                                            <div class="resume-contact col-12 col-md-6 col-lg-4 col-xl-3 div-redes-socialees">

                                                            </div><!--//resume-contact-->
                                                        </div><!--//row-->

                                                    </div><!--//resume-header-->
                                                    <hr>
                                                    <div class="resume-intro py-3">
                                                        <div class="media flex-column flex-md-row align-items-center div-modal-img-acercademi">
                                                            <!--//media-body-->
                                                        </div>
                                                    </div><!--//resume-intro-->
                                                    <hr>
                                                    <div class="resume-body">
                                                        <div class="row">
                                                            <div class="resume-main col-12 col-lg-8 col-xl-9 pr-0 pr-lg-5">
                                                                <section class="work-section py-3">
                                                                    <h3 class="text-uppercase resume-section-heading mb-4">Experiencias laborales</h3>
                                                                    <div class="div-experiencia-laboral">

                                                                    </div><!--//item-->
                                                                </section><!--//work-section-->
                                                            </div><!--//resume-main-->

                                                            <aside class="resume-aside col-12 col-lg-4 col-xl-3 px-lg-4 pb-lg-4">
                                                                <section class="skills-section py-3">
                                                                    <h3 class="text-uppercase resume-section-heading mb-4">Habilidades</h3>
                                                                    <div class="item div-habilidades">
                                                                    </div>
                                                                </section><!--//skills-section-->

                                                                <section class="education-section py-3">
                                                                    <h3 class="text-uppercase resume-section-heading mb-4">Educación</h3>
                                                                    <div class="div-educacion">

                                                                    </div>
                                                                </section><!--//education-section-->

                                                                <section class="skills-section py-3">
                                                                    <h3 class="text-uppercase resume-section-heading mb-4">Idiomas</h3>
                                                                    <div class="div-idiomas">

                                                                    </div>
                                                                </section><!--//certificates-section-->


                                                            </aside><!--//resume-aside-->
                                                        </div><!--//row-->
                                                    </div><!--//resume-body-->
                                                    <hr>
                                                    <div class="resume-footer text-center div-linkedin">

                                                    </div><!--//resume-footer-->
                                                </article>

                                            </div><!--//container-->

                                        </div><!--//main-wrapper-->
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Fin del modal -->    
                    </div>  <!-- FIN LISTA DE PERFILES -->

                    <!-- paginacion -->
                    <div class="col-12 mt-5">
                        <nav aria-label="Page navigation example">
                            <ul style="float:right;" class="pagination">
                                <c:if test="${current != 0}">
                                    <li class="page-item page-link" aria-label="Previous" data-page="${prev}" data-urlFiltro="${filtro}" data-filtroId="${idFiltro}">
                                        <span aria-hidden="true">&laquo;</span>
                                    </li>
                                </c:if>
                                <li class="page-item page-link" data-page="${current}" data-urlFiltro="${filtro}" data-filtroId="${idFiltro}" id="paginadoLi">
                                    <c:out value="${current}"/>
                                </li>
                                <c:if test="${current != last}">
                                    <li class="page-item page-link" aria-label="Next" data-page="${next}" data-urlFiltro="${filtro}" data-filtroId="${idFiltro}">
                                        <span aria-hidden="true">&raquo;</span>
                                    </li>
                                </c:if>
                            </ul>
                        </nav>
                    </div>
                    <!--Fin Paginado-->

                    <!-- end col -->
                </div><!-- fin row -->

            </div><!-- end container -->
        </section><!-- end section -->
        <div class="footer">
            <p>Enseña Ya! &copy; 2020 | Todos los derechos reservados</p>
        </div>
        <script src="${root}/js/lib/bootstrap.min.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/searchService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/modalSearchService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/signinService.js" type="text/javascript"></script>
    </body>

</html>