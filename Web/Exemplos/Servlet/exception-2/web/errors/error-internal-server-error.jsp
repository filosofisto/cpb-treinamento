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
        <img src="${pageContext.request.contextPath}/imgs/500.jpg"/>
        <h1>Erro interno no servidor, tente mais tarde</h1>
    </body>
</html>
