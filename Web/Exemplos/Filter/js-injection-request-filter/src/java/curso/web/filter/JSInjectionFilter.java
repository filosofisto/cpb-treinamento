/*
 * TimeRequestFilter.java
 *
 * Created on 9 de Mar�o de 2006, 00:32
 */
package curso.web.filter;

import java.io.*;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 *
 * @author  filosofisto
 * @version
 */
public class JSInjectionFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequestWrapper wrapper = new RequestWrapper((HttpServletRequest) request);
        chain.doFilter(wrapper, response);
    }

    public void destroy() {
    }
}
