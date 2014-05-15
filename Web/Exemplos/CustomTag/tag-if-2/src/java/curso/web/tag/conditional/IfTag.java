/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.web.tag.conditional;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author filosofisto
 */
public class IfTag extends SimpleTagSupport {
    
    private boolean condition;

    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();

        try {
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }
        } catch (java.io.IOException ex) {
            throw new JspException("Error in IfTag tag", ex);
        }
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
    
    public boolean isCondition() {
        return condition;
    }
}
