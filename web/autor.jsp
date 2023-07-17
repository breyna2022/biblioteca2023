<%-- 
    Document   : home
    Created on : 16 jul 2023, 22:26:35
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <%@include file="WEB-INF/templates/main/head-principal.jspf" %>
    </head>
    <body id="page-top">        
        <%@include file="WEB-INF/templates/main/body-head-principal.jspf" %>
        <!-- Page Heading -->
        <div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">Autores</h1>
        </div>
        <div class="row">
            <!-- Area Chart -->
            <div class="col-xl-8 col-lg-7">
                <div class="card shadow mb-4">
                    <!-- Card Header - Dropdown -->
                    <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                        <h6 class="m-0 font-weight-bold text-primary">Listado</h6>
                        <div class="dropdown no-arrow">
                            <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
                                 aria-labelledby="dropdownMenuLink">
                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">Agregar Autor</a>
                            </div>
                        </div>
                    </div>
                    <!-- Card Body -->
                    <div class="card-body">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">ID</th>
                                    <th scope="col">NOMBRES Y APELLIDOS</th>
                                    <th scope="col">FOTO</th>
                                    <th scope="col">ESTADO</th>
                                    <th scope="col" colspan="2">ACCIÓN</th>
                                </tr>
                            </thead>
                            <tbody id="tablita">                                
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>            
        </div>
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">New Autor</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="form-group">
                                <label for="nombres" class="col-form-label">Nombres:</label>
                                <input type="text" class="form-control" id="nombres" name="nombres" required="">
                            </div>
                            <div class="form-group">
                                <label for="apellidos" class="col-form-label">Apellidos:</label>
                                <input type="text" class="form-control" id="apellidos" name="apelidos" required="">
                            </div>
                            <div class="form-group">
                                <label for="foto" class="col-form-label">Foto:</label>
                                <input type="text" class="form-control" id="foto" name="foto" required="">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" id="btnAutor">Send message</button>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="WEB-INF/templates/main/body-footer-principal.jspf" %>
        <%@include file="WEB-INF/templates/main/footer-principal.jspf" %>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="recursos/js/autor.js"></script>
    </body>
</html>
