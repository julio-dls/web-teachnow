/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
registersCompanyService = (function () {

    function inicializar() {
        guardarRegisterCompany();
    }

    function guardarRegisterCompany() {
        $('.btn-registrar-institucion').on('click', function () {

            var nombrePersona = $('#nombrePersona').val();
            var apellidoPersona = $('#apellidoPersona').val();
            var razonSocial = $('#razonSocialInsitucion').val();
            var telefono = $('#telefonoInsitucion').val();
            var cuit = $('#cuitInsitucion').val();
            var nombre = $('#nombreInsitucion').val();
            var email = $('#emailInsitucion').val();
            var password = $('#contraseñaInsitucion').val();

            var permisoInstitucion = {
                "username": email,
                "password": password,
                "privilegios": "institucion",
                "enabled": "true"
            };

            var nuevaInstitucion = {
                "nombre": nombrePersona,
                "apellido": apellidoPersona,
                "razonsocial": razonSocial,
                "telefono": telefono,
                "cuitinstitucion": cuit,
                "institucion": nombre,
                "tipo": "institucion",
                "permiso": permisoInstitucion
            };

            $.ajax({
                url: "/teachnow/registersCompany/new/api/institucion",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevaInstitucion),
                dataType: 'json'
            }).done(function (data) {
                window.location.href = "http://localhost:8080/teachnow/" + data.responseText;
//                $(location).attr('href', data.responseText);
            }).fail(function (data) {
                window.location.href = "http://localhost:8080/teachnow/" + data.responseText;
//                $(location).attr('href', data.responseText);
//                console.log('fail: ' +JSON.stringify(data));
            });
        });
    }

    return {
        inicializar: inicializar
    };

})();

$(document).ready(function () {
    registersCompanyService.inicializar();
});

