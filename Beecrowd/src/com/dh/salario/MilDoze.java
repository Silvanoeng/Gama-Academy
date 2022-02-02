package com.dh.salario;

import java.util.Scanner;

public class MilDoze {
    public static void main(String[] args) {
        double a, b, c, resultado;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextDouble();
        b=teclado.nextDouble();
        c=teclado.nextDouble();
        resultado= (a*c)/2;
        System.out.printf("TRIANGULO: %.3f\n", resultado);
        resultado=3.14159*c*c;
        System.out.printf("CIRCULO: %.3f\n",resultado);
        resultado=((a+b)/2)*c;
        System.out.printf("TRAPEZIO: %.3f\n",resultado);
        resultado=b*b;
        System.out.printf("QUADRADO: %.3f\n", resultado);
        resultado=a*b;
        System.out.printf("RETANGULO: %.3f\n",resultado);
        teclado.close();
    }
}
