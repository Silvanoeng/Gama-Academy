package com.gama.academy.AtividadeXML.Service;

import com.gama.academy.AtividadeXML.Produto;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Object obj;
        Produto monitor= new Produto(01, "Monitor de 29 polegadas.", 1342.50, "https://m.media-amazon.com/images/I/71YU6HxxEwS._AC_SL1500_.jpg");
        obj=monitor;
        System.out.println("O nome da classe é " + obj.getClass().getSimpleName());
        System.out.println("Antes do reflection.");
        System.out.println(monitor);

        try {
            Field[] atributos= obj.getClass().getDeclaredFields();

            for (Field atri : atributos) {
                atri.setAccessible(true);
                System.out.println("Atributo:\n"+atri.getName());
                System.out.println("Descrição:\n"+atri.get(obj));
                atri.setAccessible(false);
            }

            Field desc = obj.getClass().getDeclaredField("descricao");

            System.out.println("Editar a descrição.");
            desc.setAccessible(true);
            desc.set(obj, "Monitor 27 Polegadas.");
            System.out.println(desc.get(obj));
            desc.setAccessible(false);

        }
        catch (Exception ex){
            System.err.println("Algo errado " + ex);
            ex.printStackTrace();
        }
    }
}
