<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PCSELL</title>
        <link href="../../resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!--        <link rel="stylesheet" href="resources/css/bootstrap.min.css">-->
        <script src="../../resources/js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="../../resources/js/bootstrap.min.js" type="text/javascript"></script>
        <!--        <script  type="Text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>-->
        <!--        <script  type="Text/javascript" src="resources/js/bootstrap.min.js"></script>-->
    </head>
    <body>
        <div class="page-header">
            <nav class="navbar navbar-expand-lg navbar-light bg-warning">
                <s:a href="">
                    <span class="navbar-brand">Inicio</span>
                </s:a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <s:a href="../computadora/armarPc.jsp">
                                <span class="nav-link">Armar PC</span>
                            </s:a>
                        </li>
                        <li class="nav-item">
                            <s:a href="../computadora/comprarProducto.jsp">
                                <span class="nav-link">Comprar Producto</span>
                            </s:a>
                        </li>
                        <li class="nav-item">
                            <s:a href="actionMostrarUsuarios">
                                <span class="nav-link">Usuarios</span>
                            </s:a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Mi Cuenta
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <s:a href="">
                                    <span class="dropdown-item">Perfil</span>
                                </s:a>
                                <s:a href="dsj">
                                    <span class="dropdown-item">Salir</span>
                                </s:a>
                            </div>
                        </li>
                    </ul>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                    </form>
                </div>
            </nav>
        </div>
        <div class="container">
            <s:form action="actionInsertUsuario" method="POST">
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <s:textfield name="usuario.correoelectronico" type="email" id="inputEmail4" cssClass="form-control" placeholder="Email"></s:textfield>
                        </div>
                        <div class="form-group col-md-6">
                        <s:textfield name="usuario.contrasenia" type="password" size="100px" id="inputPassword4" cssClass="form-control" placeholder="Password"></s:textfield>
                        </div>
                    </div>
                    <div class="form-group">
                    <s:textfield name="usuario.nombre" id="inputName" size="100px" placeholder="Ingrese su Nombre(s)" cssClass="form-control"></s:textfield>
                    </div>
                    <div class="form-group">
                    <s:textfield name="usuario.apellidos" type="text" id="inputApellido" placeholder="Ingrese su Apellido(s)" cssClass="form-control"></s:textfield>
                    </div>
                <s:submit value="Registrar" cssClass="btn btn-primary btn-block"></s:submit>
            </s:form>
        </div>
    </body>
</html>
