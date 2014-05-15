<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: ${initParam.titulo} :.</title>
    </head>
    <body>

    <h1>${initParam.titulo}</h1>
    <h3>Tags de Propósito Geral</h3>
    
    <jsp:useBean id="pessoa" class="curso.jee.web.beans.Pessoa"/>
    <c:set target="${pageScope.pessoa}" property="nome">
        ${param.nome}
    </c:set>
    <c:set target="${pageScope.pessoa}" property="idade" value="${param.idade}"/>
    Atributos de Pessoa APÓS setar valores aos mesmos<br/>
    Nome: ${pessoa.nome}<br/>
    Idade: ${pessoa.idade}<br/>
    
    <c:remove var="pessoa"/> 
    <c:out value="${pessoa.nome}" default="Objeto pessoa foi removido do escopo"/>
    </body>
</html>
