/*
 * XSLAppliterFilter.java
 *
 * Created on 10 de Março de 2006, 12:37
 */

package curso.jee.web.filter;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author  hp
 * @version
 */

public class XSLApplierFilter implements Filter {
    
    private Transformer transformer;
    private ServletContext ctx;
    
    public void init(FilterConfig filterConfig) {
        ctx = filterConfig.getServletContext();
        
        String xsl = filterConfig.getInitParameter("xslConsulta");
        
        TransformerFactory factory = TransformerFactory.newInstance();
        InputStream is = filterConfig.getServletContext().
                getResourceAsStream(xsl);
        
        try {
            transformer = factory.newTransformer(new StreamSource(is));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        
        XMLResponseWrapper wrapperResponse = 
                new XMLResponseWrapper((HttpServletResponse) response);

        chain.doFilter(request, wrapperResponse);
        
        try {
            wrapperResponse.setContentType("text/html");
            transformer.transform(new StreamSource(
                    new StringReader(wrapperResponse.toString())), 
                    new StreamResult(out));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void log(String text) {
        ctx.log(text);
    }
    
    public void destroy() {
    }
}


