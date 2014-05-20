/*
 * ControllerServlet.java
 *
 * Created on 6 de Marco de 2006, 13:18
 */

package curso.web.servlet;

import curso.web.beans.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        String method = request.getParameter("method");
        
        if ("apenasType".equals(method)) {
            apenasType(request, response);
        }
    }
    
    private void apenasType(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario user = new Usuario();
        user.setNome(request.getParameter("nome"));
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        
        request.setAttribute("user", user);
        forward("useBean2.jsp", request, response);
    }
    
    private void forward(String page, HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher d = request.getRequestDispatcher(page);
        d.forward(request, response);
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
