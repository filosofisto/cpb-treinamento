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
import javax.servlet.http.Cookie;
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
        String method = request.getParameter("method");
        
        if ("login".equals(method)) {
            login(request, response);
        } else if ("logoff".equals(method)) {
            logoff(request, response);
        }
    }
    
    private void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserProfile userProfile = new UserProfile();
        
        userProfile.setUsername(request.getParameter("user"));
        userProfile.setPassword(request.getParameter("password"));
        
        SecurityService service = new SecurityService();
        
        if (service.isUserValid(userProfile)) {
            HttpSession session = request.getSession(false);
            if (session != null) {
                session.invalidate();
            }
            
            session = request.getSession();
            session.setAttribute("userProfile", userProfile);
            
            if (request.getParameter("lembrarSenha") != null) {
                Cookie cookie = new Cookie("user", userProfile.getUsername());
                cookie.setMaxAge(30*60); //30min
                response.addCookie(cookie);
                
                cookie = new Cookie("password", userProfile.getPassword());
                cookie.setMaxAge(30*60); //30min
                response.addCookie(cookie);
            } else {
                Cookie cookie = new Cookie("user", null);
                cookie.setMaxAge(0); //remove o cookie
                response.addCookie(cookie);
                
                cookie = new Cookie("password", null);
                cookie.setMaxAge(0); //remove o cookie
                response.addCookie(cookie);
            }
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("msg", "Usuario invalido");
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
            dispatcher.forward(request, response);
        }
    }
    
    private void logoff(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        
        if (session != null) {
            session.invalidate();
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
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
