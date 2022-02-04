package com.gama.academy;

import java.util.Scanner;

public class Uri1041 {
    public static void main(String[] args) {
        double a, b;
        Scanner teclado = new Scanner(System.in);
        a=teclado.nextDouble();
        b=teclado.nextDouble();
        if (a>0 && b>0){
            System.out.println("Q1");
        }else if (a>0 && b<0){
            System.out.println("Q4");
        }else if (a<0 && b>0){
            System.out.println("Q2");
        }else if (a<0 && b<0){
            System.out.println("Q3");
        }else if (a==0 && b==0){
            System.out.println("Origem");
        }else if (a==0){
            System.out.println("Eixo Y");
        }else if (b==0){
            System.out.println("Eixo X");
        }
        teclado.close();

    }
}
