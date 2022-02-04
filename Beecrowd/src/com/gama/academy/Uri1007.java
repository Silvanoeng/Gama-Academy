package com.dh.salario;

import java.util.Scanner;

public class Uri1007 {
    public static void main(String[] args) {
        int a, b, c, d, resultado;
        Scanner teclado = new Scanner(System.in);
        a=teclado.nextInt();
        b=teclado.nextInt();
        c=teclado.nextInt();
        d=teclado.nextInt();
        resultado= (a*b-c*d);
        System.out.println("DIFERENCA = "+ resultado);
        teclado.close();
    }
}
