/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
signinService = (function () {

    function inicializar() {
        login();
        logout();
    }
  
    function login() {  
        $('.btn-login').on('click', function () {
            if (boolCheck === 'true') {
                $(location).attr('href', '/search/buscar');
            } else {
                $(location).attr('href', '/register/new');
            }
        });
    }

    function logout() {
        $('.btn-logout').on('click', function () {
            $(location).attr('href', '/signin/logout');
        });
    }

    return {
        inicializar: inicializar
    };

})();

$(document).ready(function () {
    signinService.inicializar();
});