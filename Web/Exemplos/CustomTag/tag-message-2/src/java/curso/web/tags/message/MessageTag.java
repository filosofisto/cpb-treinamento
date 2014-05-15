/*
 * MessageTag.java
 *
 */
package curso.web.tags.message;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author filosofisto
 */
public class MessageTag extends SimpleTagSupport {

    private String styleInfo;
    private String styleWarn;
    private String styleError;
    private String jsRenderer;

    @Override
    public void doTag() throws JspException {
        try {
            Object object = getJspContext().findAttribute(Constants.ATTR_NAME);

            if (object != null && object instanceof Messages) {
                Messages messages = (Messages) object;

                JspWriter out = getJspContext().getOut();
                String style = getStyle(messages);

                getMessageRenderer().render(out, messages, style);
            }
        } catch (IOException e) {
            throw new JspException(e);
        }
    }

    private MessageRenderer getMessageRenderer() {
        if (getJsRenderer() == null || "false".equals(getJsRenderer())) {
            return new MessageRendererDefault();
        } else if ("true".equals(getJsRenderer())) {
            return new MessageRendererAlert();
        } else {
            return null;
        }
    }

    private String getStyle(Messages messages) {
        if (messages.getType() == Messages.INFO_TYPE) {
            return getStyleInfo();
        } else if (messages.getType() == Messages.WARN_TYPE) {
            return getStyleWarn();
        } else if (messages.getType() == Messages.ERROR_TYPE) {
            return getStyleError();
        } else {
            return null;
        }
    }

    public String getStyleInfo() {
        return styleInfo;
    }

    public void setStyleInfo(String styleInfo) {
        this.styleInfo = styleInfo;
    }

    public String getStyleWarn() {
        return styleWarn;
    }

    public void setStyleWarn(String styleWarn) {
        this.styleWarn = styleWarn;
    }

    public String getStyleError() {
        return styleError;
    }

    public void setStyleError(String styleError) {
        this.styleError = styleError;
    }

    public String getJsRenderer() {
        return jsRenderer;
    }

    public void setJsRenderer(String jsRenderer) {
        this.jsRenderer = jsRenderer;
    }
}
