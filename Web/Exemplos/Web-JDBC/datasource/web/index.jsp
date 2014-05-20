<%-- 
    Document   : index
    Created on : 23/09/2011, 16:59:15
    Author     : 81646674987
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DataSource</h1>
        <ul>
            <li><a href="connect?action=listarPessoas">Listagem de Pessoas</a></li>
            <li><a href="incluirPessoa.jsp">Incluir Pessoa</a></li>
        </ul>
        
        <h6>
            Observações
            <ul>
                <li>
                    Iniciar o serviço no Linux:<br/>
                    sudo /etc/rc.d/init.d/mysqld start
                </li>
                <li>
                    Para criar o banco:
                    <ul>
                        <li>mysql -u root -p</li>
                        <li>Colar o script do banco</li>
                    </ul>
                </li>
            </ul>
        </h6>
    </body>
</html>


