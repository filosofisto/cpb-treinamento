/*
 * SendError.java
 *
 * Created on January 18, 2005, 10:51 PM
 */

package curso.web.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author eduardo.ribeiro
 * @version
 */
public class SendError extends HttpServlet {
    
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        String status = request.getParameter("status");
        
        if ( "SC_NOT_FOUND".equals(status) ) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, 
                    "Infelizmente este recurso nao existe nesta versao.");
        } else if ( "SC_UNAUTHORIZED".equals(status) ) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, 
                    "Este recurso nao esta autorizado para acesso externo");
        } else if ( "SC_INTERNAL_SERVER_ERROR".equals(status) ) {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
                    "Infelizmente ha um erro critico no servidor");
        }

    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
