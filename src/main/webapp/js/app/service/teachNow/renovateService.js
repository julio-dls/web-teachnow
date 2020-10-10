/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
renovateService = (function () {

    function inicializar() {
        newPassword();
    }

    function validarCampos() {
        var ret = false;
        var patternPass = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/;


        if (!$('#newPassword').val())
        {
            $("#newPassword").parent().next(".validation").remove();
            $("#newPassword").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;margin-right:160px;'>Por favor ingresar la contraseña</div>");
            return false;
        } else if (!patternPass.test($('#newPassword').val()))
        {
            $("#newPassword").parent().next(".validation").remove();
            $("#newPassword").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;'>La contraseña debe contener: Mínimo ocho caracteres, al menos una letra y un número</div>");
            return false;
        } else
        {
            $("#newPassword").parent().next(".validation").remove(); // remove it
            ret = true;
        }

        if (!$('#confirmPassword').val())
        {
            $("#confirmPassword").parent().next(".validation").remove();
            $("#confirmPassword").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;margin-right:160px;'>Por favor ingresar la contraseña</div>");
            return false;
        } else if (!patternPass.test($('#confirmPassword').val()))
        {
            $("#confirmPassword").parent().next(".validation").remove();
            $("#confirmPassword").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;'>La contraseña debe contener: Mínimo ocho caracteres, al menos una letra y un número</div>");
            return false;
        } else
        {
            $("#confirmPassword").parent().next(".validation").remove(); // remove it
            ret = true;
        }

        if ($('#confirmPassword').val() != $('#newPassword').val())
        {
            $("#confirmPassword").parent().next(".validation").remove();
            $("#newPassword").parent().next(".validation").remove();
            $("#confirmPassword").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;margin-right:160px;'>Las contraseñas no coinciden</div>");
            return false;
        }

        return ret;
    }


    function newPassword() {
        $('.btn-renovate').on('click', function () {
            var idPerfil = $(".idPerfil").attr('data-idPerfil');
            var pwdRenovate = $('#newPassword').val();

            if (!validarCampos()) {
                return false;
            }
            var mPermiso = {
                "password": pwdRenovate
            };

            var mPersona = {
                "id": idPerfil,
                "permiso": mPermiso
            };

            $.ajax({
                url: "/teachnow/renovate/renew/api/new",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(mPersona),
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
    renovateService.inicializar();
});
