<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="user" class="curso.web.beans.Usuario" scope="request"/>
<jsp:setProperty name="user" property="*"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: useBean :.</title>
    </head>
    <body>

    <h1>Exemplos da action useBean</h1>
    <h3>Apenas class</h3>
    
    <jsp:include page="user.jsp"/>
    
    </body>
</html>
