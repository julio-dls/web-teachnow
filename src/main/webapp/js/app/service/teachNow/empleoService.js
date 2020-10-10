/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
empleoService = (function () {

    function inicializar() {
        agregarEmpleo();
        eliminarEmpleo();
    }

    function agregarEmpleo() {
        $('.btn-listo-el').on('click', function () {

            var empleoCargo = $('#empleoCargo').val();
            var empleoEmpresa = $('#empleoEmpresa').val();
            var empleoResponsabilidad = $('#empleoResponsabilidad').val();
            var empleoFechainicio = $('#empleoFechainicio').val();
            var empleoFechafin = $('#empleoFechafin').val();
            var dataidPerfil = $("#personaId").attr("data-id-perfil");

            var nPerfil = {
                "id": dataidPerfil
            };

            var nuevoEmpleo = {
                "cargo": empleoCargo,
                "empresa": empleoEmpresa,
                "responsabilidad": empleoResponsabilidad,
                "fechainicio": empleoFechainicio,
                "fechafin": empleoFechafin,
                "perfil": nPerfil
            };

            $.ajax({
                url: "/teachnow/register/api/empleo",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevoEmpleo),
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

    function eliminarEmpleo() {
        $('.btn-eliminar-el').on('click', function () {
            $this = $(this);
            var idEliminar = $this.attr('data-id-empleo');

            $.ajax({
                url: "/teachnow/register/api/empleoEliminar/" + idEliminar,
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
    empleoService.inicializar();
});