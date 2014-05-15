/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.web.tag.conditional;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author filosofisto
 */
public class FalseTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException {
        try {
            JspWriter out = getJspContext().getOut();
            IfTag parent = (IfTag) getParent();
            
            if (!parent.isCondition()) {
                JspFragment f = getJspBody();
                if (f != null) {
                    f.invoke(out);
                }
            }
        } catch (IOException e) {
            throw new JspException("Error in FalseTag tag", e);
        }
    }
}
