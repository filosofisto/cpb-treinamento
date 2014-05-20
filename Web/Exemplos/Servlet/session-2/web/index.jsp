<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Login :.</title>
    </head>
    <body>

    <h1>Login</h1>
    
    <form action="controller?command=login" method="post">
        Usuário:<br>
        <input type="text" name="user"/><br>
        
        Senha:<br>
        <input type="password" name="password"/><br> 
        
        <input type="submit" value="Login">
    </form>    
    </body>
</html>
