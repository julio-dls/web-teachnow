teachNow.service.pefilService = (function () {

    function inicializar() {
        agregarPerfil();
        buscar();
        obtenerIdPerfil();
        modificarPerfil();
        eliminarPerfil();
    }

    function buscar() {
        $('#btn-buscar-nombre').on('click', function () {
            var filtroNombre = $('#nombre-filtro').val();

            $.ajax({
                url: window.location + "api/" + filtroNombre,
                type: "GET",
                contentType: "application/json",
                dataType: 'json'
            }).done(function (data) {

                $.each(data, function (index, items) {
                    var nuevafila = ("<tr><td>" + index + "</td><td>" +
                            items['persona'].nombre + "</td><td>" +
                            items['persona'].apellido + "</td>\n\<td>" +
                            items['persona'].fechanacimiento + "</td><td>" +
                            items['persona'].nacionalidad + "</td><td>" +
                            items['persona'].direccion + "</td>\n\<td>" +
                            items['persona'].telefono + "</td></tr>");
                    $("#bodyTable").append(nuevafila);
                });

                $(".modal").modal("hide");
                console.log(JSON.stringify(data));
            }).fail(function (data) {
                console.log("Fail: " + JSON.stringify(data));
            });
        });
    }

    function agregarPerfil() {
        $('#btn-agreagr').on('click', function () {

            var personaMombre = $('#nombre-agregar').val();
            var personaApellido = $('#apellido-agregar').val();
            var personaNacionalidad = $('#nacionalidad-agregar').val();
            var personaTelefono = $('#telefono-agregar').val();
            var direccion = $('#direccion-agregar').val();
            var fechanacimiento = $('#fechanacimiento-agregar').val();

            var nuevoPerfil = {
                "nombre": nombre,
                "apellido": apellido,
                "nacionalidad": nacionalidad,
                "telefono": telefono,
                "direccion": direccion,
                "fechanacimiento": fechanacimiento
            };

            $.ajax({
                url: window.location + "api/perfil",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevoPerfil),
                dataType: 'json',
            }).done(function (data) {
//                console.log(JSON.stringify(data));
                $(".modal").modal("hide");
                location.reload(true);
            }).fail(function (data) {
//                console.log(JSON.stringify(data));
                $(".modal").modal("hide");
            });
        });
    }
    var id;
    function obtenerIdPerfil() {
        $('.btn-modificar-tbody').on('click', function () {
            $this = $(this);
            id = $this.attr('data-id');
        });
    }
    function modificarPerfil() {
        $('#btn-modificar').on('click', function () {

            var nombre = $('#nombre-modificar').val();
            var apellido = $('#apellido-modificar').val();
            var nacionalidad = $('#nacionalidad-modificar').val();
            var telefono = $('#telefono-modificar').val();
            var direccion = $('#direccion-modificar').val();
            var fechanacimiento = $('#fechanacimiento-modificar').val();

            var nuevoModificado = {
                "id": id,
                "nombre": nombre,
                "apellido": apellido,
                "nacionalidad": nacionalidad,
                "telefono": telefono,
                "direccion": direccion,
                "fechanacimiento": fechanacimiento
            };

            $.ajax({
                url: window.location + "api/perfilModificar",
                type: "PUT",
                contentType: "application/json",
                data: JSON.stringify(nuevoModificado),
                dataType: 'json',
            }).done(function (data) {
                $(".modal").modal("hide");
                location.reload(true);
                console.log(JSON.stringify(data));
            }).fail(function (data) {
                $(".modal").modal("hide");
                location.reload(true);
                console.log(JSON.stringify(data));
            });
        });
    }
    function eliminarPerfil() {
        $('.btn-eliminar').on('click', function () {
            $this = $(this);
            var idEliminar = $this.attr('data-id');

            $.ajax({
                url: window.location + "api/perfilEliminar/" + idEliminar,
                type: "DELETE",
                contentType: "application/json",
                dataType: 'json',
            });
            location.reload(true);
        });
    }
    return {
        inicializar: inicializar
    };
})();

$(document).ready(function () {
    teachNow.service.pefilService.inicializar();
});


