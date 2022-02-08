package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1043 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextFloat();
        b=teclado.nextFloat();
        c=teclado.nextFloat();
        if (a+b>c && a+c>b && c+b>a){
            System.out.println("Perimetro = "+ (a+b+c));
        } else {
            System.out.println("Area = "+(((a+b)/2)*c));
        }
        teclado.close();

    }
}
