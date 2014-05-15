/*
 * Created on 12/03/2006
 *
 */
package curso.web.tag.iterate;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author filosofisto
 *
 */
public class IterateTag extends SimpleTagSupport {

    private String var;
    private Collection<?> items;
    private Iterator it;

    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        if (items != null) {
            JspFragment f = getJspBody();
            if (f != null) {
                try {
                    for (Object obj: items) {
                        getJspContext().setAttribute(
                                getVar(), 
                                obj, 
                                PageContext.PAGE_SCOPE);
                        
                        f.invoke(out);
                    }
                } catch (IOException e) {
                    throw new JspException(e);
                }
            }
        }
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public Collection<?> getItems() {
        return items;
    }

    public void setItems(Collection<?> items) {
        this.items = items;
    }
}
