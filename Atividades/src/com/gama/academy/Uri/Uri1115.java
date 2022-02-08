package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1115 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        do {
            a=teclado.nextInt();
            b=teclado.nextInt();
            if (a>0 && b>0){
                System.out.println("primeiro");
            }else if (a>0 && b<0){
                System.out.println("quarto");
            }else if (a<0 && b>0){
                System.out.println("segundo");
            }else if (a<0 && b<0) {
                System.out.println("terceiro");
            }
        }while ( b*a!=0 );
        teclado.close();
    }
}
