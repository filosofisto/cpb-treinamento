<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" session="false" isErrorPage="true"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%!
    int sum(int a, int b) {
        return a + b;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Declaration :.</title>
    </head>
    <body>

    <h3>Soma</h3>
    
    10 + 20 = <%=sum(10, 20)%>
    
    </body>
</html>
