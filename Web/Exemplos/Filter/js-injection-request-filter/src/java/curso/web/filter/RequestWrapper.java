/*
 * RequestWrapper.java
 *
 * Created on 9 de Mar�o de 2006, 17:40
 *
 */

package curso.web.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 *
 * @author filosofisto
 */
public class RequestWrapper extends HttpServletRequestWrapper {
    
    public RequestWrapper(HttpServletRequest request) {
        super(request);
    }

    public String getParameter(String name) {
        String original = getRequest().getParameter(name);

        return filterString(original);
    }
    
    private String filterString(String original) {
        return original.replace("<", "&lt;").replace(">", "&gt;");
    }
}
