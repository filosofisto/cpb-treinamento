/*
 * TimeRequestFilter.java
 *
 * Created on 9 de Março de 2006, 00:32
 */

package curso.jee.web.filter;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author  hp
 * @version
 */

public class TimeRequestFilter implements Filter {

    private ServletContext ctx;
    private TimeCalc timer;
    
    public void init(FilterConfig filterConfig) throws ServletException {
        ctx = filterConfig.getServletContext();
        timer = new TimeCalc();
        ctx.setAttribute("timer", timer);
    }

    public void doFilter(ServletRequest request, ServletResponse response, 
            FilterChain chain) throws IOException, ServletException {
        long inicio = System.currentTimeMillis();
        chain.doFilter(request, response);
        long fim = System.currentTimeMillis();
        long time = (fim-inicio);
        
        timer.addTime(time);
        ctx.log("Tempo: " + time + "ms");
    }

    public void destroy() {
    }
    
   
}
