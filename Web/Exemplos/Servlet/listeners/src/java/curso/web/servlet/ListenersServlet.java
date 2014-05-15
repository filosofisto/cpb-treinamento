/*
 * ListenersServlet.java
 *
 * Created on February 27, 2005, 2:59 PM
 */

package curso.web.servlet;

import curso.web.listeners.ObjectBinding;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author eduardo.ribeiro
 * @version
 */
public class ListenersServlet extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
            
        String operation = request.getParameter("op");
        
        if ("ServletContextAttributeListener".equals(operation)) {
            getServletContext().setAttribute("contextName", "contextValue");
            getServletContext().setAttribute("contextName", "newValue");
            getServletContext().removeAttribute("contextName");
        } else if ("HttpSessionListener".equals(operation)) {
            HttpSession session = request.getSession(false);
            
            if (session != null) {
                session.invalidate();
            }
            
            session = request.getSession();
        } else if ("HttpSessionAttributeListener".equals(operation)) {
            HttpSession session = request.getSession();
            
            session.setAttribute("sessionAttr", "sessionAttrValue");
            session.setAttribute("sessionAttr", "newSessionAttrValue");
            session.removeAttribute("sessionAttr");
        } else if ("HttpSessionBindingListener".equals(operation)) {
            HttpSession session = request.getSession();
            
            ObjectBinding binding = new ObjectBinding();
            
            session.setAttribute("sessionBindingAttr", binding);
            session.setAttribute("sessionBindingAttr", binding);
            session.removeAttribute("sessionBindingAttr");
        }

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ListenersServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet ListenersServlet at " + request.getContextPath () + "</h1>");
        out.println("Operacao: " + operation + "<br>Verifique o log do container");
        out.println("</body>");
        out.println("</html>");
        out.close();
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