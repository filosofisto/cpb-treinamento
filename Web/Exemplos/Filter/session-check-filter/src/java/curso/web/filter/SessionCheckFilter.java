/*
 * TimeRequestFilter.java
 *
 * Created on 9 de Marco de 2006, 00:32
 */

package curso.web.filter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author  hp
 * @version
 */

public class SessionCheckFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    public void doFilter(ServletRequest request, ServletResponse response, 
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        String uri = ((HttpServletRequest) request).getRequestURI();
        if (!uri.startsWith("login")) {
            //Verifica se existe sessao e usuario na sessao
            HttpSession session = httpRequest.getSession(false);
            if (session != null) {
                if (session.getAttribute("user") != null) {
                    chain.doFilter(request, response);
                } else {
                    forwardToLogin(httpRequest, httpResponse);
                }
            } else {
                forwardToLogin(httpRequest, httpResponse);
            }
        } 
    }
    
    private void forwardToLogin(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("erro", "Senha expirada");
        
        RequestDispatcher d = request.getRequestDispatcher("/login.jsp");
        d.forward(request, response);
    }        

    public void destroy() {
    }
}
