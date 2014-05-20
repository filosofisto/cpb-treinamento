/*
 * HeaderInspect.java
 *
 * Created on January 15, 2005, 2:03 PM
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
public class HeaderInspect extends HttpServlet {
    
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
        out.println("<title>Servlet HeaderInspect</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet HeaderInspect at " + request.getContextPath () 
                + "</h1>");
        out.println("<table border='1'>");
        
        String headerName;
        boolean ff6 = false;
        
        for (Enumeration enu = request.getHeaderNames(); enu.hasMoreElements();) {
            headerName = (String) enu.nextElement();
            
            out.println("<tr>");
            out.println("<td>" + headerName + "</td>");
            out.println("<td>" + request.getHeader(headerName) + "</td>");
            out.println("</tr>");
            
            if ("user-agent".equals(headerName)) {
                String userAgent = request.getHeader("user-agent");
                ff6 = userAgent.indexOf("Firefox/6") > -1;
            }
        }
        
        out.println("</table>");
        
        if (ff6) {
            out.println("<script>");
            out.println("alert('Aplicacao nao suporta Firefox 6.0');");
            out.println("</script>");
        }
        
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
