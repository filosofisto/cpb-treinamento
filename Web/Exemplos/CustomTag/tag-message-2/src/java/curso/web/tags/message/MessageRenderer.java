/*
 * MessageRendererT.java
 *
 * Created on 11 de Mar�o de 2006, 18:38
 *
 */
package curso.web.tags.message;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author filosofisto
 */
public interface MessageRenderer {

    void render(JspWriter out, Messages messages, String style)
            throws IOException;
}
