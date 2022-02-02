package com.dh.salario;

import java.util.Scanner;

public class MilDezessete {
    public static void main(String[] args) {
        int a, b;
        double c, d;
        Scanner teclado= new Scanner(System.in);
        a=teclado.nextInt();
        b=teclado.nextInt();
        c=a*b;
        d=c/12;
        System.out.printf("%.3f\n",d);
        teclado.close();

    }
}
