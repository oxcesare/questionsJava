/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ws.rs.cliente;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Sandra
 */
public class ServletUtil {
    
    static void printParameters(HttpServletRequest request) {
        Map<String,String[]> parameters = request.getParameterMap();
        for (Map.Entry<String, String[]> entrySet : parameters.entrySet()) {
            String key = entrySet.getKey();
            String[] values = entrySet.getValue();
            System.out.print(key+" ");
            for (String value : values) {
                System.out.print(value+" ");
            }
            System.out.println("");
        }
    }
    
}
