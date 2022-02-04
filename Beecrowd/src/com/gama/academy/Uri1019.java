package com.gama.academy;

import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextInt();
        b=a/3600;
        a=a%3600;
        c=a/60;
        d=a%60;
        System.out.printf("%d:%d:%d\n", b, c, d);
        teclado.close();
    }
}
