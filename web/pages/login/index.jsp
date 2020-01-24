<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="${pageContext.request.contextPath}/resources/login/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/resources/login/css/cssLogin.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container well" id="containerLogin">
            <center><img src="resources/login/img/images.jpg" alt="" class="img-circle"/></center>
            <form action="login" method="post" id="form1">
                <div class="form-group">
                    <input type="email" class="form-control" placeholder="Email" id="username" name="username">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Password" id="password" name="password">
                </div>
                <button type="submit" value="Submit" id="botonLogin" class="btn btn-primary">INGRESAR</button>
            </form>
            <div class="col-12 forgot">
                <br><a href="${pageContext.request.contextPath}/pages/usuario/crearUsuario.jsp">Crear cuenta</a>
            </div>

        </div>
    </body>
</html>