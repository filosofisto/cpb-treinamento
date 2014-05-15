<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" import="curso.jee.web.beans.Pessoa,java.util.*"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
    Pessoa p;
    Collection c = new ArrayList();
    for (int i = 1; i < 101; i++) {
        p = new Pessoa();
        p.setNome("Nome " + i);
        p.setIdade(i);
        
        c.add(p);
    }
    
    pageContext.setAttribute("pessoas", c, PageContext.PAGE_SCOPE);
%>   
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: ${initParam.titulo} :.</title>
    </head>
    <body>

    <h1>${initParam.titulo}</h1>
    <h3>Tags de Iteração</h3>
    
    <table>
        <thead>
            <th>#</th>
            <th>Nome</th>
            <th>Idade</th>
        </thead>
        <tbody>
        <c:forEach items="${pageScope.pessoas}" var="p" varStatus="status" begin="0" end="9">
            <c:choose>
                <c:when test="${status.count mod 2 == 0}">
                    <tr style="background:yellow">
                        <td>${status.count}</td>
                        <td>${p.nome}</td>
                        <td>${p.idade}</td>
                    </tr>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td>${status.count}</td>
                        <td>${p.nome}</td>
                        <td>${p.idade}</td>
                    </tr>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        <tbody>
    </table>
    </body>
</html>
