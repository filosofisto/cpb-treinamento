<%-- 
    Document   : params
    Created on : Sep 10, 2011, 10:20:51 AM
    Author     : eduardo
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ContextPath at ${pageContext.request.contextPath}</h1>
        ${param.paramName} = ${initParam[param.paramName]}
        <br/>
        urlDB = ${initParam.urlDB}
    </body>
</html>
