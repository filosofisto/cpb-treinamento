/*
 * LifeCycle.java
 *
 * Created on January 15, 2005, 11:28 AM
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
public class LifeCycle extends HttpServlet {
    
    private StringBuffer buf;
    

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        logInfo("init");
    }
    
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
        out.println("<title>Servlet LifeCycle</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet LifeCycle at " + request.getContextPath () + "</h1>");
        out.println(buf.toString());
        out.println("</body>");
        out.println("</html>");

        out.close();
        
        //Limpa o buffer
        buf.delete(0, buf.length());
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logInfo("doGet");
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logInfo("doPost");
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logInfo("service");
        super.service(req, resp);
    }

    public void destroy() {
        log("destroy");
        super.destroy();
    }
    // </editor-fold>
    
    private void logInfo(String info) {
        if ( buf == null ) {
            buf = new StringBuffer();
        }
        
        buf.append("<br>" + info);
        log(info);
    }
}
