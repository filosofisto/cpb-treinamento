/*
 * ControllerServlet.java
 *
 * Created on 1 de Mar�o de 2006, 10:56
 */

package curso.web.servlet;

import curso.web.security.SecurityService;
import curso.web.security.UserProfile;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        String command = request.getParameter("command");
        
        if ("login".equals(command)) {
            login(request, response);
        } else if ("logoff".equals(command)) {
            logoff(request, response);
        } else if ("sessionid".equals(command)) {
            sessionid(request, response);
        } else if ("form".equals(command)) {
            String texto = request.getParameter("texto");
            sessionid(request, response);
        }
    }
    
    private void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserProfile user = new UserProfile();
        user.setUsername(request.getParameter("user"));
        user.setPassword(request.getParameter("password"));
        
        String nextPage = "/index.jsp";
        
        SecurityService service = new SecurityService();
        if (service.isUserValid(user)) {
            HttpSession session = request.getSession(false);
            if (session != null) {
                session.invalidate();
            }
            
            session = request.getSession();
            session.setAttribute("user", user);
            
            nextPage = "/menu.jsp";
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
        dispatcher.forward(request, response);
    }
    
    private void logoff(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        
        if (session != null) {
            session.invalidate();
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
    
    private void sessionid(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/menu.jsp");
            dispatcher.forward(request, response);
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
