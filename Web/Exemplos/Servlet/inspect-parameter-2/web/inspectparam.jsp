<%-- 
    Document   : inspectparam
    Created on : Sep 16, 2011, 11:34:25 PM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP InspectParameter</title>
    </head>
    <body>
        <h1>Servlet InspectParameter at ${pageContext.request.contextPath}</h1>
        Method ${pageContext.request.method}
        <table border='1'>
            <c:forEach items="${param}" var="p">
                <tr>
                    <td>${p.key}</td>
                    <td>${p.value}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
