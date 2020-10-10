/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
estudioService = (function () {

    function inicializar() {
        agregarEstudio();
        eliminarEstudio();
    }

    function agregarEstudio() {
        $('.btn-listo-fa').on('click', function () {

            var estudioTitulo = $('#estudioTitulo').val();
            var estudioCarrera = $('#estudioCarrera').val();
            var estudioEstado = $('#estudioEstado').val();
            var estudioFechainicio = $('#estudioFechainicio').val();
            var estudioFechagraduacion = $('#estudioFechagraduacion').val();
            var estudioNivelestuido = $('#estudioNivelestuido').val();
            var estudioInstituto = $('#estudioInstituto').val();
            var dataidPerfil = $("#personaId").attr("data-id-perfil");

            var nPerfil = {
                "id": dataidPerfil
            };

            var nuevoEstuido = {
                "titulo": estudioTitulo,
                "carrera": estudioCarrera,
                "estado": estudioEstado,
                "fechainicio": estudioFechainicio,
                "fechagraduacion": estudioFechagraduacion,
                "nivelestudio": estudioNivelestuido,
                "instituto": estudioInstituto,
                "perfil": nPerfil
            };

            $.ajax({
                url: "/teachnow/register/api/estudio",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevoEstuido),
                dataType: 'json'
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

    function eliminarEstudio() {
        $('.btn-eliminar-fa').on('click', function () {
            $this = $(this);
            var idEliminar = $this.attr('data-id-estudio');

            $.ajax({
                url: "/teachnow/register/api/estudioEliminar/" + idEliminar,
                type: "DELETE",
                contentType: "application/json",
                dataType: 'json'
            });
            location.reload(true);
        });
    }

    return {
        inicializar: inicializar
    };

})();

$(document).ready(function () {
    estudioService.inicializar();
});