<%@page contentType="text/html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>.: ${initParam.titulo} :.</title>
    </head>

    <body>
        <h1>${initParam.titulo}</h1>
        <h3>Menu Principal</h3>

        <form action="resultado.jsp" method="post"> 
            <table>
                <tr>
                    <td>Valor 1</td>
                    <td><input type="text" name="valor1"/></td>
                </tr>
                <tr>
                    <td>Valor 2</td>
                    <td><input type="text" name="valor2"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Ok"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
