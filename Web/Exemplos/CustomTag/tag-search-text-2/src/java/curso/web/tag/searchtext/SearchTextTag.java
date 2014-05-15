/*
 * Created on 13/03/2006
 *
 */
package curso.web.tag.searchtext;

import java.io.IOException;
import java.io.StringWriter;

import java.util.StringTokenizer;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author filosofisto
 *
 */
public class SearchTextTag extends SimpleTagSupport {

    private String text;

    @Override
    public void doTag() throws JspException {
        try {
            JspWriter out = getJspContext().getOut();
            StringWriter writer = new StringWriter();
            
            JspFragment f = getJspBody();
            f.invoke(writer);
            
            out.println(processSearch(writer.toString()));
        } catch (IOException e) {
            throw new JspException(e);
        }
    }

    private String processSearch(String texto) {
        StringBuilder buf = new StringBuilder();
        StringTokenizer toker = new StringTokenizer(texto);
        String token;
        
        while (toker.hasMoreTokens()) {
            token = toker.nextToken();

            if (token.equalsIgnoreCase(getText())) {
                buf.append(decorate(token)).append(" ");
            } else {
                buf.append(token).append(" ");
            }
        }

        return buf.toString();
    }

    private String decorate(String original) {
        return "<span style=\"background:yellow\">" + original + "</span>";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
