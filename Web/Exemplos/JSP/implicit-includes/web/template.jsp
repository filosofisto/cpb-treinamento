<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet" type="text/css">
        <title>.: Diretiva Include :.</title>
    </head>
    <body>
        <table>
            <tr>
                <td colspan="2">
                   <h1>Usando a diretiva include</h1>
                </td>
            </tr>
            <tr>
                <td valign="top">
                    <%@include file="menu.jsp"%>
                </td>
                <td valign="top">
                    <%@include file="body.jsp"%>
                </td>
            </tr>
        </table>
    </body>
</html>