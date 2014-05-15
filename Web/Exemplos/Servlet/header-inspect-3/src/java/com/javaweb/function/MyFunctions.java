/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.function;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author eduardo
 */
public class MyFunctions {

    public static boolean isFirefox6(HttpServletRequest request) {
        String userAgent = request.getHeader("user-agent");
        
        if (userAgent != null) {
            return userAgent.indexOf("Firefox") > -1;
        }
        
        return false;
    }
}
