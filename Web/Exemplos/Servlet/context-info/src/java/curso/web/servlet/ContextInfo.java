/*
 * ContextInfo.java
 *
 * Created on January 15, 2005, 2:20 PM
 */

package curso.web.servlet;

import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author eduardo.ribeiro
 * @version
 */
public class ContextInfo extends HttpServlet {
    
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
        out.println("<title>Servlet ContextInfo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet ContextInfo at " + request.getContextPath () 
                + "</h1>");
        out.println("<table border='1'>");

        String ctxInitParamName;
        ServletContext context = getServletContext();
        
        for (Enumeration enu = context.getInitParameterNames();
                enu.hasMoreElements();) {
            ctxInitParamName = (String) enu.nextElement();    
            
            out.println("<tr>");
            out.println("<td>" + ctxInitParamName + "</td>");
            out.println("<td>" + context.getInitParameter(ctxInitParamName) + "</td>");
            out.println("</tr>");
        }
        
        out.println("</table>");
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
