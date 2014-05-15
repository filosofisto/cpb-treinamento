<%-- 
    Document   : header
    Created on : Sep 17, 2011, 10:09:36 AM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="/WEB-INF/tlds/functions"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ContextPath at ${pageContext.request.contextPath}</h1>
        <table border='1'>
            <c:forEach items="${header}" var="h">
                <tr>
                    <td>${h.key}</td>
                    <td>${h.value}</td>
                </tr>
            </c:forEach>
        </table>
        
        <c:if test="${f:firefox6(pageContext.request)}">
            <script>
                alert('Aplicacao nao suporta Firefox 6.0');
            </script>
        </c:if>
    </body>
</html>
