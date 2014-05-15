/*
 * Messages.java
 *
 * Created on 11 de Mar�o de 2006, 17:26
 *
 */

package curso.web.tags.message;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Messages {

    public static final int INFO_TYPE  = 0;
    public static final int WARN_TYPE  = 1;
    public static final int ERROR_TYPE = 2;
    
    private int type;
    private List messages;
    
    public void addMessages(String message) {
        getMessages().add(message);
    }

    public List getMessages() {
        if (messages == null) {
            setMessages(new ArrayList());
        }
        
        return messages;
    }

    public void setMessages(List messages) {
        this.messages = messages;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public boolean isEmpty() {
        return getMessages().isEmpty();
    }
    
    public int size() {
        return getMessages().size();
    }
}
