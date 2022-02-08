package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        double a, c;
        c=0;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextDouble();
        if (a>2000 && a<=3000){
            c=(a-2000)*.08;
        }else if (a>2000 && a<=4500){
            c=((a-3000)*.18)+80;
        }else if (a>2000 && a>4500){
            c=((a-4500)*.28)+80+270;
        }
        if (c==0){
            System.out.println("Isento");
        }else {
            System.out.printf("R$ %.2f\n",c);
        }
    }
}
