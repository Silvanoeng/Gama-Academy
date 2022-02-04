package com.gama.academy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri1050 {
    public static void main(String[] args) {
        Map<Integer, String> ddd = new HashMap<Integer, String>();
        ddd.put(61, "Brasilia");
        ddd.put(71, "Salvador");
        ddd.put(11, "Sao Paulo");
        ddd.put(21, "Rio de Janeiro");
        ddd.put(32, "Juiz de Fora");
        ddd.put(19, "Campinas");
        ddd.put(27, "Vitoria");
        ddd.put(31, "Belo Horizonte");
        int a;
        String b;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextInt();
        b=ddd.get(a);
        if (b!=null){
            System.out.println(b);
        }else {
            System.out.println("DDD nao cadastrado");
        }

        teclado.close();
    }
}
