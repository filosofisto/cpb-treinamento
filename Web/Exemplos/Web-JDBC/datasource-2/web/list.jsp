<%-- 
    Document   : list
    Created on : 23/09/2011, 18:06:54
    Author     : filosofisto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: DataSource :.</title>
    </head>
    <body>
        <h1>Lista de Pessoas</h1>
        <table>
        <c:forEach items="${list}" var="p">
            <tr>
                <td>${p.id}</td>
                <td>${p.nome}</td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
