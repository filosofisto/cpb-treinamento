<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Session :.</title>
    </head>
    <body>

    <h3>jsessionid: ${pageContext.session.id}</h3>
    
    <form action="controller?command=sessionid" method="post">
        <input type="submit"/>
    </form>
    
    </body>
</html>
