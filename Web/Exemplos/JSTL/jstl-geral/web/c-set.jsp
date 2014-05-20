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
    
    Atribuindo valor a uma variável<br/>
    <c:set var="varName" value="Nome da variável"/>
    varName: ${varName}<p/>

    <jsp:useBean id="pessoa" class="curso.jee.web.beans.Pessoa"/>
    Atributos de Pessoa ANTES de setar valores aos mesmos<br/>
    Nome: ${pessoa.nome}<br/>
    Idade: ${pessoa.idade}<br/>
    <c:set target="${pageScope.pessoa}" property="nome">
        ${param.nome}
    </c:set>
    <c:set target="${pageScope.pessoa}" property="idade" value="${param.idade}"/>
    Atributos de Pessoa APÓS setar valores aos mesmos<br/>
    Nome: ${pessoa.nome}<br/>
    Idade: ${pessoa.idade}<p/>
    
    <jsp:useBean id="map" class="java.util.HashMap"/>
    <c:set target="${pageScope.map}" property="nome" value="Platão"/>
    <c:set target="${pageScope.map}" property="idade" value="45"/>
    Definindo valores num Map<br/>
    map.get("nome"): ${map.nome}<br/>
    map.get("idade"): ${map.idade}<br/>
    </body>
</html>
