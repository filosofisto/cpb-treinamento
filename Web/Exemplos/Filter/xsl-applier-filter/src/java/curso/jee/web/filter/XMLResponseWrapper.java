/*
 * XMLResponseWrapper.java
 *
 * Created on 10 de Março de 2006, 12:44
 *
 */

package curso.jee.web.filter;

import java.io.CharArrayWriter;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 *
 * @author hp
 */
public class XMLResponseWrapper extends HttpServletResponseWrapper {
    
    private CharArrayWriter buffer;
    
    public XMLResponseWrapper(HttpServletResponse response) {
        super(response);
        buffer = new CharArrayWriter();
    }
    
    public PrintWriter getWriter() {
        return new PrintWriter(buffer);
    }
    
    public String toString() {
        return buffer.toString();
    }
}
