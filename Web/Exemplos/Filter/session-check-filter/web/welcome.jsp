<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${initParam.titulo}</title>
    </head>
    <body>

    <h1>Bem vindo ${sessionScope.user.username}</h1>
    
    <a href="controller">Acessar sistema (esperar 1min para a sessão expirar)</a>
    
    </body>
</html>
