/*
 * ObjectBinding.java
 *
 * Created on 1 de Marco de 2006, 08:39
 *
 */

package curso.web.listeners;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 *
 * @author hp
 */
public class ObjectBinding implements HttpSessionBindingListener {

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        event.getSession().getServletContext().log("Fui adicionado na sessao");
    }
    
    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        event.getSession().getServletContext().log("Fui removido da sessao");
    }
}
