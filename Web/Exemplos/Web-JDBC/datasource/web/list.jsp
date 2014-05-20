<%-- 
    Document   : list
    Created on : 23/09/2011, 18:06:54
    Author     : filosofisto
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: DataSource :.</title>
    </head>
    <body>
        <h1>Lista de Pessoas</h1>
        <form action="connect" method="post">
            <table border="1">
            <c:forEach items="${list}" var="p">
                <tr>
                    <td><input type="checkbox" name="selecionados" value="${p.id}"/></td>
                    <td>${p.id}</td>
                    <td>${p.nome}</td>
                    <td><a href="connect?action=carregarPessoa&id=${p.id}">Alterar</a></td>
                    <td>
                        <a href="connect?action=excluirPessoa&id=${p.id}" 
                           onclick="if (!confirm('Confirmar exclusão?')) return false">Excluir</a>
                    </td>
                </tr>
            </c:forEach>
            </table>
        
            <input type="hidden" name="action" value="excluirPessoas"/>
            <input type="submit" value="Excluir Selecionados" onclick="if (!confirm('Confirmar exclusão múltipla?')) return false"/>
            <input type="button" value="Voltar" onclick="voltar()"/>
        </form>
    </body>
    <script lang="JavaScript">
        function voltar() {
            document.forms[0].action='index.jsp';
            document.forms[0].submit()
        }
    </script>
</html>
