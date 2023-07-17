$(document).ready(function () {
    listar();
});
function listar() {
    $.ajax({
        url: 'ac',
        data: {op: 1},
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            let x = JSON.parse(JSON.stringify(data));
            let i = 0;
            $("#tablita tbody tr").remove();
            x.forEach((item, index) => {
                $("#tablita").append("<tr><td>" + (i + 1) + "</td><td>" + x[i].idautor + "</td><td>" + x[i].nombres + " " + x[i].apellidos + "</td><td>" + x[i].foto + "</td><td>" + x[i].estado + "</td><td><a href='#' onclick='editar(" + x[i].idautor + ")' class='text-warning'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar(" + x[i].idautor + ")' class='text-danger'><i class='fas fa-trash-alt'></i></a></td></tr>");
                i++;
            });
        },
        error: function (xhr, status) {
            alert('Disculpe, existió un problema');
        },
        complete: function (xhr, status) {
            //alert('Petición realizada');
        }
    });
}
$("#btnAutor").click(function () {
    $('#exampleModal').modal('hide');
    Swal.fire({
        position: 'top-end',
        icon: 'success',
        title: 'Autor guardado correctamentes',
        showConfirmButton: false,
        timer: 1500
    });
});
/*
 function editar(x){
 $.get("rol2",{"opc":2,"id":x},function (data) {
 var x = JSON.parse(data);
 $("#edit_nomrol").val(x.nomrol);
 $("#edit_idrol").val(x.idr);
 });
 $("#myModal2").modal('show');
 }
 function eliminar(x){
 
 $.get("rol2",{"id":x,"opc":5},function () {
 listarRol();
 });
 }
 function listarRolId(){
 $.get("rol2",{"opc":2},function (data) {
 alert(data);
 });
 }
 $("#crearRol").click(function (){
 alert("saverol");
 $("#nomrol").val("");
 document.getElementById("nomrol").focus();
 $("#myModal").modal('show');
 
 });
 
 $("#saverol").click(function (){
 alert("saverol");
 var nr = $("#nomrol").val();
 $.post("rol2",{"nombrerol":nr,"opc":3},function () {
 listarRol();
 });
 $("#myModal").modal('hide');
 
 });
 $("#editrol").click(function (){
 var id = $("#edit_idrol").val();
 var nomrol = $("#edit_nomrol").val();
 $.post("rol2",{"id":id,"nomrol":nomrol,"opc":4}, function () {
 listarRol();
 });
 $("#myModal2").modal('hide');
 });
 
 
 
 */