<%@page contentType="text/html"%>
<%@page isErrorPage="true"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.io.PrintWriter"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script language="JavaScript">
            function show() {
                var div = document.getElementById("div-error");
                if (div) {
                    div.style.display = "block";
                }
            }
        </script>
        <h1 style="color: red">Erro:</h1>
        <h3 style="color: red">${pageContext.exception}</h3>
        <h5>
            Para maiores detalhes sobre o problema 
            <a href="javascript:show()">clique aqui</a>
        </h5>
        <div id="div-error" style="display: none;">
            <pre>
            <%
                // unwrap ServletExceptions.
                while (exception instanceof ServletException) {
                    exception = ((ServletException) exception).getRootCause();
                }

                // print stack trace.
                exception.printStackTrace(new PrintWriter(out));
            %>
            </pre>
        </div>
    </body>
</html>
