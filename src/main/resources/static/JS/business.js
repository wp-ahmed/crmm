$( document ).ready(function() {
    $(".nav-link").on( "click", function() {


        var business = $(this).attr('data-business');

        var refresh   = window.location.origin + window.location.pathname + "?business=" + business;
        window.history.pushState({ path: refresh }, '', refresh);
//        document.location = url;
        console.log(business);
    });
});