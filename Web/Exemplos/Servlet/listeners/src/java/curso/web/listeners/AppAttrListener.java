/*
 * AppAttrListener.java
 *
 * Created on 28 de Fevereiro de 2006, 12:14
 *
 */

package curso.web.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 *
 * @author hp
 */
public class AppAttrListener implements ServletContextAttributeListener {

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scab) {
        scab.getServletContext().log(scab.getName() 
                + " foi atualizado no contexto."
                + " Seu valor antigo era "  + scab.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scab) {
        scab.getServletContext().log(scab.getName() 
                + " foi removido do contexto."
                + " Seu valor era de "  + scab.getValue());
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scab) {
        scab.getServletContext().log(scab.getName() 
                + " foi adicionado no contexto com o valor "  + scab.getValue());
    }
}
