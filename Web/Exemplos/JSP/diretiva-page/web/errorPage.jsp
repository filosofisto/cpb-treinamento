<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Diretivas :.</title>
    </head>
    <body>

    <h1>Página de Erro</h1>
    
    <div style="color:red">
        <%=exception.getMessage()%>
    </div>
    
    </body>
</html>
