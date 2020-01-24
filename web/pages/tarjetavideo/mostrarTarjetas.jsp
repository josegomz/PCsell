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
                                <s:a href="crearUsuario.jsp">
                                    <span class="dropdown-item">Crear Usuario</span>
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
                                <th>Imagen</th>
                                <th>Modelo</th>
                                <th>VRAM</th>
                                <th>RAM</th>
                                <th>Conexión</th>
                                <th>Descripción</th>
                                <th>Precio</th>
                                <th>Cantidad</th>
                                <th>Opciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="listaRegistros" var="registros" status="struts">
                                <tr >
                                    <td><s:property value="id"></s:property></td>
                                    <td><s:property value="imagen"></s:property></td>
                                    <td><s:property value="marca"></s:property></td>
                                    <td><s:property value="modelo"></s:property></td>
                                    <td><s:property value="vram"></s:property></td>
                                    <td><s:property value="ram"></s:property></td>
                                    <td><s:property value="conexion"></s:property></td>
                                    <td><s:property value="descripcion"></s:property></td>
                                    <td><s:property value="precio"></s:property></td>
                                    <td><s:property value="cantidad"></s:property></td>
                                    <td>
                                    <s:a action="actionActualizarTarjetaVideo">
                                        <s:param name="tarjetavideo.id" value="id"></s:param>
                                        <s:param name="tarjetavideo.imagen" value="imagen"></s:param>
                                        <s:param name="tarjetavideo.marca" value="marca"></s:param>
                                        <s:param name="tarjetavideo.modelo" value="modelo"></s:param>
                                        <s:param name="tarjetavideo.vram" value="vram"></s:param>
                                        <s:param name="tarjetavideo.ram" value="ram"></s:param>
                                        <s:param name="tarjetavideo.conexion" value="conexion"></s:param>
                                        <s:param name="tarjetavideo.descripcion" value="descripcion"></s:param>
                                        <s:param name="tarjetavideo.precio" value="precio"></s:param>
                                        <s:param name="tarjetavideo.cantidad" value="cantidad"></s:param>
                                        <span class="btn bg-warning text-white">Editar</span>
                                    </s:a>
                                    <s:a action="actionDeleteTarjetaVideo">
                                        <s:param name="tarjetavideo.id" value="id"></s:param>
                                        <span class="btn bg-danger text-white">Eliminar</span>
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
