/*
 * CadastroServlet.java
 *
 * Created on 11 de Marco de 2006, 17:15
 */

package curso.web.servlet;

import curso.web.tags.message.Constants;
import curso.web.tags.message.Messages;
import curso.web.util.NumericUtil;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Eduardo Ribeiro da Silva
 * @version 1.00
 */
public class CadastroServlet extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");
        
        Messages messages = new Messages();
        
        if (nome == null || nome.trim().length() == 0) {
            messages.addMessages("Nome é um campo obrigatório");
        }
        
        if (idade == null || idade.trim().length() == 0) {
            messages.addMessages("Idade é um campo obrigatório");
        } else {
            if (!NumericUtil.isNumeric(idade)) {
                messages.addMessages("Idade inválida");
            }
        }
        
        request.setAttribute(Constants.ATTR_NAME, messages);
        
        if (!messages.isEmpty()) {
            messages.setType(Messages.ERROR_TYPE);
            forward("/cadastro.jsp", request, response);
        } else {
            //TODO: efetuar o cadastro
            messages.setType(Messages.INFO_TYPE);
            messages.addMessages("Registro incluído com sucesso");
            forward("/message-geral.jsp", request, response);
        }
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
