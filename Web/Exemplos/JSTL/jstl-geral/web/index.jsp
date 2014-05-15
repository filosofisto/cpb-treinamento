<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: ${initParam.titulo} :.</title>
    </head>
    <body>

    <h1>${initParam.titulo}</h1>
    <h3>Tags de Propósito Geral</h3>
    <table>
        <tr><td><a href="c-out.jsp"><c:out value="<c:out>"/></a></td></tr>
        <tr><td><a href="c-set.jsp?nome=Sócrates&idade=72"><c:out value="<c:set>"/></a></td></tr>
        <tr><td><a href="c-remove.jsp?nome=Sócrates&idade=72"><c:out value="<c:remove>"/></a></td></tr>
        <tr><td><a href="c-catch.jsp?numerador=10&denominador=0"><c:out value="<c:catch>"/></a></td></tr>
    </table>
        
    </body>
</html>
