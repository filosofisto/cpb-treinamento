/*
 * Cadastro.java
 *
 * Created on January 5, 2005, 2:52 PM
 */

package curso.web.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author  eduardo.ribeiro
 * @version
 */
public class Cadastro extends HttpServlet {
    
    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, 
        HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String sexo = request.getParameter("sexo");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>HelloServlet</title>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("Nome: " + nome + "<br>");
        out.println("Sexo: " 
            + ( "M".equals(sexo) ? "Masculino" : "Feminino" ) + "<br>");
        
        if ( "M".equals(sexo) ) {
            out.println("Autom�vel: ");
            out.println("<select name=\"automovel\">");
            out.println("<option value=\"1\">Ferrari</option>");
            out.println("<option value=\"2\">Fusca</option>");
            out.println("</select>");
        } else {
            out.println("Flores: ");
            out.println("<select name=\"flores\">");
            out.println("<option value=\"1\">Rosa</option>");
            out.println("<option value=\"2\">Margarida</option>");
            out.println("</select>");
        }
        
        String[] opcoes = request.getParameterValues("opcoes");
        out.println("<br>Opções selecionadas: ");
        
        for (int i = 0; i < opcoes.length; i++) {
            if ( i < opcoes.length-1 ) {
                out.println(opcoes[i] + ", ");
            } else {
                out.println(opcoes[i]);
            }
        }
        
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    
}
