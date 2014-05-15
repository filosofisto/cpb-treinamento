<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
                <td><input type="text" name="user" value="${cookie.user.value}"/></td>
            </tr>
            <tr>
                <td>Senha:</td>
                <td><input type="password" name="password" value="${cookie.password.value}"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="checkbox" name="lembrarSenha" value="on"/>Lembrar usuário e senha
                </td>
            </tr>
        </table>
        
        <input type="submit" value="Login">
    </form>  
            
    <c:if test="${not empty msg}">
        <script>
            alert('${msg}');
        </script>
    </c:if>
            
    </body>
</html>
