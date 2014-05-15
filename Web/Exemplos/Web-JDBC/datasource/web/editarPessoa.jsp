<%-- 
    Document   : incluirPessoa
    Created on : Oct 29, 2011, 10:46:11 AM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Incluir Pessoa</h1>
        <form action="connect?action=atualizarPessoa" method="post">
            <div>
                Id:<br/>
                <input type="text" value="${pessoa.id}" disabled="true"/>
                <input type="hidden" name="id" value="${pessoa.id}"/>
            </div>
            <div>
                Nome:<br/>
                <input type="text" name="nome" value="${pessoa.nome}"/>
            </div>
            <input type="submit" value="Salvar"/>
            <input type="button" value="Cancelar" onclick="document.forms[1].submit()"/>
        </form>
        <form action="connect">
            <input type="hidden" name="action" value="listarPessoas"/>
        </form>
    </body>
</html>
