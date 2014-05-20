<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: JSInjectionRequestFilter :.</title>
    </head>
    <body>

    <h1>JSInjectionRequestFilter</h1>
    
    Dados digitados pelo usuário:<br/>
    <%--${param.dados}--%>
    <%=request.getParameter("dados")%>
    </body>
</html>
