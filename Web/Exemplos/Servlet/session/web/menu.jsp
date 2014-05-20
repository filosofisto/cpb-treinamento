<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="user" scope="session" class="curso.web.security.UserProfile"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Session :.</title>
    </head>
    <body>

    <h1>Bem vindo caro(a) ${user.username}</h1>
    <h3>jsessionid: <%=session.getId()%></h3>
    
    <table>
        <tr>
            <td>
                <a href="<%=response.encodeURL("controller?command=sessionid")%>">
                    * jsessionid COM response.encodeURL()
                </a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="controller?command=sessionid">
                    * jsessionid SEM response.encodeURL()
                </a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="<%=response.encodeURL("formURLRewriting.jsp")%>">* Form COM URL Rewriting</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="<%=response.encodeURL("form.jsp")%>">* Form SEM URL Rewriting</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="controller?command=logoff">Logoff</a>
            </td>
        </tr>
    </table>
    
    <h5>* Desabilite os cookies para verificar a diferença</h5>
    
    </body>
</html>
