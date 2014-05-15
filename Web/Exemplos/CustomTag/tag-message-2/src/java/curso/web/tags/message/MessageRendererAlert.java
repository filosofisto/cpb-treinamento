/*
 * MessageRendererAlert.java
 *
 * Created on 11 de Mar�o de 2006, 18:40
 *
 */
package curso.web.tags.message;

import java.io.IOException;
import java.util.Iterator;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author filosofisto
 */
public class MessageRendererAlert implements MessageRenderer {

    @Override
    public void render(JspWriter out, Messages messages, String style)
            throws IOException {
        out.println("<script>");
        out.println("alert('" + getMessages(messages) + "');");
        out.println("</script>");
    }

    private String getMessages(Messages messages) {
        StringBuilder buf = new StringBuilder();

        for (Iterator it = messages.getMessages().iterator(); it.hasNext();) {
            buf.append(it.next().toString()).append("\\n");
        }

        return buf.toString();
    }
}
