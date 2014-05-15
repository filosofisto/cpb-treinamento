/*
 * ControllerServlet.java
 *
 * Created on 10 de Março de 2006, 14:12
 */

package curso.jee.web.servlet;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Eduardo Ribeiro da Silva
 * @version 1.00
 */
public class ControllerServlet extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String book = request.getParameter("book");

        InputStream is = getServletContext().getResourceAsStream("/books/" + book + ".xml");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        PrintWriter out = response.getWriter();
        String line;
        
        while ((line = reader.readLine()) != null) {
            out.println(line);
        }
        
        reader.close();            
               
        out.flush();
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /**
     * Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
