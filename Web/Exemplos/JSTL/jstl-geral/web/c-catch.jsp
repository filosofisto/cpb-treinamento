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
    
    <c:catch var="erro">
        <%=Integer.parseInt(request.getParameter("numerador"))/Integer.parseInt(request.getParameter("denominador"))%>
    </c:catch>
    <c:if test="${not empty(erro)}">
        Ocorreu o seguinte erro: ${erro.message}
    </c:if>
    </body>
</html>
