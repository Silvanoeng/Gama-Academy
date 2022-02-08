package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        double a;
        String b;
        Scanner teclado= new Scanner(System.in);
        a=teclado.nextDouble();
        if (a>=0 && a<=25){
            System.out.println("Intervalo [0,25]");
        } else {
            if (a>25 && a <= 50) {
                b = "25,50";
            } else if (a>50 && a <= 75) {
                b = "50,75";
            } else if (a>75 && a <= 100) {
                b = "75,100";
            } else {
                b = "101";
            }
            if (b.equals("101")) {
                System.out.println("Fora de intervalo");
            } else {
                System.out.printf("Intervalo (%s]\n", b);
            }
        }
    }
}
