/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
idiomaService = (function () {

    function inicializar() {
        agregarIdioma();
        eliminarIdioma();
    }

    function agregarIdioma() {
        $('.btn-listo-i').on('click', function () {

            var idiomaNivel = $('#idiomaNivel').val();
            var idiomaIdioma = $('#idiomaIdioma').val();
            var dataidPerfil = $("#personaId").attr("data-id-perfil");

            var nPerfil = {
                "id": dataidPerfil
            };

            var nuevoIdioma = {
                "nivel": idiomaNivel,
                "idioma": idiomaIdioma,
                "perfil": nPerfil
            };

            $.ajax({
                url: "/teachnow/register/api/idioma",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevoIdioma),
                dataType: 'json'
            }).done(function (data) {
                console.log(JSON.stringify(data));
                $(".modal").modal("hide");
                location.reload(true);
            }).fail(function (data) {
//                console.log(JSON.stringify(data));
                $(".modal").modal("hide");
            });
        });
    }

    function eliminarIdioma() {
        $('.btn-eliminar-i').on('click', function () {
            $this = $(this);
            var idEliminar = $this.attr('data-id-idioma');

            $.ajax({
                url: "/teachnow/register/api/idiomaEliminar/" + idEliminar,
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
    idiomaService.inicializar();
});