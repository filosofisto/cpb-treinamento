<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" import="java.util.Random"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
    Random r = new Random();
    int sorteado = r.nextInt(101) + 1;
    pageContext.setAttribute("sorteado", new Integer(sorteado), 
            PageContext.PAGE_SCOPE);
%>
   
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Taglib :.</title>
    </head>
    <body>

    <h3>Exemplo de uso de uma Taglib</h3>
    
    <c:choose>
        <c:when test="${sorteado % 2 == 0}">
            O valor ${sorteado} é PAR
        </c:when>
        <c:otherwise>
            O valor ${sorteado} é ÍMPAR
        </c:otherwise>
    </c:choose>
    
    </body>
</html>
