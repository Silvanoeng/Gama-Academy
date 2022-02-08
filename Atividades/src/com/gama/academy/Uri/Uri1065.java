package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1065 {
    public static void main(String[] args) {
        double a;
        int c=0;
        Scanner teclado=new Scanner(System.in);
        for (int i=0; i<5; i++){
            a=teclado.nextDouble();
            if (a%2==0){
                c++;
            }
        }
        System.out.printf("%d valores pares\n",c);
    }
}
