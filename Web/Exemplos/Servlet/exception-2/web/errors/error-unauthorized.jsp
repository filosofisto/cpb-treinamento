<%-- 
    Document   : error-notfound
    Created on : Sep 18, 2011, 9:40:35 PM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro</title>
    </head>
    <body>
        <img src="${pageContext.request.contextPath}/imgs/401.jpg"/>
        <h1>Você não tem autorização para acessar este recurso</h1>
    </body>
</html>
