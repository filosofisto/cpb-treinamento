/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.web.servlet;

import curso.web.dao.DAOFactory;
import curso.web.entity.Pessoa;
import curso.web.service.Service;
import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author filosofisto
 */
@WebServlet(name = "ConnectServlet", urlPatterns = {"/connect"})
public class ConnectServlet extends HttpServlet {

    @Resource(name = "jdbc/TestDB")
    private DataSource ds;

    @Override
    public void init(ServletConfig config) {
        DAOFactory.instance().setDataSource(ds);
    }

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("listarPessoas".equals(action)) {
            listarPessoa(request, response);
        } else if ("incluirPessoa".equals(action)) {
            incluirPessoa(request, response);
        } else if ("carregarPessoa".equals(action)) {
            carregarPessoa(request, response);
        } else if ("atualizarPessoa".equals(action)) {
            atualizarPessoa(request, response);
        } else if ("excluirPessoa".equals(action)) {
            excluirPessoa(request, response);
        } else if ("excluirPessoas".equals(action)) {
            excluirPessoas(request, response);
        }
    }

    private void listarPessoa(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        Service srv = new Service();

        List<Pessoa> list = srv.listarPessoas();

        request.setAttribute("list", list);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
        dispatcher.forward(request, response);
    }

    private void incluirPessoa(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        Service srv = new Service();

        Pessoa p = new Pessoa();
        p.setId(Integer.parseInt(request.getParameter("id")));
        p.setNome(request.getParameter("nome"));

        srv.incluirPessoa(p);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/incluirPessoa.jsp");
        dispatcher.forward(request, response);
    }

    private void carregarPessoa(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        Service srv = new Service();
        Integer id = Integer.parseInt(request.getParameter("id"));
        Pessoa p = srv.carregarPessoa(id);

        request.setAttribute("pessoa", p);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/editarPessoa.jsp");
        dispatcher.forward(request, response);
    }

    private void atualizarPessoa(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        Service srv = new Service();

        Pessoa p = new Pessoa();
        p.setId(Integer.parseInt(request.getParameter("id")));
        p.setNome(request.getParameter("nome"));

        srv.atualizarPessoa(p);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/connect?action=listarPessoas");
        dispatcher.forward(request, response);
    }

    private void excluirPessoa(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        Service srv = new Service();

        Pessoa p = new Pessoa();
        p.setId(Integer.parseInt(request.getParameter("id")));

        srv.excluirPessoa(p);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/connect?action=listarPessoas");
        dispatcher.forward(request, response);
    }

    private void excluirPessoas(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        Service srv = new Service();

        String[] values = request.getParameterValues("selecionados");
        Pessoa[] pessoas = new Pessoa[values.length];
        
        for (int i = 0; i < values.length; i++) {
            pessoas[i] = new Pessoa();
            pessoas[i].setId(Integer.parseInt(values[i]));
        }
        
        if (pessoas.length > 0) {
            srv.excluirPessoas(pessoas);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/connect?action=listarPessoas");
        dispatcher.forward(request, response);
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
