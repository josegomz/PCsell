<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Framework Struts</title>
        <link rel="stylesheet" href="./resources/css/bootstrap.min.css">
        <script  type="Text/javascript" src="../resources/js/jquery-3.3.1.min.js"></script>
        <script  type="Text/javascript" src="../resources/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="page-header">
            <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <s:a class="navar-brand" href="#">Home</s:a>
                        </li>
                        <li class="nav-item">
                        <s:a href="actionCrearFramework">
                            <span class="nav-link">Usuarios</span>
                        </s:a>
                    </li>

                    <li class="nav-item active">
                        </li>
                        <li class="nav-item">
                        <s:a href="actionMostrarFramework">
                            <span class="nav-link">Mostrar</span>
                        </s:a>
                    </li>

                    <li class="nav-item active">
                        </li>
                        <li class="nav-item">
                        <s:a href="actionAyudaFramework">
                            <span class="nav-link">Ayuda</span>
                        </s:a>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="container">
            <div  class="row">
                <div class="col-md-12">
                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>Codigo</th>
                                <th>Nombre</th>
                                <th>Fecha Creación</th>
                                <th>Creador</th>
                                <th>Opciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                    </table>
                </div>
            </div>
                            
        </div>
    </body>
</html>
