<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix ="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="root" scope="request">${pageContext.request.contextPath}</c:set>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">

        <title>TeachNow</title>

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
        <link href="${root}/css/bootstrap-datepicker.min.css" rel="stylesheet" type="text/css"/>
        <link href="${root}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${root}/css/normalize.css" rel="stylesheet" type="text/css"/>
        <link href="${root}/css/main.css" rel="stylesheet" type="text/css"/>
        <link href="${root}/css/register.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>

        <div class="main-wrapper">
            <div class="container-fluid">

                <!-- DATOS PERSONALES -->
                <section id="DATOS_PERSONALES">
                    <div class="row">
                        <div class="col-md-12 bg-success">
                            <c:choose>
                                <c:when test="${not empty nPerfil.id}">
                                    <button  style="margin-top: 10px" type="button" class="btn btn-primaryCus btn-logout text-center">Logout</button>
                                    <hr>
                                </c:when>
                            </c:choose>
                            <h2>Datos personales</h2>

                        </div>
                    </div>
                    <c:choose>
                        <c:when test="${empty nPerfil.id}">
                            <div class="row">
                                <div class="col-md-8 form_alineado">
                                    <div class="alert alert-danger" role="alert" id="alertPF">
                                        No tiene Datos personales cargados
                                    </div>
                                </div>
                            </div>
                        </c:when>
                    </c:choose>
                    <c:choose>
                        <c:when test="${not empty nPerfil.id}">
                            <div class="row">
                                <div class="col-md-8 form_alineado">
                                    <div class="card">
                                        <div class="card-header">
                                            <dt class="col-sm-3"><img src="${root}/<c:url value="${fotoCV}"/>" class="rounded-circle rounded-right" alt="${fotoCV}"></dt>
                                            <div class=""></div>
                                            <dt class="col-sm-9">${nPerfil.persona.apellido}, ${nPerfil.persona.nombre}</dt>
                                        </div>
                                        <div class="card-body" >
                                            <dl class="row" id="personaId" data-id-perfil="${nPerfil.id}" data-id-persona="${nPerfil.persona.id}"> 

                                                <dt class="col-sm-3">Fecha de Nacimiento</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.fechanacimiento}</p></dd> 

                                                <dt class="col-sm-3">Nacionaliad</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.nacionalidad}</p></dd> 

                                                <dt class="col-sm-3">País</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.pais}</p></dd> 

                                                <dt class="col-sm-3">Provincia</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.region}</p></dd> 

                                                <dt class="col-sm-3">Ciudad</dt>
                                                <dd class="col-sm-9"><p>${listaCiudadPorId.nombre}</p></dd> 

                                                <dt class="col-sm-3">Zona</dt>
                                                <dd class="col-sm-9"><p>${listaZonaPorId.nombre}</p></dd> 

                                                <dt class="col-sm-3">Dirección</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.direccion}</p></dd> 

                                                <dt class="col-sm-3">Teléfono</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.telefono}</p></dd> 

                                                <dt class="col-sm-3">Documento</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.documento}</p></dd> 

                                                <dt class="col-sm-3">Vehículo</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.vehiculo}</p></dd>    

                                                <dt class="col-sm-3">Discapacidad</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.discapacidad}</p></dd> 

                                                <dt class="col-sm-3">Código Postal</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.cp}</p></dd> 

                                                <dt class="col-sm-3">Estado Civíl</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.estadocivil}</p></dd> 

                                                <dt class="col-sm-3">Género</dt>
                                                <dd class="col-sm-9"><p>${nPerfil.persona.genero}</p></dd> 

                                                <dt class="col-sm-3">Tipo de Puesto</dt>
                                                <dd class="col-sm-9"><p>${listaTipodeuestoPorId.nombre}</p></dd> 

                                                <dt class="col-sm-3">Nivel</dt>
                                                <dd class="col-sm-9"><p>${listaNivelPorId.nombre}</p></dd> 

                                                <dt class="col-sm-3">Remuneracion Pretendida</dt>
                                                <dd class="col-sm-9"><p>${listaSalarioPorId.monto}</p></dd> 

                                            </dl>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </c:when>
                    </c:choose>

                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <button type="button" class="btn btn-primaryCus text-center" data-toggle="modal" data-target=".bd-datos-personales-modal-lg">Agregar</button>
                        </div>
                    </div>

                    <c:choose>
                        <c:when test="${empty nPerfil.id}">
                            <!--MODAL DATOS PERSONALES-->
                            <div class="modal fade bd-datos-personales-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content">
                                        <div class="modal-header modalCus">
                                            <h5 class="modal-title">Datos personales</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="row">

                                            <!-- col-md-8 -->
                                            <div class="col-md-8 form_alineado">
                                                <form>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaNombre" class=" col-form-label">Nombre</label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-10">
                                                            <input type="text" class="form-control" id="personaNombre" placeholder="nombre">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaApellido" class="col-form-label">Apellido</label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-10">
                                                            <input type="text" class="form-control" id="personaApellido" placeholder="Apellido">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaTipodocumento" class="col-form-label">Tipo de identificación<span class="glyphicon glyphicon-search" aria-hidden="true"></span></label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-4">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaTipodocumento">
                                                                <option value="Pasaporte">Pasaporte</option>
                                                                <option value="Libreta Cívica">Libreta Civica</option>
                                                                <option value="Cédula de Identidad">Cedula de Identidad</option>
                                                                <option value="Libreta de Enrolamient">Libreta de Enrolamiento</option>
                                                                <option value="DNI" selected>DNI</option>
                                                            </select>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <input type="text" class="form-control mb-2 mr-sm-2" id="personaDocumento" placeholder="">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaFechanacimiento" class="col-form-label">Fecha de nacimiento</label>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-10">
                                                                <div class='input-group date' data-provide="datepicker">
                                                                    <input class="form-control" id="personaFechanacimiento" placeholder="1999-01-01"/>
                                                                    <span class="input-group-addon"><i class="fas fa-calendar-alt"></i></span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <div class="form-check-inline">
                                                                <label for="personaGenero" class="form-check-label"> Género <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-4">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaGenero">
                                                                <option value="Femenino" selected>Femenino</option>
                                                                <option value="Masculino">Masculino</option>                                       
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaEstadocivil" class=" col-form-label">Estado Cívil<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaEstadocivil" class="cm-12" name="DLec">
                                                                <option value="Soltero" selected>Soltero(a)</option>
                                                                <option value="Casado(a)">Casado(a)</option>
                                                                <option value="Separado(a)">Separado(a)/Divorcia</option>
                                                                <option value="Viudo(a)">Viudo(a)</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaTipotelefono" class=" col-form-label">Teléfono<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-5">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaTipotelefono" class="cm-12" name="DLec">
                                                                <option value="Celudar" selected>Celular</option>
                                                                <option value="Fijo">Fijo</option>
                                                                <option value="Oficina">Oficina</option>
                                                            </select>
                                                        </div>
                                                        <div class="col-sm-5">
                                                            <input type="text" class="form-control" id="personaTelefono" placeholder="Número">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personadirskype" class=" col-form-label">Linkedin</label>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <input type="text" class="form-control" id="personadirskype" placeholder="linkedin.com/in/username">
                                                        </div>
                                                    </div>

                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaPais" class=" col-form-label">País<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaPais" class="cm-12" name="DLec">
                                                                <option value="Argentina" selected> Argentina </option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaRegion" class=" col-form-label">Provincia<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaProvincia" class="cm-12" name="DLec">
                                                                <c:forEach var="lProvincias" items="${listaProvincias}">
                                                                    <option value="${lProvincias.nombre}">${lProvincias.nombre}</option>
                                                                </c:forEach>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaRegion" class=" col-form-label">Ciudad<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaCiudad" class="cm-12" name="DLec">
                                                                <c:forEach var="lCiudad" items="${listaCiudad}">
                                                                    <option value="${lCiudad.id}">${lCiudad.nombre}</option>
                                                                </c:forEach>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaCiudad" class=" col-form-label">Zona<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaZona" class="cm-12" name="DLec">>
                                                                <c:forEach var="lZona" items="${listaZona}">
                                                                    <option value="${lZona.id}">${lZona.nombre}</option>
                                                                </c:forEach>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personacp" class=" col-form-label">Código Postal</label>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <input type="text" class="form-control" id="personacp" placeholder="Código Postal">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaDireccion" class=" col-form-label">Dirección</label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <input type="text" class="form-control" id="personaDireccion" placeholder="Dirección">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaNacionalidad" class=" col-form-label">Nacionalidad<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaNacionalidad" class="cm-12" name="DLec">
                                                                <c:forEach var="lNacionalidades" items="${listaNacionalidades}">
                                                                    <option value="${lNacionalidades.nombre}">${lNacionalidades.nombre}</option>
                                                                </c:forEach>
                                                            </select>
                                                        </div>
                                                    </div>

                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaLicconducir" class=" col-form-label">Licencia de conducir<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaLicconducir" class="cm-12" name="DLec">
                                                                <option value="A1" selected>A1</option>
                                                                <option value="">A2</option>
                                                                <option value="">A2.1</option>
                                                                <option value="">A2.2</option>
                                                                <option value="">A3</option>
                                                                <option value="">B1</option>
                                                                <option value="">B2</option>
                                                                <option value="">C2</option>
                                                                <option value="9">D1</option>
                                                                <option value="10">D2</option>
                                                                <option value="11">E1</option>
                                                                <option value="12">E2</option>
                                                                <option value="13">F</option>
                                                                <option value="14">G1</option>
                                                                <option value="15">G2</option>
                                                                <option value="16">No tengo</option>
                                                            </select>
                                                        </div>
                                                    </div>

                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <div class="form-check-inline">
                                                                <label for="personaVehiculo" class="form-check-label"> Dispone de vehículo propio <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaVehiculo" class="cm-12" name="DLec">
                                                                <option value="si">Si</option>
                                                                <option value="no" selected>No</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <div class="form-check-inline">
                                                                <label for="personaDiscapacidad" class="form-check-label"> Discapacidad <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaDiscapacidad" class="cm-12" name="DLec">
                                                                <option value="si">Si</option>
                                                                <option value="no" selected>No</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaUsuario" class=" col-form-label">Usuario</label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <input type="text" class="form-control" id="personaUsuario" placeholder="Usuario">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaContraseña" class=" col-form-label">Contraseña</label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <input type="password" class="form-control" id="personaContraseña" placeholder="Contraseña">
                                                        </div>
                                                    </div>

                                                    <div class="form-group row centrar_btn">
                                                        <p>
                                                            <button type="button" data-contador="1" class="btn btn-primaryCus btn-listo-p">Listo</button>
                                                            <button type="reset" class="btn btn-EliminarCus btn-limpiar-pf">Limpiar</button>
                                                        </p>
                                                    </div>
                                                </form>
                                            </div>
                                            <!-- col-md-8 -->
                                        </div>
                                        <!-- row -->
                                    </div>
                                </div>
                            </div>
                        </c:when>
                    </c:choose>
                    <!-- FIN MODAL DATOS PERSONALES -->

                    <!--MODAL MODIFICAR DATOS PERSONALES-->
                    <c:choose>
                        <c:when test="${not empty nPerfil.id}">
                            <div class="modal fade bd-datos-personales-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content">
                                        <div class="modal-header modalCus">
                                            <h5 class="modal-title">Datos personales</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="row">

                                            <!-- col-md-8 -->
                                            <div class="col-md-8 form_alineado">
                                                <form>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaNombre" class=" col-form-label">Nombre</label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-10">
                                                            <input type="text" class="form-control" id="personaNombre" placeholder="nombre" value="${nPerfil.persona.nombre}">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaApellido" class="col-form-label">Apellido</label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-10">
                                                            <input type="text" class="form-control" id="personaApellido" placeholder="Apellido" value="${nPerfil.persona.apellido}">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaTipodocumento" class="col-form-label">Tipo de identificación<span class="glyphicon glyphicon-search" aria-hidden="true"></span></label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-4">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaTipodocumento">
                                                                <option value="${nPerfil.persona.tipodocumento}" selected>${nPerfil.persona.tipodocumento}</option>
                                                                <option value="Pasaporte">Pasaporte</option>
                                                                <option value="Libreta Cívica">Libreta Civica</option>
                                                                <option value="Cédula de Identidad">Cedula de Identidad</option>
                                                                <option value="Libreta de Enrolamient">Libreta de Enrolamiento</option>
                                                                <option value="DNI">DNI</option>
                                                            </select>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <input type="text" class="form-control mb-2 mr-sm-2" id="personaDocumento" placeholder="" value="${nPerfil.persona.documento}">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaFechanacimiento" class="col-form-label">Fecha de nacimiento</label>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-10">
                                                                <div class='input-group date' data-provide="datepicker">
                                                                    <input class="form-control" id="personaFechanacimiento" placeholder="1999-01-01" value="${nPerfil.persona.fechanacimiento}">
                                                                    <span class="input-group-addon"><i class="fas fa-calendar-alt"></i></span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <div class="form-check-inline">
                                                                <label for="personaGenero" class="form-check-label"> Género <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-4">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaGenero">
                                                                <option value="${nPerfil.persona.genero}" selected>${nPerfil.persona.genero}</option>
                                                                <option value="Femenino">Femenino</option>
                                                                <option value="Masculino">Masculino</option>                                       
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaEstadocivil" class=" col-form-label">Estado Cívil<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaEstadocivil" class="cm-12" name="DLec">
                                                                <option value="${nPerfil.persona.estadocivil}" selected>${nPerfil.persona.estadocivil}</option>
                                                                <option value="Soltero">Soltero(a)</option>
                                                                <option value="Casado(a)">Casado(a)</option>
                                                                <option value="Separado(a)">Separado(a)/Divorcia</option>
                                                                <option value="Viudo(a)">Viudo(a)</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaTipotelefono" class=" col-form-label">Teléfono<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-5">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaTipotelefono" class="cm-12" name="DLec">
                                                                <option value="${nPerfil.persona.tipotelefono}" selected>${nPerfil.persona.tipotelefono}</option>
                                                                <option value="Celuar">Celular</option>
                                                                <option value="Fijo">Fijo</option>
                                                                <option value="Oficina">Oficina</option>
                                                            </select>
                                                        </div>
                                                        <div class="col-sm-5">
                                                            <input type="text" class="form-control" id="personaTelefono" placeholder="Número" value="${nPerfil.persona.telefono}">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personadirskype" class=" col-form-label">Linkedin</label>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <input type="text" class="form-control" id="personadirskype" placeholder="linkedin.com/in/username" value="${nPerfil.persona.dirskype}">
                                                        </div>
                                                    </div>

                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaPais" class=" col-form-label">País<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaPais" class="cm-12" name="DLec">
                                                                <option value="${nPerfil.persona.pais}" selected>${nPerfil.persona.pais}</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaRegion" class=" col-form-label">Provincia<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaProvincia" class="cm-12" name="DLec">
                                                                <option value="${nPerfil.persona.region}" selected>${nPerfil.persona.region}</option>
                                                                <c:forEach var="lProvincias" items="${listaProvincias}">
                                                                    <option value="${lProvincias.nombre}">${lProvincias.nombre}</option>
                                                                </c:forEach>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaRegion" class=" col-form-label">Ciudad<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaCiudad" class="cm-12" name="DLec">
                                                                <option value="${nPerfil.persona.ciudad}" selected>${nPerfil.persona.ciudad}</option>
                                                                <c:forEach var="lCiudad" items="${listaCiudad}">
                                                                    <option value="${lCiudad.id}">${lCiudad.nombre}</option>
                                                                </c:forEach>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaCiudad" class=" col-form-label">Zona<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaZona" class="cm-12" name="DLec">>
                                                                <option value="${listaZonaPorId.id}" selected>${listaZonaPorId.nombre}</option>
                                                                <c:forEach var="lZona" items="${listaZona}">
                                                                    <option value="${lZona.id}">${lZona.nombre}</option>
                                                                </c:forEach>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personacp" class=" col-form-label">Código Postal</label>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <input type="text" class="form-control" id="personacp" placeholder="Código Postal" value="${nPerfil.persona.cp}">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaDireccion" class=" col-form-label">Dirección</label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <input type="text" class="form-control" id="personaDireccion" placeholder="Dirección" value="${nPerfil.persona.direccion}">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaNacionalidad" class=" col-form-label">Nacionalidad<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaNacionalidad" class="cm-12" name="DLec">
                                                                <option value="${nPerfil.persona.nacionalidad}" selected>${nPerfil.persona.nacionalidad}</option>
                                                                <c:forEach var="lNacionalidades" items="${listaNacionalidades}">
                                                                    <option value="${lNacionalidades.nombre}">${lNacionalidades.nombre}</option>
                                                                </c:forEach>
                                                            </select>
                                                        </div>
                                                    </div>

                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaLicconducir" class=" col-form-label">Licencia de conducir<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaLicconducir" class="cm-12" name="DLec">
                                                                <option value="${nPerfil.persona.licconducir}" selected>${nPerfil.persona.licconducir}</option>
                                                                <option value="A1">A1</option>
                                                                <option value="">A2</option>
                                                                <option value="">A2.1</option>
                                                                <option value="">A2.2</option>
                                                                <option value="">A3</option>
                                                                <option value="">B1</option>
                                                                <option value="">B2</option>
                                                                <option value="">C2</option>
                                                                <option value="9">D1</option>
                                                                <option value="10">D2</option>
                                                                <option value="11">E1</option>
                                                                <option value="12">E2</option>
                                                                <option value="13">F</option>
                                                                <option value="14">G1</option>
                                                                <option value="15">G2</option>
                                                                <option value="16">No tengo</option>
                                                            </select>
                                                        </div>
                                                    </div>

                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <div class="form-check-inline">
                                                                <label for="personaVehiculo" class="form-check-label"> Dispone de vehículo propio <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaVehiculo" class="cm-12" name="DLec">
                                                                <option value="${nPerfil.persona.vehiculo}" selected>${nPerfil.persona.vehiculo}</option>
                                                                <option value="si">Si</option>
                                                                <option value="no">No</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <div class="form-check-inline">
                                                                <label for="personaDiscapacidad" class="form-check-label"> Discapacidad <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <select class="form-control mb-2 mr-sm-2" id="personaDiscapacidad" class="cm-12" name="DLec">
                                                                <option value="${nPerfil.persona.discapacidad}" selected>${nPerfil.persona.discapacidad}</option>
                                                                <option value="si">Si</option>
                                                                <option value="no">No</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaUsuario" class=" col-form-label">Usuario</label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <input type="text" class="form-control" id="personaUsuario" placeholder="Usuario">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <div class="col-md-2 label_alineado">
                                                            <label for="personaContraseña" class=" col-form-label">Contraseña</label>
                                                            <span class="rojo">*</span>
                                                        </div>
                                                        <div class="col-md-10 col-sm-10">
                                                            <input type="password" class="form-control" id="personaContraseña" placeholder="Contraseña">
                                                        </div>
                                                    </div>

                                                    <div class="form-group row centrar_btn">
                                                        <p>
                                                            <button type="button" data-idPerfil="${nPerfil.persona.id}" class="btn btn-primaryCus btn-modificar-p">Modificar</button>
                                                            <button type="button" data-idPerfil="${nPerfil.persona.id}" class="btn btn-primaryCus btn-eliminar-p">Eliminar</button>
                                                            <button type="reset" class="btn btn-EliminarCus btn-limpiar-pf">Limpiar</button>
                                                        </p>
                                                    </div>
                                                </form>
                                            </div>
                                            <!-- col-md-8 -->
                                        </div>
                                        <!-- row -->
                                    </div>
                                </div>
                            </div>
                        </c:when>
                    </c:choose>
                    <!-- FIN MODAL MODIFICAR DATOS PERSONALES -->
                </section>
                <!-- FIN DATOS PERSONALES -->

                <!-- PERFIL PROFESIONAL -->
                <section id="PERFIL_PROFESIONAL">
                    <div class="row">
                        <div class="col bg-success">
                            <h2>Perfil profesional</h2>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <c:choose>
                                <c:when test="${empty listaAcercademi}">
                                    <div class="alert alert-danger" role="alert">
                                        Sin Perfil profesional
                                    </div>
                                </c:when>
                            </c:choose>
                        </div>
                    </div>

                    <c:forEach var="acercademi" items="${listaAcercademi}">
                        <div class="row">
                            <div class="col-md-8 form_alineado">
                                <div class="card text-center">
                                    <div class="card-header">
                                        ${acercademi.area}
                                    </div>
                                    <div class="card-body">
                                        <h5 class="card-title">Acerca de mi</h5>
                                        <p class="card-text">${acercademi.quiensoy}</p>
                                        <button type="button" class="btn btn-primary btn-eliminar-pp" data-id-perfilprofesional="${acercademi.id}">Eliminar</button>
                                    </div>
                                    <div class="card-footer text-muted">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <button type="button" class="btn btn-primaryCus text-center" data-toggle="modal" data-target=".bd-perfil_profesional-modal-lg">Agregar</button>
                        </div>
                    </div>
                    <!-- MODAL PERFIL PROFESIONAL -->
                    <div class="modal fade bd-perfil_profesional-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header modalCus">
                                    <h5 class="modal-title">Perfil profesional</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="row">

                                    <!-- col-md-8 -->
                                    <div class="col-md-8 form_alineado">
                                        <form>
                                            <div class="form-group">
                                                <div class="form-group row">
                                                    <label for="perfilProfesionalArea">Cargo o título breve del currículum</label>
                                                    <span class="rojo">*</span>
                                                    <input type="text" class="form-control" id="perfilProfesionalArea" placeholder="Ej: Analista en sistemas">
                                                </div>
                                                <div class="form-group row">
                                                    <label for="perfilProfesionalQuiensoy"> Descripción breve de tu perfil profesional</label>
                                                    <span class="rojo">*</span>
                                                    <textarea type="text" class="form-control" id="perfilProfesionalQuiensoy" placeholder="Quienes somos, experiencia laboral y cuáles son las habilidades y talentos que nos definen en el campo laboral (Se breve, concreto y claro)" rows="5" cols="10" resize="none" maxlength="500"></textarea>
                                                    <div class="contador">
                                                        <p>(máximo 500 caracteres)</p>
                                                    </div>
                                                </div>

                                                <div class="form-group row centrar_btn">
                                                    <p>
                                                        <button type="button" data-contador="1" data-idPerfil="${nPerfil.id}" class="btn btn-primaryCus btn-listo-pp">Listo</button>
                                                        <button type="reset" class="btn btn-EliminarCus btn-limpiar-pp">Limpiar</button>
                                                    </p>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- col-md-8 -->
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- FIN MODAL PERFIL PROFESIONAL -->
                </section>
                <!-- FIN PERFIL PROFESIONAL -->

                <!-- PREFERNCIA LABORAL -->
                <section id="PREFERENCIA">
                    <div class="row">
                        <div class="col-md-12 bg-success">
                            <h2>Preferencia laboral</h2>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <c:choose>
                                <c:when test="${empty nPerfil.id}">
                                    <div class="alert alert-danger" role="alert">
                                        Sin Preferencia laboral
                                    </div>
                                </c:when>
                            </c:choose>
                        </div>
                    </div>
                    <c:choose>
                        <c:when test="${not empty nPerfil.id}">
                            <div class="row">
                                <div class="col-md-8 form_alineado">
                                    <div class="alert alert-success" role="alert" id="alertPF">
                                        Detalles en el panel principal
                                    </div>
                                </div>
                            </div>
                        </c:when>
                    </c:choose>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <button type="button" class="btn btn-primaryCus" data-toggle="modal" data-target=".bd-pfLaboral-modal-lg">Agregar</button>
                        </div>
                    </div>

                    <!-- MODAL PREFERENCIA LABORAL -->
                    <div class="modal fade bd-pfLaboral-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header modalCus">
                                    <h5 class="modal-title">Preferencia laboral</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 form_alineado">
                                        <form>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="tipoDePuesto" class=" col-form-label">Tipo de puesto deseado</label>
                                                    <span class="rojo">*</span>
                                                </div>
                                                <div class="col-md-10 col-sm-10">
                                                    <select class="form-control mb-2 mr-sm-2" id="pfTipodepuesto" class="cm-12" name="DLec">
                                                        <c:forEach var="pfTipodepuesto" items="${listaTipodeuesto}">
                                                            <option value="${pfTipodepuesto.id}">${pfTipodepuesto.nombre}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="Nivel" class=" col-form-label">Nivel</label>
                                                    <span class="rojo">*</span>
                                                </div>
                                                <div class="col-md-10 col-sm-10">
                                                    <select class="form-control mb-2 mr-sm-2" id="pfNivel" class="cm-12" name="DLec">
                                                        <c:forEach var="lNivel" items="${listaNivel}">
                                                            <option value="${lNivel.id}">${lNivel.nombre}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="sueldoDeseado" class=" col-form-label">Remuneración pretendida</label>
                                                    <span class="rojo">*</span>
                                                </div>
                                                <div class="col-md-10 col-sm-10">
                                                    <select class="form-control mb-2 mr-sm-2" id="pfSalario" class="cm-12" name="DLec">
                                                        <c:forEach var="pfSalario" items="${listaSalario}">
                                                            <option value="${pfSalario.id}">${pfSalario.monto}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group row centrar_btn">
                                                <p>
                                                    <button type="button" data-idPerfil="${nPerfil.id}" class="btn btn-primaryCus btn-listoPreferenciaLaboral">Listo</button>
                                                    <button type="reset" class="btn btn-EliminarCus">Limpiar</button>
                                                </p>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- col-md-8 -->
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- FIN MODAL FIN PREFERENCIA LABORAL -->
                </section>
                <!-- FIN PREFERENCIA LABORAL -->

                <!-- EXPERIENCIA LABORAL -->
                <section id="EXPERIENCIA_LABORAL">
                    <div class="row">
                        <div class="col-md-12 bg-success">
                            <h2>Experiencias laboral</h2>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <c:choose>
                                <c:when test="${empty listaEmpleos}">
                                    <div class="alert alert-danger" role="alert">
                                        Sin Experiencia laboral
                                    </div>
                                </c:when>
                            </c:choose>
                        </div>
                    </div>
                    <c:forEach var="empleos" items="${listaEmpleos}">
                        <div class="row">
                            <div class="col-md-8 form_alineado">
                                <div class="card text-center">
                                    <div class="card-header">
                                        ${empleos.empresa}
                                    </div>
                                    <div class="card-body">
                                        <h5 class="card-title">${empleos.cargo}</h5>
                                        <p class="card-text">${empleos.responsabilidad}</p>
                                        <button type="button" class="btn btn-primary btn-eliminar-el" data-id-empleo="${empleos.id}">Eliminar</button>
                                    </div>
                                    <div class="card-footer text-muted">
                                        Incion ${empleos.fechainicio} - fin ${empleos.fechafin}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <button type="button" class="btn btn-primaryCus" data-toggle="modal" data-target=".bd-experiencia-laboral-modal-lg">Agregar</button>
                        </div>
                    </div>
                    <!-- MODAL EXPERIENCIA LABORAL -->
                    <div class="modal fade bd-experiencia-laboral-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header modalCus">
                                    <h5 class="modal-title">Experiencia laboral</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 form_alineado">
                                        <form>
                                            <div class="form-group">
                                                <div class="form-check">
                                                    <input type="checkbox" class="form-check-input" id="empleoCheck">
                                                    <label class="form-check-label" for="empleoCheck"> No tengo ninguna experiencia</label>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="empleoCargo">Cargo</label>
                                                    <span class="rojo">*</span>
                                                    <input type="email" class="form-control" id="empleoCargo" aria-describedby="emailHelp" placeholder="Cargo">
                                                    <small id="emailHelp" class="form-text text-muted">Breve descripción de cargo y/o posición</small>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="empleoEmpresa">Empresa</label>
                                                    <span class="rojo">*</span>
                                                    <input type="text" class="form-control" id="empleoEmpresa" placeholder="Enter empresa">
                                                    <small id="emailHelp" class="form-text text-muted">Empresa en la que trabajaste</small>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="empleoResponsabilidad">Breve descripción de sus responsabilidades </label>
                                                    <span class="rojo">*</span>
                                                    <textarea type="text" class="form-control" id="empleoResponsabilidad" placeholder="" rows="5" cols="10" resize="none" maxlength="500"></textarea>
                                                    <div class="contador" id="contadordescperfil">
                                                        <p>(máximo 500 caracteres)</p>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <div class="col-md-2 label_alineado">
                                                        <label for="apellido" class=" col-form-label"> Período <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <div class="col-md-2 label_alineado">
                                                        <label for="empleoFechainicio" class=" col-form-label">Inicio</label>
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="col-md-10">
                                                            <div class='input-group date' data-provide="datepicker">
                                                                <input class="form-control" id="empleoFechainicio"/>
                                                                <span class="input-group-addon"><i class="fas fa-calendar-alt"></i></span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <div class="col-md-2 label_alineado">
                                                        <label for="empleoFechafin" class=" col-form-label">Fin</label>
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="col-md-10">
                                                            <div class='input-group date' data-provide="datepicker">
                                                                <input class="form-control" id="empleoFechafin"/>
                                                                <span class="input-group-addon"><i class="fas fa-calendar-alt"></i></span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="form-group row centrar_btn">
                                                    <p>
                                                        <button type="button" class="btn btn-primaryCus btn-listo-el">Listo</button>
                                                        <button type="reset" class="btn btn-default btn-EliminarCus">Limpiar</button>
                                                    </p>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- col-md-8 -->
                                </div>

                            </div>
                        </div>
                    </div>
                    <!-- MODAL EXPERIENCIA LABORAL -->
                </section>
                <!-- FIN EXPERIENCIA LABORAL -->

                <!-- FORMACION ACADEMICA -->
                <section id="FORMACION_ACADEMICA">
                    <div class="row">
                        <div class="col bg-success">
                            <h2>Formación académica</h2>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <c:choose>
                                <c:when test="${empty listaEstudios}">
                                    <div class="alert alert-danger" role="alert">
                                        Sin Formación académica
                                    </div>
                                </c:when>
                            </c:choose>
                        </div>
                    </div>

                    <c:forEach var="estudios" items="${listaEstudios}">
                        <div class="row">
                            <div class="col-md-8 form_alineado">
                                <div class="card text-center">
                                    <div class="card-header">
                                        ${estudios.instituto}
                                    </div>
                                    <div class="card-body">
                                        <h5 class="card-title">${estudios.titulo}</h5>
                                        <p class="card-text">${estudios.carrera}</p>
                                        <p class="card-text">${estudios.estado}</p>
                                        <p class="card-text">${estudios.nivelestudio}</p>
                                        <button type="button" class="btn btn-primary btn-eliminar-fa" data-id-estudio="${estudios.id}">Eliminar</button>
                                    </div>
                                    <div class="card-footer text-muted">
                                        Incion ${estudios.fechainicio} - fin ${estudios.fechagraduacion}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <button type="button" class="btn btn-primaryCus" data-toggle="modal" data-target=".bd-formacion_academica-modal-lg">Agregar</button>
                        </div>
                    </div>

                    <!-- MODAL FORMACION ACADEMICA -->
                    <div class="modal fade bd-formacion_academica-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header modalCus">
                                    <h5 class="modal-title">Formación académica</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 form_alineado">
                                        <form>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="estudioTitulo" class=" col-form-label">Centro educativo</label>
                                                </div>
                                                <div class="col-md-10 col-sm-10">
                                                    <input type="text" class="form-control" id="estudioInstituto" placeholder="">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="estudioNivelEstudio" class=" col-form-label">Nível de estudios<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                </div>
                                                <div class="col-sm-10">
                                                    <select class="form-control mb-2 mr-sm-2" id="estudioNivelestuido" class="cm-12" name="DLec">
                                                        <option value="Nível de estudios">Nivel de estudios</option>
                                                        <option value="Primaria">Primaria</option>
                                                        <option value="Secundaria">Secundaria</option>
                                                        <option value="Terciario">Terciario</option>
                                                        <option value="Universitario">Universitario</option>
                                                        <option value="Posgrado">Posgrado</option>
                                                        <option value="Máster">Master</option>
                                                        <option value="Doctorado">Doctorado</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="estudioCarrera" class=" col-form-label">Área de estudio</label>
                                                </div>
                                                <div class="col-md-10 col-sm-10">
                                                    <input type="text" class="form-control" id="estudioCarrera" placeholder="">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="estudioTitulo" class=" col-form-label">Título</label>
                                                </div>
                                                <div class="col-md-10 col-sm-10">
                                                    <input type="text" class="form-control" id="estudioTitulo" placeholder="">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="estudioEstado" class=" col-form-label">Estado <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                </div>
                                                <div class="col-sm-10">
                                                    <select class="form-control mb-2 mr-sm-2" id="estudioEstado" class="cm-12" name="">
                                                        <option value="Culminado">Culminado</option>
                                                        <option value="Cursando">Cursando</option>
                                                        <option value="Abandonado/Aplazado">Abandonado / Aplazado</option>
                                                    </select>
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="apellido" class=" col-form-label"> Período <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="estudioFechainicio" class="col-form-label">Inicio</label>
                                                </div>
                                                <div class="form-group">
                                                    <div class="col-md-10">
                                                        <div class='input-group date' data-provide="datepicker">
                                                            <input class="form-control" id="estudioFechainicio"/>
                                                            <span class="input-group-addon"><i class="fas fa-calendar-alt"></i></span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="estudioFechagraduacion" class=" col-form-label">Fin</label>
                                                </div>
                                                <div class="form-group">
                                                    <div class="col-md-10">
                                                        <div class='input-group date' data-provide="datepicker">
                                                            <input class="form-control" id="estudioFechagraduacion"/>
                                                            <span class="input-group-addon"><i class="fas fa-calendar-alt"></i></span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="form-group row centrar_btn">
                                                <p>
                                                    <button type="button" class="btn btn-primaryCus btn-listo-fa">Listo</button>
                                                    <button type="reset" class="btn btn-EliminarCus">Limpiar</button>
                                                </p>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- col-md-8 -->
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- FIN MODAL FORMACION ACADEMICA   -->
                </section>
                <!-- FIN FORMACON ACADEMICA -->

                <!-- IDIOMAS -->
                <section id="IDIOMAS">

                    <div class="row">
                        <div class="col bg-success">
                            <h2>Idiomas</h2>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <c:choose>
                                <c:when test="${empty listaIdiomas}">
                                    <div class="alert alert-danger" role="alert">
                                        Sin Idioma
                                    </div>
                                </c:when>
                            </c:choose>
                        </div>
                    </div>
                    <c:forEach var="lIdiomas" items="${listaIdiomas}">
                        <div class="row">
                            <div class="col-md-8 form_alineado">
                                <div class="card text-center">
                                    <div class="card-header">
                                        Idiomas
                                    </div>
                                    <div class="card-body">
                                        <h5 class="card-title">${lIdiomas.idioma}</h5>
                                        <p class="card-text">${lIdiomas.nivel}</p>
                                        <button type="button" class="btn btn-primary btn-eliminar-i" data-id-idioma="${lIdiomas.id}">Eliminar</button>
                                    </div>
                                    <div class="card-footer text-muted">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <button type="button" class="btn btn-primaryCus" data-toggle="modal" data-target=".bd-idioma-modal-lg">Agregar</button>
                        </div>
                    </div>
                    <!-- MODAL IDIOMAS -->
                    <div class="modal fade bd-idioma-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header modalCus">
                                    <h5 class="modal-title">Idiosmas</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 form_alineado">
                                        <form>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="idiomaIdioma" class="col-form-label">Idiomas<span class="glyphicon glyphicon-search" aria-hidden="true"></span></label>
                                                </div>
                                                <div class="col-md-6">
                                                    <select class="form-control mb-2 mr-sm-2" id="idiomaIdioma" class="cm-12" name="DLec">
                                                        <option value="Sin seleccionar" selected> Seleccionar </option>
                                                        <c:forEach var="lIdiomasFiltro" items="${listaIdiomasFiltro}">
                                                            <option value="${lIdiomasFiltro.descripcion}">${lIdiomasFiltro.descripcion}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                                <div class="col-md-4"><select class="form-control mb-2 mr-sm-2" id="idiomaNivel" class="cm-12" name="DLec">Nivel</option>
                                                        <option value="1">Muy Básico</option>
                                                        <option value="2">Básico</option>
                                                        <option value="3">Intermedio</option>
                                                        <option value="Avanzado" selected=>Avanzado</option>
                                                        <option value="5">Nativo</option>
                                                    </select> 
                                                </div>
                                            </div>

                                            <div class="form-group row centrar_btn">
                                                <p>
                                                    <button type="button" class="btn btn-primaryCus btn-listo-i">Listo</button>
                                                    <button type="reset" class="btn btn-EliminarCus">Limpiar</button>
                                                </p>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- col-md-8 -->
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- FIN MODAL IDIOMAS -->
                </section>
                <!-- FIN IDIOMAS -->

                <!-- CONOCIMIENTOS INFORMATICOS -->
                <section id="CONOCIMIENTOS_INFORMATICOS">

                    <div class="row">
                        <div class="col bg-success">
                            <h2>Conocimientos informáticos</h2>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <c:choose>
                                <c:when test="${empty listaTecnologias}">
                                    <div class="alert alert-danger" role="alert">
                                        Sin Conocimientos informáticos
                                    </div>
                                </c:when>
                            </c:choose>
                        </div>
                    </div>

                    <c:forEach var="lTecnologias" items="${listaTecnologias}">
                        <div class="row">
                            <div class="col-md-8 form_alineado">
                                <div class="card text-center">
                                    <div class="card-header">
                                        Conocimientos informáticos 
                                    </div>
                                    <div class="card-body">
                                        <h5 class="card-title"></h5>
                                        <p class="card-text">${lTecnologias.tecnologia}</p>
                                        <p class="card-text">Nivel ${lTecnologias.nivel}</p>
                                        <button type="button" class="btn btn-primaryCus btn-eliminar-ci" data-id-tecnologias="${lTecnologias.id}">Eliminar</button>
                                    </div>
                                    <div class="card-footer text-muted">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <button type="button" class="btn btn-primaryCus" data-toggle="modal" data-target=".bd-conocimientos-informaticos-modal-lg">Agregar</button>
                        </div>
                    </div>

                    <!-- MODAL CONOCIMIENTOS INFORMATICOS -->
                    <div class="modal fade bd-conocimientos-informaticos-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header modalCus">
                                    <h5 class="modal-title">Conocimientos informáticos</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 form_alineado">
                                        <form>
                                            <div class="form-group row">
                                                <div class="col-md-2 label_alineado">
                                                    <label for="idiomaIdioma" class="col-form-label">Tecnologías<span class="glyphicon glyphicon-search" aria-hidden="true"></span></label>
                                                    <span class="rojo">*</span>
                                                </div>
                                                <div class="col-md-4">
                                                    <select class="form-control mb-2 mr-sm-2" id="idcategoriatecno" class="cm-12" name="DLec">
                                                        <option value="Sin seleccionar" selected> Categoría </option>
                                                        <c:forEach var="lCategoriatecno" items="${listaCategoriatecno}">
                                                            <option value="${lCategoriatecno.id}">${lCategoriatecno.categoria}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                                <div class="col-md-4">
                                                    <select class="form-control mb-2 mr-sm-2" id="idSubcategoriatecno" class="cm-12" name="DLec">
                                                        <option value="Sin seleccionar" selected> Tecnologías </option>
                                                    </select> 
                                                </div>

                                            </div>
                                            <div class="col-md-2 label_alineado">
                                                <label for="nivelLaboral" class="col-form-label">Nivel laboral<span class="glyphicon glyphicon-search" aria-hidden="true"></span></label> 
                                            </div>
                                            <div class="col-md-4">
                                                <select class="form-control mb-2 mr-sm-2" id="nivelLaboral" class="cm-12" name="nivelLaboral">
                                                    <option value="Sin seleccionar" selected> Nivel laboral </option>
                                                </select> 
                                            </div>
                                            <div class="form-group row">
                                                <label for="tecnologiaTecnologias">Programas Informáticos </label>
                                                <span class="rojo">*</span>
                                                <textarea type="text" class="form-control" id="tecnologiaTecnologias" placeholder="" rows="5" cols="10" resize="none"></textarea>
                                                <div class="contador" id="contadordescperfil">
                                                    <p>(máximo 500 caracteres)</p>
                                                </div>
                                            </div>
                                            <div class="form-group row centrar_btn">
                                                <p>
                                                    <button type="button" class="btn btn-primaryCus btn-listo-ci">Listo</button>
                                                    <button type="reset" class="btn btn-EliminarCus">Limpiar</button>
                                                </p>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- col-md-8 -->
                                </div>

                            </div>
                        </div>
                    </div>
                    <!-- FIN MODAL CONOCIMIETNOS INFORMATICOS -->
                </section>
                <!-- FIN CONOCIMIENTOS INFORMATICOS -->

                <!-- CONOCIMIENTOS Y HABILIDADES -->
                <section id="CONOCIMIENTOS_Y_HABILIDADES">

                    <div class="row">
                        <div class="col bg-success">
                            <h2>Conocimientos y Habilidades</h2>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <c:choose>
                                <c:when test="${empty listaHabilidades}">
                                    <div class="alert alert-danger" role="alert">
                                        Sin Conocimientos y Habilidades
                                    </div>
                                </c:when>
                            </c:choose>
                        </div>
                    </div>

                    <c:forEach var="lHabilidades" items="${listaHabilidades}">
                        <div class="row">
                            <div class="col-md-8 form_alineado">
                                <div class="card text-center">
                                    <div class="card-header">
                                        Conocimientos, habilidades y actitudes 
                                    </div>
                                    <div class="card-body">
                                        <h5 class="card-title"></h5>
                                        <p class="card-text">${lHabilidades.conocimientos}</p>
                                        <button type="button" class="btn btn-primary btn-eliminar-c" data-id-conocimientos="${lHabilidades.id}">Eliminar</button>
                                    </div>
                                    <div class="card-footer text-muted">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <button type="button" class="btn btn-primaryCus" data-toggle="modal" data-target=".bd-conocimientos-Y-habilidades-modal-lg">Agregar</button>
                        </div>
                    </div>
                    <!-- MODAL CONOCIMIENTOS Y HABILIDADES -->
                    <div class="modal fade bd-conocimientos-Y-habilidades-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header modalCus">
                                    <h5 class="modal-title">Conocimientos y Habilidades</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 form_alineado">
                                        <form>
                                            <div class="col-md-12">
                                                <label for="conocimientoConocimiento" class=" col-form-label">
                                                    <span class="rojo">*</span>
                                                    Ejemplo: La capacidad de tomar decisiones, Trabajo en equipo, persistencia y constancia para obtener los resultados deseados, 
                                                    buena capacidad de comunicación, tanto verbal como escrita ,ser un gran apasionado por el trabajo que se desempeña </label>
                                            </div>

                                            <div class="col-md-12">
                                                <textarea type="text" class="form-control" id="conocimientoConocimiento" placeholder="" rows="5" cols="10" resize="none"></textarea>
                                                <div class="contador" id="contadordescConocimientos">
                                                    <p>(máximo 500 caracteres)</p>
                                                </div>
                                            </div>

                                            <div class="form-group row centrar_btn">
                                                <p>
                                                    <button type="button" class="btn btn-primaryCus btn-listo-c">Listo</button>
                                                    <button type="reset" class="btn btn-EliminarCus">Limpiar</button>
                                                </p>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- col-md-8 -->
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- FIN MODAL CONOCIMIENTOS Y HABILIDADES -->
                </section>
                <!-- FIN CONOCIMIENTOS Y HABILIDADES -->

                <!-- AGREGAR FOTO -->
                <section id="FOTO">
                    <div class="row">
                        <div class="col bg-success">
                            <h2>Agregar una foto</h2>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <form id="#" method="POST" enctype="multipart/form-data" action="/teachnow/register/api/image">
                                <div class="form-group row">
                                    <div class="col-md-2 label_alineado">
                                        <div class="form-check-inline">
                                            <label for="fotoCv" class="form-check-label"> Inserta tu foto <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></label>
                                        </div>
                                    </div>
                                    <div class="col-md-10">
                                        <input type="file" class="form-control" name="fotoCv" placeholder=""  accept="image/jpg, image/jpeg">
                                        <input type="hidden" name="fotoIdCv" value="${nPerfil.id}">
                                    </div>
                                </div>
                                <div class="col-md-10">
                                    <button type="submit" class="btn btn-primaryCus btn-block">Guardar foto</button>
                                </div>
                            </form>
                        </div>
                        <!-- col-md-8 -->
                    </div>
                </section>
                <!-- AGREGAR FOTO -->

                <!-- ADJUNTASR CV -->
                <section id="ADJUNTASR_CV">

                    <div class="row">
                        <div class="col bg-success">
                            <h2>Adjuntar CV</h2>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 form_alineado">
                            <form id="#" method="POST" enctype="multipart/form-data" action="/teachnow/register/api/cv">
                                <div class="form-group row">
                                    <div class="col-md-3 label_alineado">
                                        <label for="fileCv" class=" col-form-label">Curriculum Vitae</label>
                                    </div>
                                    <div class="col-md-9 col-sm-10">
                                        <input type="file" class="form-control" name="fileCv" accept=".doc,.docx,application/msword,application/pdf,application/vnd.openxmlformats-officedocument.wordprocessingml.document">
                                        <input type="hidden" name="adjuntarCvId" value="${nPerfil.id}">
                                        <input type="hidden" name="adjuntarCvNombre" value="${nPerfil.persona.nombre}">
                                        <input type="hidden" name="adjuntarCvApellido" value="${nPerfil.persona.apellido}">
                                    </div>
                                </div>
                                <div class="col-md-10">
                                    <button type="submit" class="btn btn-primaryCus btn-block">Adjuntar</button>
                                </div>
                            </form>
                        </div>
                        <!-- col-md-8 -->
                    </div>
                </section>
                <!-- FIN ADJUNTAR CV -->
            </div>
            <!--  FIN CONTAINER FLUID -->

        </div>
        <div class="footer">
            <p>Enseña Ya! &copy; 2020 | Todos los derechos reservados</p>
            <a href="#"> developerwebmj@gmail.com</a>
        </div>                       

        <!-- FIN FOOTER -->

        <script src="${root}/js/lib/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="${root}/js/vendor/bootstrap.min.js" type="text/javascript"></script>
        <script src="${root}/js/vendor/bootstrap-datepicker.min.js" type="text/javascript"></script>
        <script src="${root}/js/lib/datepicker.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/acercademiService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/empleoService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/estuidoService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/perosnaService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/tecnologiaService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/idiomaService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/habilidadesService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/registerNewAccountService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/signinService.js" type="text/javascript"></script>
        <script src="${root}/js/app/service/teachNow/preferenciaLaboralesService.js" type="text/javascript"></script>
    </body>

</html>

