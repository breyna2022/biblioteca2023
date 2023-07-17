$(document).ready(function () {
    
});
$("#validar").click(function (event){
    event.preventDefault();
    let user = $("#username").val();
    let pass = $("#password").val();
    $.ajax({
        url: 'lc',
        data: {user: user,pass:pass},
        type: 'POST',
        dataType: 'json',
        success: function (data) {
            if(data===1){
                window.location.href="main.jsp";
            }else{
                window.location.href="login.jsp";
            }
        },
        error: function (xhr, status) {
            alert('Disculpe, existió un problema');
        },
        complete: function (xhr, status) {
            //alert('Petición realizada');
        }
    });
});