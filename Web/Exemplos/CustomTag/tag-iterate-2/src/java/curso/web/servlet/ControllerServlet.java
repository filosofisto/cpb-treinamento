/*
 * Created on 12/03/2006
 *
 */
package curso.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.web.beans.Pessoa;
import javax.servlet.annotation.WebServlet;

/**
 * @author hp
 *
 */
public class ControllerServlet extends HttpServlet {

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Collection pessoas = generateSimulationData();
        request.setAttribute("pessoas", pessoas);

        RequestDispatcher d = request.getRequestDispatcher("/iterate.jsp");
        d.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private Collection generateSimulationData() {
        Collection result = new ArrayList();
        Pessoa p;
        for (int i = 1; i <= 30; i++) {
            p = new Pessoa();
            p.setNome("Fulano" + i);
            p.setIdade(i);

            result.add(p);
        }

        return result;
    }
}
