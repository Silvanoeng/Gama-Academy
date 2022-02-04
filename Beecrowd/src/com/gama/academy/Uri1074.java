package com.gama.academy;

import java.util.Scanner;

public class Uri1074 {
    public static void main(String[] args) {
        int a, b;
        Scanner teclado = new Scanner(System.in);
        a=teclado.nextInt();
        for (int i=0;i<a;i++){
            b=teclado.nextInt();
            if (b>0){
                if (b%2==0){
                    System.out.println("EVEN POSITIVE");
                }else if (b%2!=0){
                    System.out.println("ODD POSITIVE");
                }
            }else if (b<0){
                if (b%2==0){
                    System.out.println("EVEN NEGATIVE");
                }else if (b%2!=0){
                    System.out.println("ODD NEGATIVE");
                }
            }else {
                System.out.println("NULL");
            }

        }
        teclado.close();
    }
}
