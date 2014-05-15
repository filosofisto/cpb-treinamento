/*
 * MessageBodyTag.java
 *
 *
 */
package curso.web.tags.message;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author filosofisto
 */
public class MessageBodyTag extends TagSupport {

    private String id;
    private Messages messages;
    private int index;

    public int doStartTag() throws JspException {
        Object object = pageContext.findAttribute(Constants.ATTR_NAME);

        if (object != null && object instanceof Messages) {
            messages = (Messages) object;

            //Coloca a primeira mensagem no scopo de page
            index = 0;
            putNextMessage();

            return EVAL_BODY_INCLUDE;
        }

        return SKIP_BODY;
    }

    public int doAfterBody() throws JspException {
        if (++index >= messages.size()) {
            return SKIP_BODY;
        } else {
            putNextMessage();

            return EVAL_BODY_AGAIN;
        }

    }

    public void putNextMessage() {
        pageContext.setAttribute(getId(), messages.getMessages().get(index),
                PageContext.PAGE_SCOPE);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void release() {
        setId(null);

        super.release();
    }
}
