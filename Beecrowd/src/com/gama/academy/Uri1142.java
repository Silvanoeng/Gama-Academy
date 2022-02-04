package com.gama.academy;

import java.util.Scanner;

public class Uri1142 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int a, b=0;
        a=teclado.nextInt();
        for (int i=0;i<a;i++){
            System.out.printf("%d %d %d PUM\n", ++b, ++b, ++b);
            b++;
        }
    }
}
