/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
tecnologiaService = (function () {

    function inicializar() {
        agregarTecnologia();
        eliminarTecnologia();
        buscarCategoriatecno();
    }

    function agregarTecnologia() {
        $('.btn-listo-ci').on('click', function () {

            var tecnologiaTecnologias = $('#tecnologiaTecnologias').val();
            var dataidPerfil = $("#personaId").attr("data-id-perfil");

            var nPerfil = {
                "id": dataidPerfil
            };

            var nuevoTecnologia = {
                "tecnologia": tecnologiaTecnologias,
                "perfil": nPerfil
            };

            $.ajax({
                url: "/teachnow/register/api/tecnologia",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevoTecnologia),
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

    function eliminarTecnologia() {
        $('.btn-eliminar-ci').on('click', function () {
            $this = $(this);
            var idEliminar = $this.attr('data-id-tecnologias');

            $.ajax({
                url: "/teachnow/register/api/tecnologiaEliminar/" + idEliminar,
                type: "DELETE",
                contentType: "application/json",
                dataType: 'json'
            });
            location.reload(true);
        });
    }
    function buscarCategoriatecno() {
        $('#idcategoriatecno').on('change', function () {
            var idcategoriatecno = $(this).val();
            console.log("/teachnow/register/api/buscar/" + idcategoriatecno);
            $.ajax({
                url: "/teachnow/register/api/buscar/" + idcategoriatecno,
                type: "GET",
                contentType: "application/json",
                dataType: 'json'
            }).done(function (data) {
                $('#idSubcategoriatecno').empty();
                $.each(data, function (index, items) {
//                    console.log(index + "/ " + items);
                    var nuevafila = ("<option value=" + items + ">" + items + "</option>");
                    $("#idSubcategoriatecno").append(nuevafila);
                });
//                console.log(JSON.stringify(data));
            }).fail(function (data) {
                $('#idSubcategoriatecno').empty();
                var nuevafila = ("<option value='Sin seleccionar' selected> Tecnologia </option>");
                $("#idSubcategoriatecno").append(nuevafila);
//                console.log("Fail");
//                console.log(JSON.stringify(data));
            });
        });
    }

    return {
        inicializar: inicializar
    };

})();

$(document).ready(function () {
    tecnologiaService.inicializar();
});