<%-- 
    Document   : header
    Created on : 23/01/2020, 11:38:59 AM
    Author     : labtw13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

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