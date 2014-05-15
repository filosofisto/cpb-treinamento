<%@page import="curso.web.security.UserProfile"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="userProfile" scope="session" type="curso.web.security.UserProfile"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Session :.</title>
    </head>
    <body>

        <h1>Bem vindo caro(a) <jsp:getProperty name="userProfile" property="username"/></h1>
    
    <a href="controller?method=logoff">Logoff</a>
    
    </body>
</html>
