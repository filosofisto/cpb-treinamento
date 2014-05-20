/*
 * DispatcherCalc.java
 *
 * Created on January 18, 2005, 11:11 PM
 */

package curso.web.servlet;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author eduardo.ribeiro
 * @version
 */
public class DispatcherCalc extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        String numerador = request.getParameter("numerador");    
        String denominador = request.getParameter("denominador");
        
        try {
            int num = Integer.parseInt(numerador);
            int den = Integer.parseInt(denominador);
            
            int result = num / den;
            
            dispatch(request, response, "sucesso.html");
        } catch ( Exception e ) {
            dispatch(request, response, "fracasso.html");
        }
    }
    
    private void dispatch(HttpServletRequest request, 
            HttpServletResponse response, String location) 
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(location);
        dispatcher.forward(request, response);
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
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
