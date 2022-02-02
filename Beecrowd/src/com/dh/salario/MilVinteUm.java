package com.dh.salario;

import java.util.Scanner;

public class MilVinteUm {
    public static void main(String[] args) {
        double a;
        int b, c, d, e, f, g, h, i, j, k, l, m;
        Scanner teclaro=new Scanner(System.in);
        a=teclaro.nextDouble();
        b=(int)a/100;
        a=a%100;
        c=(int)a/50;
        a=a%50;
        d=(int)a/20;
        a=a%20;
        e=(int)a/10;
        a=a%10;
        f=(int)a/5;
        a=a%5;
        g=(int)a/2;
        a=a%2;
        h=(int)a/1;
        a=(a%1)*100;
        i=(int)a/50;
        a=a%50;
        j=(int)a/25;
        a=a%25;
        k=(int)a/10;
        a=a%10;
        l=(int)a/5;
        a=a%5;
        m=(int)a/1;
        System.out.println("NOTAS:");
        System.out.println(b+" nota(s) de R$ 100.00");
        System.out.println(c+" nota(s) de R$ 50.00");
        System.out.println(d+" nota(s) de R$ 20.00");
        System.out.println(e+" nota(s) de R$ 10.00");
        System.out.println(f+" nota(s) de R$ 5.00");
        System.out.println(g+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(h+" moeda(s) de R$ 1.00");
        System.out.printf("%d moeda(s) de R$ 0.50\n",i);
        System.out.printf("%d moeda(s) de R$ 0.25\n",j);
        System.out.printf("%d moeda(s) de R$ 0.10\n",k);
        System.out.printf("%d moeda(s) de R$ 0.05\n",l);
        System.out.printf("%d moeda(s) de R$ 0.01\n",m);
        teclaro.close();


    }
}
