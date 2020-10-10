/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
personaService = (function () {

    function inicializar() {
        agregarPersona();
        modificarPersona();
        eliminarPersona();
    }

    function validarCampos() {
        var ret = false;
        const pattern = new RegExp('^[A-Z\ñÑ\á\é\í\ó\ú\ ]+$', 'i');
        const patternNum = new RegExp('^[0-9]*$');
        const patternTel = new RegExp('^[0-9-]*$');

        //Validate Input nombre
        if (!$('#personaNombre').val())
        {
            $("#personaNombre").parent().next(".validation").remove(); // remove it
            $("#personaNombre").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>Por favor ingresar el nombre</div>");
            return false;
        } else if (!pattern.test($('#personaNombre').val()))
        {
            $("#personaNombre").parent().next(".validation").remove(); // remove it
            $("#personaNombre").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>El nombre no puede contener números</div>");
            return false;
        } else
        {
            $("#personaNombre").parent().next(".validation").remove(); // remove it
            ret = true;
        }

        //Validate Input Apellido     
        if (!$('#personaApellido').val())
        {
            $("#personaApellido").parent().next(".validation").remove(); // remove it
            $("#personaApellido").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>Por favor ingresar el apellido</div>");
            return false;
        } else if (!pattern.test($('#personaApellido').val()))
        {
            $("#personaApellido").parent().next(".validation").remove(); // remove it
            $("#personaApellido").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>El apellido no puede contener números</div>");
            return false;
        } else
        {
            $("#personaApellido").parent().next(".validation").remove(); // remove it
            ret = true;
        }

        //Validate Input DNI     
        if (!$('#personaDocumento').val())
        {
            $("#personaDocumento").parent().next(".validation").remove(); // remove it
            $("#personaDocumento").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>Por favor ingresar el documento</div>");
            return false;
        } else if (!patternNum.test($('#personaDocumento').val()))
        {
            $("#personaDocumento").parent().next(".validation").remove(); // remove it
            $("#personaDocumento").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>El número de documento no puede contener letras</div>");
            return false;
        } else
        {
            $("#personaDocumento").parent().next(".validation").remove(); // remove it
            ret = true;
        }

        if (!$('#personaTelefono').val())
        {
            $("#personaTelefono").parent().next(".validation").remove(); // remove it
            $("#personaTelefono").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>Por favor ingresar el teléfono</div>");
            return false;
        } else if (!patternTel.test($('#personaTelefono').val()))
        {
            $("#personaTelefono").parent().next(".validation").remove(); // remove it
            $("#personaTelefono").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>El número de teléfono no puede contener letras. Formato 4323-2324</div>");
            return false;
        } else
        {
            $("#personaTelefono").parent().next(".validation").remove(); // remove it
            ret = true;
        }

        //Validate Input Dirección     
        if (!$('#personaDireccion').val())
        {
            $("#personaDireccion").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>Por favor ingresar la dirección</div>");
            return false;
        } else
        {
            $("#personaDireccion").parent().next(".validation").remove(); // remove it
            ret = true;
        }

        //Validate Input Usuario     
        if (!$('#personaUsuario').val())
        {
            $("#personaUsuario").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>Por favor ingresar el usuario</div>");
            return false;
        } else
        {
            $("#personaUsuario").parent().next(".validation").remove(); // remove it
            rey = true;
        }

        //Validate Input Contraseña     
        if (!$('#personaContraseña').val())
        {
            $("#personaContraseña").parent().after("<div class='validation' style='color:red;margin-left: 112px;;margin-bottom: 20px;'>Por favor ingresar la contraseña</div>");
            return false;
        } else
        {
            $("#personaContraseña").parent().next(".validation").remove(); // remove it
            ret = true;
        }
        return ret;
    }

    function agregarPersona() {
        $('.btn-listo-p').on('click', function () {
            var personaNombre = $('#personaNombre').val();
            var personaApellido = $('#personaApellido').val();
            var personaFechanacimiento = $('#personaFechanacimiento').val();
            var personaNacionalidad = $('#personaNacionalidad').val();
            var personaPais = $('#personaPais').val();
            var personaProvincia = $('#personaProvincia').val();
            var personaCiudad = $('#personaCiudad').val();
            var personaZona = $('#personaZona').val();
            var personaDireccion = $('#personaDireccion').val();
            var personadirskype = $('#personadirskype').val();
            var personaTipotelefono = $('#personaTipotelefono').val();
            var personaTelefono = $('#personaTelefono').val();
            var personaTipodocumento = $('#personaTipodocumento').val();
            var personaDocumento = $('#personaDocumento').val();
            var personaLicconducir = $('#personaLicconducir').val();
            var personaVehiculo = $('#personaVehiculo').val();
            var personaDiscapacidad = $('#personaDiscapacidad').val();
            var personaEstadocivil = $('#personaEstadocivil').val();
            var personaGenero = $('#personaGenero').val();
            var personacp = $('#personacp').val();
            var personaUsuario = $('#personaUsuario').val();
            var personaContraseña = $('#personaContraseña').val();

            var provisionalPermiso = {
                "username": personaUsuario,
                "password": personaContraseña,
                "privilegios": "user",
                "enabled": "true"
            };

            var nuevoPersona = {
                "nombre": personaNombre,
                "apellido": personaApellido,
                "fechanacimiento": personaFechanacimiento,
                "nacionalidad": personaNacionalidad,
                "pais": personaPais,
                "region": personaProvincia,
                "ciudad": personaCiudad,
                "zona": personaZona,
                "direccion": personaDireccion,
                "dirskype": personadirskype,
                "tipotelefono": personaTipotelefono,
                "telefono": personaTelefono,
                "tipodocumento": personaTipodocumento,
                "documento": personaDocumento,
                "licconducir": personaLicconducir,
                "vehiculo": personaVehiculo,
                "discapacidad": personaDiscapacidad,
                "cp": personacp,
                "estadocivil": personaEstadocivil,
                "genero": personaGenero,
                "permiso": provisionalPermiso,
                "tipo": "user",
            };
//            var csrfToken = $("meta[name='_csrf']").attr("content");
//                headers: {'X-XSRF-TOKEN': csrfToken},

            if (!validarCampos()) {
                return false;
            }

            $.ajax({
                url: "/teachnow/register/api/perfil",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevoPersona),
                dataType: 'json'
            }).done(function (data) {
                $(".modal").modal("hide");
//                $(location).attr('href', data.responseText);
                window.location.href = "http://localhost:8080/teachnow/" + data.responseText;
//                console.log(JSON.stringify(data));
            }).fail(function (data) {
//                console.log(JSON.stringify(data));
                $(".modal").modal("hide");
                window.location.href = "http://localhost:8080/teachnow/" + data.responseText;
            });
        });
    }

    function modificarPersona() {
        $('.btn-modificar-p').on('click', function () {
            var idPerfil = $(this).attr('data-idPerfil');
            var personaNombre = $('#personaNombre').val();
            var personaApellido = $('#personaApellido').val();
            var personaFechanacimiento = $('#personaFechanacimiento').val();
            var personaNacionalidad = $('#personaNacionalidad').val();
            var personaPais = $('#personaPais').val();
            var personaProvincia = $('#personaProvincia').val();
            var personaCiudad = $('#personaCiudad').val();
            var personaZona = $('#personaZona').val();
            var personaDireccion = $('#personaDireccion').val();
            var personadirskype = $('#personadirskype').val();
            var personaTipotelefono = $('#personaTipotelefono').val();
            var personaTelefono = $('#personaTelefono').val();
            var personaTipodocumento = $('#personaTipodocumento').val();
            var personaDocumento = $('#personaDocumento').val();
            var personaLicconducir = $('#personaLicconducir').val();
            var personaVehiculo = $('#personaVehiculo').val();
            var personaDiscapacidad = $('#personaDiscapacidad').val();
            var personaEstadocivil = $('#personaEstadocivil').val();
            var personaGenero = $('#personaGenero').val();
            var personacp = $('#personacp').val();
            var personaUsuario = $('#personaUsuario').val();
            var personaContraseña = $('#personaContraseña').val();

            var provisionalPermiso = {
                "username": personaUsuario,
                "password": personaContraseña
            };

            var nuevoPersona = {
                "id": idPerfil,
                "nombre": personaNombre,
                "apellido": personaApellido,
                "fechanacimiento": personaFechanacimiento,
                "nacionalidad": personaNacionalidad,
                "pais": personaPais,
                "region": personaProvincia,
                "ciudad": personaCiudad,
                "zona": personaZona,
                "direccion": personaDireccion,
                "dirskype": personadirskype,
                "tipotelefono": personaTipotelefono,
                "telefono": personaTelefono,
                "tipodocumento": personaTipodocumento,
                "documento": personaDocumento,
                "licconducir": personaLicconducir,
                "vehiculo": personaVehiculo,
                "discapacidad": personaDiscapacidad,
                "cp": personacp,
                "estadocivil": personaEstadocivil,
                "genero": personaGenero,
                "permiso": provisionalPermiso,
                "tipo": "user"
            };

            if (!validarCampos()) {
                return false;
            }

            $.ajax({
                url: "/teachnow/register/api/perfilModificar",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevoPersona),
                dataType: 'json'
            }).done(function (data) {
                $(".modal").modal("hide");
                location.reload(true);
            }).fail(function (data) {
                location.reload(true);
            });
        });
    }

    function eliminarPersona() {
        $('.btn-eliminar-p').on('click', function () {
            var idEliminar = $(this).attr('data-idPerfil');

            $.ajax({
                url: "/teachnow/register/api/perfilEliminar/" + idEliminar,
                type: "DELETE",
                contentType: "application/json",
                dataType: 'json'
            });
            window.location.href = "http://localhost:8080/teachnow/signin/logout";

        });
    }

    return {
        inicializar: inicializar
    };
})();

$(document).ready(function () {
    personaService.inicializar();
});