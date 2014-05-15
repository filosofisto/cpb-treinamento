<%-- 
    Document   : incluirPessoa
    Created on : Oct 29, 2011, 10:46:11 AM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Incluir Pessoa</h1>
        <form action="connect?action=incluirPessoa" method="post">
            <div>
                Id:<br/>
                <input type="text" name="id"/>
            </div>
            <div>
                Nome:<br/>
                <input type="text" name="nome"/>
            </div>
            <input type="submit" value="Salvar"/>
            <input type="button" value="Cancelar" onclick="document.forms[1].submit()"/>
        </form>
        <form action="index.jsp"/>
    </body>
</html>
