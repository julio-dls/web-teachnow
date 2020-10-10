/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
habilidadesService = (function () {

    function inicializar() {
        agregarConocimiento();
        eliminarConocimiento();
    }

    function agregarConocimiento() {
        $('.btn-listo-c').on('click', function () {

            var conocimientoConocimiento = $('#conocimientoConocimiento').val();
            var dataidPerfil = $("#personaId").attr("data-id-perfil");

            var nPerfil = {
                "id": dataidPerfil
            };

            var nuevoConocimiento = {
                "conocimientos": conocimientoConocimiento,
                "perfil": nPerfil
            };

            $.ajax({
                url: "/teachnow/register/api/habilidades",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevoConocimiento),
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

    function eliminarConocimiento() {
        $('.btn-eliminar-c').on('click', function () {
            $this = $(this);
            var idEliminar = $this.attr('data-id-conocimientos');

            $.ajax({
                url: "/teachnow/register/api/habilidadesEliminar/" + idEliminar,
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
    habilidadesService.inicializar();
});