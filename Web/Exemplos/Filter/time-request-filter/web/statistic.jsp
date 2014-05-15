<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: TimeRequestFilter :.</title>
    </head>
    <body>

    <h1>TimeRequestFilter</h1>
    <h3>Estatística</h3>
    
    <table>
        <tr>
            <td>Tempo total de requisições:</td>
            <td>${applicationScope.timer.totalTime}</td>
        </tr>
        <tr>
            <td>Quantidade de requisições:</td>
            <td>${applicationScope.timer.quantity}</td>
        </tr>    
        <tr>
            <td>Média de tempo das requisições:</td>
            <td>${applicationScope.timer.average}</td>
        </tr>
    </table>
    
    </body>
</html>
