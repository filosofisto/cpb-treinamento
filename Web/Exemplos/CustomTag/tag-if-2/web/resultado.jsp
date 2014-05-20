<%@page contentType="text/html" %>

<%@taglib uri="/WEB-INF/tlds/mytags" prefix="x"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>.: ${initParam.titulo} :.</title>
    </head>

    <body>
        <h1>${initParam.titulo}</h1>
        <h3>Resultado</h3>

        <x:if condition="${param.valor1 gt param.valor2}">
            <x:true>
                ${param.valor1} é maior do que ${param.valor2}
            </x:true>
            <x:false>
                ${param.valor1} é menor ou igual a ${param.valor2}
            </x:false>
        </x:if>
    </body>
</html>
