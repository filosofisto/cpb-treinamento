/*
 * InspectParameter.java
 *
 * Created on January 15, 2005, 10:17 AM
 */

package curso.web.servlet;

import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author eduardo.ribeiro
 * @version
 */
public class InspectParameter extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet InspectParameter</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet InspectParameter at " + request.getContextPath() + "</h1><h3>");
        out.println("Method: " + request.getMethod() + "<br>");
        
        String paramName;
        Enumeration enu = request.getParameterNames();
        
        while (enu.hasMoreElements()) {
            paramName = (String) enu.nextElement();
            
            out.println(paramName + ": " + request.getParameter(paramName) + "<br>");
        }        
        
        out.println("</h3></body>");
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
