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
    <h3>Tags Condicionais</h3>
    <table>
        <tr><td><a href="c-if.jsp"><c:out value="<c:if>"/></a></td></tr>
        <tr><td><a href="c-choose.jsp"><c:out value="<c:choose> <c:when> <c:otherwise>"/></a></td></tr>
    </table>
    
    </body>
</html>
