/*
 * Download.java
 *
 * Created on January 15, 2005, 3:01 PM
 */

package curso.web.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author eduardo.ribeiro
 * @version
 */
public class Download extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String fileName = request.getParameter("file");
        
        if ( fileName.endsWith("pdf")) { 
            response.setContentType("application/pdf");
        } else if ( fileName.endsWith("zip")) { 
            response.setContentType("application/zip");
        }

        OutputStream out = response.getOutputStream();
        
        byte[] bytes = new byte[1024];
        ServletContext context = getServletContext();
        InputStream in = context.getResourceAsStream("/files/" + fileName);
        int bytesread = 0;
        
        while ( (bytesread = in.read(bytes)) != -1 ) {
            out.write(bytes, 0, bytesread);
        }
        
        out.flush();
        in.close();
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
