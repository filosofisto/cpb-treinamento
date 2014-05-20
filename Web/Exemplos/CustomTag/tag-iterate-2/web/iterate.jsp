<%@page contentType="text/html" %>

<%@taglib uri="/WEB-INF/tlds/mytags" prefix="x"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>.: ${initParam.titulo} :.</title>
    </head>

    <body>
        <h1>${initParam.titulo}</h1>
        <h3>Lista de Clientes</h3>
        <table>
            <thead>
                <th>Nome</th>
                <th>Idade</th>
            </thead>
            <x:iterate items="${pessoas}" var="pessoa">
                <tr>
                    <td>${pessoa.nome}</td>
                    <td>${pessoa.idade}</td>
                </tr>
            </x:iterate>
        </table>
    </body>
</html>
