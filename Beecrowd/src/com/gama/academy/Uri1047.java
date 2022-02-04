package com.gama.academy;

import java.util.Scanner;

public class Uri1047 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextInt();
        b=teclado.nextInt();
        c=teclado.nextInt();
        d=teclado.nextInt();
        a=(a*60)+b;
        c=(c*60)+d;
        if (c>a){
            c=c-a;
        }else if (a>c)
            c=(c+720)-(a-720);
        if (a==c){
            c=24*60;
        }
        a=c/60;
        b=c%60;
        System.out.println("O JOGO DUROU "+a+" HORA(S) E "+b+" MINUTO(S)");
        teclado.close();
    }
}


