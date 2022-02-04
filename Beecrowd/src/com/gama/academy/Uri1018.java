package com.dh.salario;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h;
        Scanner teclaro=new Scanner(System.in);
        a=teclaro.nextInt();
        System.out.println(a);
        b=a/100;
        a=a%100;
        c=a/50;
        a=a%50;
        d=a/20;
        a=a%20;
        e=a/10;
        a=a%10;
        f=a/5;
        a=a%5;
        g=a/2;
        a=a%2;
        h=a/1;
        System.out.println(b+" nota(s) de R$ 100,00");
        System.out.println(c+" nota(s) de R$ 50,00");
        System.out.println(d+" nota(s) de R$ 20,00");
        System.out.println(e+" nota(s) de R$ 10,00");
        System.out.println(f+" nota(s) de R$ 5,00");
        System.out.println(g+" nota(s) de R$ 2,00");
        System.out.println(h+" nota(s) de R$ 1,00");

    }
}
