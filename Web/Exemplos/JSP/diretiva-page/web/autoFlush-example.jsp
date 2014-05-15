<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page autoFlush="false" errorPage="errorPage.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Diretiva :.</title>
    </head>
    <body>

    <h1>autoFlush=false</h1>
    
    <!-- Gera código afim de fazer a página ultrapassar os 8kb default -->
    <%
        for (int i = 1; i < 100; i++) {
            out.println("Espero que o buffer supere o tamanho default e dispare uma Exception. i=" + i + "<br>");
        }
    %>
    
    </body>
</html>
