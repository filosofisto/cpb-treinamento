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
    <h3>Usuário não autorizado</h3>
    
    <span style="color:red">
        Vc não pode acessar o sistema.<br/>
        Lamento, ordens são ordens, elas foram DECLARADAS no web.xml
    </span>
    
    </body>
</html>
