<%-- 
    Document   : params
    Created on : Sep 10, 2011, 10:20:51 AM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ContextPath at ${pageContext.request.contextPath}</h1>
        <table border='1'>
            <c:forEach items="${initParam}" var="p">
                <tr>
                    <td>${p.key}</td>
                    <td>${p.value}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
