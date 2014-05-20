/*
 * MessageRenderer.java
 *
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
public class MessageRendererDefault implements MessageRenderer {

    @Override
    public void render(JspWriter out, Messages messages, String style)
            throws IOException {
        if (style != null) {
            out.println("<div style=\"" + style + "\">");
            renderMessages(out, messages);
            out.println("</div>");
        } else {
            renderMessages(out, messages);
        }
    }

    private void renderMessages(JspWriter out, Messages messages)
            throws IOException {
        out.println("<ul>");
        for (Iterator it = messages.getMessages().iterator(); it.hasNext();) {
            out.println("<li>" + it.next() + "</li>");
        }
        out.println("</ul>");
    }
}
