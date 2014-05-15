<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: ${initParam.titulo} :.</title>
    </head>
    <body>

    <h1>${initParam.titulo}</h1>
    
    <a href="admin/recurso-seguro.jsp">Recurso Seguro*</a><br/>
    <a href="pages/recurso-normal.jsp">Recurso NÃO Seguro</a><br/>
    
    <h4>* Tente user=ide password=2UcN4SuQ ou user=tomcat password=tomcat (Bundle TomCat-NetBeans) </h4>
    </body>
</html>
