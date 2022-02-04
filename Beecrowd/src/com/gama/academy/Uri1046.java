package com.gama.academy;

import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner teclaro=new Scanner(System.in);
        a=teclaro.nextInt();
        b=teclaro.nextInt();
        c=0;
        if (b>a){
            c=b-a;
        }else if (a>b)
            c=(b+12)-(a-12);
        if (a==b){
            c=24;
        }
        System.out.println("O JOGO DUROU "+c+" HORA(S)");
        teclaro.close();
    }
}
