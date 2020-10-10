modalSearchService = (function () {

    function inicializar() {
        buscar();
    }

    function buscar() {
        $('.div-modelPerfil').on('click', function () {
            var perfilId = $(this).attr('data-perfilId');

            $.ajax({
                url: "/teachnow/search/buscar/api/" + perfilId,
                type: "GET",
                contentType: "application/json",
                dataType: 'json'
            }).done(function (data) {
                $(".div-nombre-titulo,.div-redes-socialees,.div-modal-img-acercademi,.div-experiencia-laboral,.div-habilidades,.div-educacion,.div-idiomas,.div-linkedin").empty();
                var name = (
                        '<h2 class="resume-name mb-0 text-uppercase">' + data['persona']['nombre'] + ' ' + data['persona']['apellido'] + '</h2>' +
                        '<div class="resume-tagline mb-3 mb-md-0">' + data['estudios'][0]['titulo'] + '</div>'
                        );
                $(".div-nombre-titulo").append(name);

                var redesSociales = (
                        '<ul class="list-unstyled mb-0">' +
                        '<li class="mb-2"><i class="fa fa-phone-square fa-fw fa-lg mr-2"></i><a class="resume-link" href="tel:#">' + data['persona']['telefono'] + '</a></li>' +
                        '<li class="mb-2"><i class="fa fa-envelope fa-fw fa-lg mr-2"></i><a class="resume-link" href="mailto:#">' + data['persona']['dirskype'] + '</a></li>' +
                        '<li class="mb-2"><i class="fa fa-globe fa-fw fa-lg mr-2"></i><a class="resume-link" href="#">' + data['persona']['razonsocial'] + '</a></li>' +
                        '<li class="mb-0"><i class="fa fa-map-marker fa-fw fa-lg mr-2"></i>' + data['persona']['ciudad'] + '</li>' +
                        '</ul>'
                        );
                $(".div-redes-socialees").append(redesSociales);

                var imgModalAcercaDeMi = (
                        '<img class="resume-profile-image mb-3 mb-md-0 mr-md-5 ml-md-0 rounded mx-auto" src="../img/' + data['id'] + '/img_' + data['id'] + '_cv.jpg" alt="image">' +
                        '<div class="media-body text-left">' +
                        '<p class="mb-0">' + data['acercademi'][0]['area'] + '<a class="theme-link" href="#" target="_blank">' + data['acercademi'][0]['quiensoy'] + '</p>' +
                        '</div>'
                        );
                $(".div-modal-img-acercademi").append(imgModalAcercaDeMi);

                $.each(data['empleos'], function (index, items) {
                    var experienciaLaboral = (
                            '<div class="item mb-3 div-experiencia-laboral">' +
                            '<div class="item-heading row align-items-center mb-2">' +
                            '<h4 class="item-title col-12 col-md-6 col-lg-8 mb-2 mb-md-0">' + data['empleos'][index]['cargo'] + '</h4>' +
                            '<div class="item-meta col-12 col-md-6 col-lg-4 text-muted text-left text-md-right">' + data['empleos'][index]['empresa'] + ' | ' + data['empleos'][index]['fechainicio'] + ' - ' + data['empleos'][index]['fechafin'] + '</div>' +
                            '</div>' +
                            '<div class="item-content">' +
                            '<p>' + data['empleos'][index]['responsabilidad'] + '</p>' +
                            '</div>' +
                            '</div>'
                            );
                    $(".div-experiencia-laboral").append(experienciaLaboral);
                });

                var habilidades = (
                        '<h4 class="item-title">Técnicas</h4>' +
                        '<ul class="list-unstyled resume-skills-list">' +
                        '<li class="mb-2">' + data['tecnologias'][0]['tecnologia'] + '</li>' +
                        '</ul>'
                        );
                $(".div-habilidades").append(habilidades);

                $.each(data['estudios'], function (index, items) {
                    var educacion = (
                            '<ul class="list-unstyled resume-education-list">' +
                            '<li class="mb-3">' +
                            '<div class="resume-degree font-weight-bold">' + data['estudios'][index]['titulo'] + '</div>' +
                            '<div class="resume-degree-org text-muted">' + data['estudios'][index]['instituto'] + '</div>' +
                            '<div class="resume-degree-time text-muted">' + data['estudios'][index]['nivelestudio'] + '' + data['estudios'][index]['estado'] + '</div>' +
                            '<div class="resume-degree-time text-muted">' + data['estudios'][index]['fechainicio'] + '' + data['estudios'][index]['fechagraduacion'] + '</div>' +
                            '</li>' +
                            '</ul>'
                            );
                    $(".div-educacion").append(educacion);
                });

                $.each(data['idiomas'], function (index, items) {
                    var idiomas = (
                            '<ul class="list-unstyled resume-lang-list">' +
                            '<li class="mb-2">' + data['idiomas'][index]['idioma'] + ' <span class="text-muted">(' + data['idiomas'][index]['nivel'] + ')</span></li>' +
                            '</ul>'
                            );
                    $(".div-idiomas").append(idiomas);
                });

                var linkedin = (
                        '<ul class="resume-social-list list-inline mx-auto mb-0 d-inline-block text-muted">' +
                        '<li class="list-inline-item mb-lg-0 mr-3"><a class="resume-link" href="#"><i class="fa fa-linkedin-square fa-2x mr-2" data-fa-transform="down-4"></i><span class="d-none d-lg-inline-block text-muted">linkedin.com/in/username</span></a></li>' +
                        '</ul>'
                        );
                $(".div-linkedin").append(linkedin);
            }).fail(function (data) {
//                console.log("Fail: " + JSON.stringify(data));
            });
        });
    }

    return {
        inicializar: inicializar
    };
})();
$(document).ready(function () {
    modalSearchService.inicializar();
});

