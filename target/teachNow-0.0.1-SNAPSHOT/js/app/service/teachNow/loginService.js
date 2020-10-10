/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
loginService = (function () {

    function inicializar() {
        login();
    }

    function login() {
        $('.btn-signin').on('click', function () {
            var user = $('#username').val();
            var password = $('#password').val();

            var user = {
                "name": user,
                "password": password
            };

            $.ajax({
                url: "/teachnow/signin/api/login",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(user),
                dataType: 'json'
            }).done(function (data) {
                localStorage.setItem('token', data['token']);
                console.log(localStorage.getItem('token'));
            });
        });
    }

    return {
        inicializar: inicializar
    };

})();

$(document).ready(function () {
    loginService.inicializar();
});
