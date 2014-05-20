/*
 * NumericUtil.java
 *
 * Created on 11 de Mar�o de 2006, 18:07
 *
 */

package curso.web.util;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 * @author filosofisto
 */
public final class NumericUtil {
    
    public static boolean isNumeric(String value) {
        try {
            NumberFormat.getInstance().parse(value);
            
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
