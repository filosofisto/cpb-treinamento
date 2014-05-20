<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
    request.setAttribute("nome", "Pietro Ubaldi");
    request.setAttribute("input", "<input type=\"text\" value=\"Isto eh uma input\"/>");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: ${initParam.titulo} :.</title>
    </head>
    <body>

    <h1>${initParam.titulo}</h1>
    <h3>Tags de Propósito Geral</h3>
    
    Nome: <c:out value="${nome}"/><br/>
    Input (resolvendo caracteres especiais): <c:out value="${input}"/><br/>
    Input (sem resolver caracteres especiais): <c:out value="${input}" escapeXml="false"/><br/>
    EL (não resolvem caracteres especiais): ${input}<br/>
    Valor default: <c:out value="${naoExiste}" default="Valor não encontrado em nenhum scope"/>
    
    </body>
</html>
