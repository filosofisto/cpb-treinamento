<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" import="curso.web.tags.message.Constants"%>

<%@taglib uri="/WEB-INF/tlds/mytags" prefix="x"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: ${initParam.titulo} :.</title>
    </head>
    <body>

        <h1>${initParam.titulo}</h1>

        <!-- Exemplo de Tag body-content empty -->
        <!--x:messages jsRenderer="false"
            styleError="color:red;font-weight:bold" 
            styleWarn="color:blue" 
            styleInfo="color:green"/-->

        <!-- Exemplo de tag body-content JSP colocando objeto no scopo de page -->   
        <x:exist id="<%=Constants.ATTR_NAME%>">
            <div style="color:red">
                <ul>
                <x:messagesBody id="erro">
                    <li>${erro}</li>
                </x:messagesBody>
                </ul>
            </div>
        </x:exist>

        <form action="cadastro" method="POST">
            <table>
                <tbody>
                    <tr>
                        <td>Nome:</td>
                        <td><input type="text" name="nome" value="${param.nome}"/></td>
                    </tr>
                    <tr>
                        <td>Idade:</td>
                        <td><input type="text" name="idade" value="${param.idade}"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Salvar"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
