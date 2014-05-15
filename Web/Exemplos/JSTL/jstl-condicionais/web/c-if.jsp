<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" import="java.util.Calendar"%>

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
    
    <% 
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        pageContext.setAttribute("hour", new Integer(hour), PageContext.PAGE_SCOPE);
    %>  

    <c:if test="${hour lt 12}">
        Bom dia
    </c:if>
    <c:if test="${hour ge 12 and hour lt 18}">
        Boa tarde
    </c:if>
    <c:if test="${hour ge 18}">
        Boa noite
    </c:if>
    
    </body>
</html>
