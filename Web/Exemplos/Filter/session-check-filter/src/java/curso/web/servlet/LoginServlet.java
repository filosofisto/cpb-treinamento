/*
 * LoginServlet.java
 *
 * Created on 8 de Mar�o de 2006, 20:39
 */

package curso.web.servlet;

import curso.web.beans.User;
import curso.web.security.SecurityService;
import java.io.*;
import java.util.Properties;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Eduardo Ribeiro da Silva
 * @version 1.00
 */
public class LoginServlet extends HttpServlet {
    
    private SecurityService service;
    
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        try {
            InputStream in = 
                    getServletContext().getResourceAsStream("/WEB-INF/users.properties");
            Properties p = new Properties();
            p.load(in);
            
            service = new SecurityService();
            service.setProperties(p);
        } catch (IOException e) {
            throw new ServletException(e);
        }
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        
        boolean result = service.authenticate(user);
        
        String page;
        if (result) {
            HttpSession session = request.getSession(false);
            if (session != null) {
                session.invalidate();
            }
            session = request.getSession();
            session.setAttribute("user", user);
            
            page = "/welcome.jsp";
        } else {
            request.setAttribute("erro", "Usuário inválido");
            page = "/login.jsp";
        }
        
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
