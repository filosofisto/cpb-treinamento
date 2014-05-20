/*
 * MessagesExistTag.java
 *
 * Created on 12 de Mar�o de 2006, 06:56
 *
 */

package curso.web.tags.logic;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author filosofisto
 */
public class ExistTag extends SimpleTagSupport {
    
    private String id;
    
    @Override
    public void doTag() throws JspException {
        Object object = getJspContext().findAttribute(getId());
            
        if (object != null) {
            JspFragment f = getJspBody();
            
            try {
                f.invoke(getJspContext().getOut());
            } catch (IOException ex) {
                Logger.getLogger(ExistTag.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
