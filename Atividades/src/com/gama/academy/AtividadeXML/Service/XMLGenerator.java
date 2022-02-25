package com.gama.academy.AtividadeXML.Service;

import java.lang.reflect.Field;

public class XMLGenerator {
    public static String generateXML(Object obj){
        StringBuilder str = new StringBuilder();

        str.append("<xml>");

        try {
            for (Field file:obj.getClass().getDeclaredFields()){
                file.setAccessible(true);
                str.append("<" + file.getName() + ">" + file.get(obj) + "</" + file.getName() + ">");
                file.setAccessible(false);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        str.append("<xml>");
        return str.toString();
    }
}
