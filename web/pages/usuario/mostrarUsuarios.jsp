<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PCSELL</title>
        <link rel="stylesheet" href="../../resources/css/bootstrap.min.css">
        <script  type="Text/javascript" src="../../resources/js/jquery-3.3.1.min.js"></script>
        <script  type="Text/javascript" src="../../resources/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="page-header">
            <nav class="navbar navbar-expand-lg navbar-light bg-warning">
                <s:a href="dsj">
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
                                <s:a href="dsj">
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
            <div  class="row">
                <div class="col-md-12">
                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Apellidos</th>
                                <th>Correo Electrónico</th>
                                <th>Opciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="listaRegistros" var="registros" status="struts">
                                <tr >
                                    <td><s:property value="id"></s:property></td>
                                    <td><s:property value="nombre"></s:property></td>
                                    <td><s:property value="apellidos"></s:property></td>
                                    <td><s:property value="coreoElectronico"></s:property></td>
                                    <td><s:property value="contrasenia"></s:property></td>
                                    <td>
                                    <s:a action="actionActualizarUsuario">
                                        <s:param name="framework.id" value="id"></s:param>
                                        <s:param name="framework.nombre" value="nombre"></s:param>
                                        <s:param name="framework.apellidos" value="apellidos"></s:param>
                                        <s:param name="framework.coreoElectronico" value="coreoElectronico"></s:param>
                                        <s:param name="framework.contrasenia" value="contrasenia"></s:param>
                                        <span class="btn bg-info">Editar</span>
                                    </s:a>
                                    <s:a action="actionDeleteUsuario">
                                        <s:param name="usuario.id" value="id"></s:param>
                                        <span class="btn bg-danger">Eliminar</span>
                                    </s:a>
                                    </td>
                                </tr>
                            </s:iterator>
                        </tbody>
                    </table>
                </div>
            </div>

        </div>
    </body>
</html>
