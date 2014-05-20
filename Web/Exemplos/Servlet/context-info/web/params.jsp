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
        <h1>ContextPath at <%=request.getContextPath()%></h1>
        <table border='1'>
            <%
            ServletContext servletContext = pageContext.getServletContext();
            Enumeration e = servletContext.getInitParameterNames();
            String paramName, paramValue;
            while (e.hasMoreElements()) {
                paramName = e.nextElement().toString();
                paramValue = servletContext.getInitParameter(paramName);
            %>
            <tr>
                <td><%=paramName%></td>
                <td><%=paramValue%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
