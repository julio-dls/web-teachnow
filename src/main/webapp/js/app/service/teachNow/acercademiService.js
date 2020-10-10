/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
acercademiService = (function () {

    function inicializar() {
        agregarAcercademi();
        eliminarAcercademi();
    }

    function agregarAcercademi() {
        $('.btn-listo-pp').on('click', function () {
            var perfilProfesionalArea = $('#perfilProfesionalArea').val();
            var perfilProfesionalQuiensoy = $('#perfilProfesionalQuiensoy').val();
            var idPerfil = $(this).attr('data-idPerfil');

            var nPerfil = {
                "id": idPerfil
            };

            var nuevoConocimiento = {
                "area": perfilProfesionalArea,
                "quiensoy": perfilProfesionalQuiensoy,
                "perfil": nPerfil
            };

            $.ajax({
                url: "/teachnow/register/api/acercademi",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevoConocimiento),
                dataType: 'json'
            }).done(function (data) {
                $(".modal").modal("hide");
                location.reload(true);
            }).fail(function (data) {
                $(".modal").modal("hide");
            });
        });
    }

    function eliminarAcercademi() {
        $('.btn-eliminar-pp').on('click', function () {
            $this = $(this);
            var idEliminar = $this.attr('data-id-perfilprofesional');

            $.ajax({
                url: "/teachnow/register/api/acercademiEliminar/" + idEliminar,
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
    acercademiService.inicializar();
});