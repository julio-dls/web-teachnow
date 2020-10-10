<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix ="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="root" scope="request">${pageContext.request.contextPath}</c:set>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html lang="es" class="no-js">
    <head>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta charset="UTF-8">
        <title>TeachNow</title>

        <link reñ="shortcut icon" href="${root}/img/images/empresa.png" alt=""/>
        <link href="${root}/css/registersCompany.css" rel="stylesheet" type="text/css"/>
        <style type="text/css"> BODY{ font-family: "Open Sans", sans-serif; } </style>

    </head>

    <body id="registro-body" class="page-registro">

        <div class="container-fluid" style="background-image: url(${root}/img/images/banner.jpg)">

            <div class="row">
                <div class="col-sm-12">
                    <div class="panel" id="panel-registro" tabindex="-1">
                        <form action="" method="POST" id="registroForm">
                            <div class="panel-header">
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <img src="${root}/img/images/empresa.png" style="height: 140px;">
                                            <h1>Registrar mi institución</h1>
                                            <h2>Completá los datos para crear una cuenta para tu institución.</h2>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-body">
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="cuit">
                                                    CUIT de la institución
                                                    <sup>*</sup>
                                                </label>
                                                <input type="text" required name="cuit" id="cuitInsitucion" class="form-control" aria-describedby="cuitInsitucion" data-idtributaria="cuitInsitucion">
                                            </div>
                                        </div>

                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="Puesto">
                                                    Razón Social
                                                    <sup>*</sup>
                                                </label>
                                                <input type="text" required name="razon_social" id="razonSocialInsitucion" class="form-control" aria-describedby="razonSocialInsitucion">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="nombre-emp">
                                                    Nombre de la institución
                                                    <sup>*</sup>
                                                </label>

                                                <input type="text"  class="form-control" id="nombreInsitucion" aria-describedby="nombre_emp" name="nombre_emp" required>
                                            </div>
                                        </div>

                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="telefono">
                                                    Teléfono
                                                </label>
                                                <input type="tel" id="telefonoInsitucion" name="telefonoInsitucion" autocomplete="off" class="form-control" required>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-sm-6">
                                            <div class="form-group mg0">
                                                <label for="nombrecontacto">
                                                    Tu nombre
                                                    <sup>*</sup>
                                                </label>

                                                <input type="text" class="form-control" id="nombrePersona" aria-describedby="nombrePersona" name="nombrePersona" required>
                                            </div>
                                        </div>

                                        <div class="col-sm-6">
                                            <div class="form-group mg0">
                                                <label for="apellido">
                                                    Tu apellido
                                                    <sup>*</sup>
                                                </label>
                                                <input type="text" class="form-control" id="apellidoPersona" aria-describedby="apellidoPersona" name="apellidoPersona" required>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row inputExport">
                                    </div>

                                </div>
                            </div>

                            <div class="panel-footer">
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <p class="required-fields-message">
                                                Los campos con
                                                <sup>*</sup>
                                                son obligatorios
                                            </p>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-sm-6">
                                            <button type="button" class="btn btn--primary btn-registrar-institucion" name="btnRegistrar">REGISTRAR </button>
                                        </div>
                                        <div class="col-sm-3">
                                            <!--<a href="/registersCompany/new" class="btn btn--default" name="btnCancelar">CANCELAR</a>-->
                                            <button type="button" class="btn btn--default" name="btnCancelar">CANCELAR </button>
                                        </div>
                                        <div class="col-sm-3">
                                            <button type="reset" class="btn btn--default">BORRAR </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer">
            <p>Enseña Ya! &copy; 2020 | Todos los derechos reservados</p>
        </div>
        <script src="${root}/js/lib/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="${root}/js/vendor/bootstrap.min.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/registersCompanyService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/registerNewAccountService.js" type="text/javascript"></script>

    </body>
</html>