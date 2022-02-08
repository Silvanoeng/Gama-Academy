package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        double a,b;
        int c;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextDouble();
        if (a<=400){
            c=15;
        }else if (a<=800){
            c=12;
        }else if (a<=1200){
            c=10;
        }else if (a<=2000){
            c=7;
        }else {
            c=4;
        }
        b=(a*c)/100;
        System.out.printf("Novo salario: %.2f\n",(a+b));
        System.out.printf("Reajuste ganho: %.2f\n",b);
        System.out.println("Em percentual: "+c+" %");
    }
}
