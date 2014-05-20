/*
 * UserSessionListener.java
 *
 * Created on 28 de Fevereiro de 2006, 12:36
 *
 */

package curso.web.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author hp
 */
public class SessionListener implements HttpSessionListener {
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().getServletContext().log("A sessao foi construida");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        se.getSession().getServletContext().log("A sessao foi destruida");
    }
}
