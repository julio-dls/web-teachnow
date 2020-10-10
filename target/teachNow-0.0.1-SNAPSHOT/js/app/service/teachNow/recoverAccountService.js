/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
recoverAccountService = (function () {

    function inicializar() {
        senderEmail();
    }

    function validarCampos() {
        var ret = false;
        const patternEmail = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;

        if (!$('#emailReover').val())
        {
            $("#emailReover").parent().next(".validation").remove();
            $("#emailReover").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;'>Por favor ingresar el correo electrónico</div>");
            return false;
        } else if (!patternEmail.test($('#emailReover').val()))
        {
            $("#emailReover").parent().next(".validation").remove();
            $("#emailReover").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;'>Correo electrónico no válido</div>");
            return false;
        } else
        {
            $("#emailReover").parent().next(".validation").remove(); // remove it
            ret = true;
        }

        return ret;
    }

    function senderEmail() {
        $('.btn-senderEmail').on('click', function () {

            var recoverEmail = $('#emailReover').val();

            if (!validarCampos()) {
                return false;
            }

            $.ajax({
                url: "/teachnow/recoveraccount/sendmail/api/" + recoverEmail,
                type: "GET",
                contentType: "application/json",
                dataType: 'json'
            }).done(function (data) {
                window.location.href = "http://localhost:8080/teachnow/" + data.responseText;
            }).fail(function (data) {
                window.location.href = "http://localhost:8080/teachnow/" + data.responseText;
            });
        });
    }

    return {
        inicializar: inicializar
    };

})();

$(document).ready(function () {
    recoverAccountService.inicializar();
});


