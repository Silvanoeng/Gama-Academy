package com.dh.salario;

import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        double A, B, MEDIA;
        Scanner teclado = new Scanner(System.in);
        A= teclado.nextDouble();
        B= teclado.nextDouble();
        MEDIA= (A*3.5+B*7.5)/11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        teclado.close();

    }
}
