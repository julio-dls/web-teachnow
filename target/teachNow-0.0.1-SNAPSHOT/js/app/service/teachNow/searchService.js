/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
searchService = (function () {

    function inicializar() {
        buscaPalabraClave();
        buscarSalario();
        buscarNivel();
        buscarTipodepuesto();
        buscarZona();
        paginado();
        abriModal();
    }

    function buscaPalabraClave() {
        $('#enviarBuscarPalabraClave').on('click', function () {
            var urlPalabraClave = "palabraClave";
            var pagePalabraClave = 0;
            var palabraClave = $('#palabraCleve').val();

            filtroGenerico(palabraClave, urlPalabraClave, pagePalabraClave);
        });
    }

    function buscarSalario() {
        $('.filtroSalario').click(function () {
            var idSalario = $(this).attr('data-idsalario');
            var pageSalario = 0;//$('.page-item').val();
            var urlSalario = "salario";
            filtroGenerico(idSalario, urlSalario, pageSalario);
        });
    }

    function buscarNivel() {
        $('.filtroNivel').click(function () {
            var idNivel = $(this).attr('data-idnivel');
            var pageNivel = 0;//$('.page-item').val();
            var urlNivel = "nivel";
            filtroGenerico(idNivel, urlNivel, pageNivel);
        });
    }
    function buscarTipodepuesto() {
        $('.filtroTipodepuesto').click(function () {
            var idTipodepuesto = $(this).attr('data-idtipodepuesto');
            var pageTipodepuesto = 0;//$('.page-item').val();
            var urlTipodepuesto = "tipodepuesto";

            filtroGenerico(idTipodepuesto, urlTipodepuesto, pageTipodepuesto);
        });
    }

    function buscarZona() {
        $('.filtroZona').click(function () {
            var idZona = $(this).attr('data-idzona');
            var pageZona = 0;//$('.page-item').val();
            var urlZona = "zona";

            $(".page-item").attr('data-filtroId', idZona);
            $(".page-item").attr('data-urlFiltro', urlZona);

            filtroGenerico(idZona, urlZona, pageZona);
        });
    }

    function paginado() {
        $('.page-item').click(function () {
            var pageFiltro = $(this).attr('data-page');
            var filtroId = $(this).attr('data-filtroId');
            var urlFiltro = $(this).attr('data-urlFiltro');

            if (filtroId === "") {
                $(location).attr('href', "/search/buscar?page=" + pageFiltro);
            } else {
                filtroGenerico(filtroId, urlFiltro, pageFiltro);
            }
        });
    }

    function filtroGenerico(idFiltro, urlFiltro, pagina) {
        var id = idFiltro;
        var url = urlFiltro;
        var page = pagina;

        $(".DivPalabraClave").empty();
        $(".div-listaperfiles").empty();

        $(location).attr('href', "/search/buscar/" + url + "?page=" + page + "&id=" + id);
    }

    function abriModal() {
        $('.div-listaperfiles').click(function () {
            $('#myModal').modal('show');
//        $("#myModal").modal("hide");
        });
    }

    return {
        inicializar: inicializar
    };
})();

$(document).ready(function () {
    searchService.inicializar();
});