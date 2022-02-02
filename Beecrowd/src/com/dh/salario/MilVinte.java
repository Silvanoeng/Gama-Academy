package com.dh.salario;

import java.util.Scanner;

public class MilVinte {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextInt();
        b=a/365;
        a=a%365;
        c=a/30;
        a=a%30;
        d=a;
        System.out.printf("%d ano(s)\n", b);
        System.out.printf("%d mes(es)\n", c);
        System.out.printf("%d dia(s)\n", d);
        teclado.close();
    }
}
