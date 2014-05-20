/*
 * SessionAttrListener.java
 *
 * Created on 28 de Fevereiro de 2006, 12:50
 *
 */

package curso.web.listeners;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 *
 * @author hp
 */
public class SessionAttrListener implements HttpSessionAttributeListener {

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        se.getSession().getServletContext().log("O atributo " + se.getName() 
                + " foi atualizado na sessao. O valor anterior era " + se.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        se.getSession().getServletContext().log("O atributo " + se.getName() 
                + " foi removido da sessao. Seu valor era " + se.getValue());
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        se.getSession().getServletContext().log("O atributo " + se.getName() 
                + " foi adicionado na sessao com o valor " + se.getValue());
    }
}
