package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1143 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int a, b=1;
        a=teclado.nextInt();
        for (int i=0;i<a;i++){
            System.out.printf("%d %d %d\n", b, b*b, b*b*b);
            b++;
        }
    }
}
