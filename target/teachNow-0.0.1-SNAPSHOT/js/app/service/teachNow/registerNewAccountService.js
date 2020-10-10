/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
registerNewAccountService = (function () {

    function inicializar() {
        cambioChecked();
        inicioRegisterNewAccountService();
        loadInputs();
        lodadInputregisterAccount();
    }

    function validarCampos() {
        var ret = false;
        var patternPass = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/;
        const patternEmail = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;

        if (!$('#inputCorreoRna').val())
        {
            $("#inputCorreoRna").parent().next(".validation").remove();
            $("#inputCorreoRna").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;'>Por favor ingresar el correo electrónico</div>");
            return false;
        } else if (!patternEmail.test($('#inputCorreoRna').val()))
        {
            $("#inputCorreoRna").parent().next(".validation").remove();
            $("#inputCorreoRna").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;'>Correo electrónico no válido</div>");
            return false;
        } else
        {
            $("#inputCorreoRna").parent().next(".validation").remove(); // remove it
            ret = true;
        }

        if (!$('#inputContraseñaRna').val())
        {
            $("#inputContraseñaRna").parent().next(".validation").remove();
            $("#inputContraseñaRna").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;margin-right:160px;'>Por favor ingresar la contraseña</div>");
            return false;
        } else if (!patternPass.test($('#inputContraseñaRna').val()))
        {
            $("#inputContraseñaRna").parent().next(".validation").remove();
            $("#inputContraseñaRna").parent().after("<div class='validation' style='color:red;float:left;margin-bottom: 20px;font-size:13px;'>La contraseña debe contener: Mínimo ocho caracteres, al menos una letra y un número</div>");
            return false;
        } else
        {
            $("#inputContraseñaRna").parent().next(".validation").remove(); // remove it
            ret = true;
        }

        return ret;
    }

    function inicioRegisterNewAccountService() {
        $('.btn-aceptar-rna').on('click', function () {

            var inputCorreoRna = $('#inputCorreoRna').val();
            var inputContraseñaRna = $('#inputContraseñaRna').val();
            var boolCheck = $('#checkboxSoyInstitucionRna').val();

            if (!validarCampos()) {
                return false;
            }

            localStorage.setItem('correo', inputCorreoRna);
            localStorage.setItem('password', inputContraseñaRna);

            if (boolCheck === 'true') {
                $(location).attr('href', '/registersCompany/new');
            } else {
                $(location).attr('href', '/register/new');
            }
        });
    }

    function loadInputs() {
        var correo = localStorage.getItem('correo');
        var password = localStorage.getItem('password');
        var divForm = ('<div class="col-sm-6">' +
                '<div class="form-group mg0">' +
                '<label for="nombrecontacto">' +
                'Email' +
                '<sup>*</sup>' +
                ' </label>' +
                '<input type="text" class="form-control" id="emailInsitucion" aria-describedby="email" name="emailInsitucion" value="' + correo + '" required>' +
                '</div>' +
                '</div>' +
                ' <div class="col-sm-6">' +
                '<div class="form-group mg0">' +
                '<label for="apellido">' +
                'Contraseña' +
                '<sup>*</sup>' +
                ' </label>' +
                '<input type="password" class="form-control" id="contraseñaInsitucion" aria-describedby="contraseñaInsitucion" ' +
                'name="contraseñaInsitucion" value=" ' + password + ' " required>' +
                '</div>' +
                '</div>');
        $('.inputExport').append(divForm);
//        localStorage.clear();
    }

    function lodadInputregisterAccount() {
        $(personaUsuario).val(localStorage.getItem("correo"));
        $(personaContraseña).val(localStorage.getItem("password"));
    }

    function cambioChecked() {
        $('#checkboxSoyInstitucionRna').change(function () {
            if (this.checked) {
                $('#checkboxSoyInstitucionRna').attr('value', true);
            }
        });
    }

    return {
        inicializar: inicializar
    };

})();

$(document).ready(function () {
    registerNewAccountService.inicializar();
});