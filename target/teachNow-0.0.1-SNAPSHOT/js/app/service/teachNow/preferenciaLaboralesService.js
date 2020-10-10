/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
preferenciaLaboralesService = (function () {

    function inicializar() {
        agregarPreferenciasLarorales();
    }

    function agregarPreferenciasLarorales() {
        $('.btn-listoPreferenciaLaboral').on('click', function () {
            var idPerfil = $(this).attr('data-idPerfil');
            var tipodepuestoPf = $('#pfTipodepuesto').val();
            var nivelPf = $('#pfNivel').val();
            var salarioPf = $('#pfSalario').val();

            var nuevoPersona = {
                "id": idPerfil,
                "tipodepuesto": tipodepuestoPf,
                "nivel": nivelPf,
                "salario": salarioPf
            };

            $.ajax({
                url: "/teachnow/register/api/perfilAgregarFiltros",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(nuevoPersona),
                dataType: 'json'
            }).done(function (data) {
                $(".modal").modal("hide");
                location.reload(true);
            }).fail(function (data) {
                $(".modal").modal("hide");
                location.reload(true);
            });
        });
    }

    return {
        inicializar: inicializar
    };
})();

$(document).ready(function () {
    preferenciaLaboralesService.inicializar();
});