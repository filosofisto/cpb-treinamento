<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
    String user = "";
    String password = "";
    
    Cookie[] cookies = request.getCookies();
   
    if (cookies != null) {
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals("user")) {
                user = cookies[i].getValue();
            } else if (cookies[i].getName().equals("password")) {
                password = cookies[i].getValue();
            }
        }
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Cookies :.</title>
    </head>
    <body>

    <h3>Login</h3>
    
    <form action="controller" method="post">
        <input type="hidden" name="method" value="login"/>
        <table>
            <tr>
                <td>Usuário:</td>
                <td><input type="text" name="user" value="<%=user%>"/></td>
            </tr>
            <tr>
                <td>Senha:</td>
                <td><input type="password" name="password" value="<%=password%>"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="checkbox" name="lembrarSenha" value="on"/>Lembrar usuário e senha
                </td>
            </tr>
        </table>
        
        <input type="submit" value="Login">
    </form>  
    
    <%
    String msg = (String) request.getAttribute("msg");
    if (msg != null) {
    %>
    <script>
        alert('<%=msg%>');
    </script>
    <%}%>
    </body>
</html>
