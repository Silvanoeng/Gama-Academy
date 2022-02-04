package com.dh.salario;

import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        int a, b;
        double hora, salario;
        Scanner escrever= new Scanner(System.in);
        a=escrever.nextInt();
        b=escrever.nextInt();
        hora=escrever.nextDouble();
        salario= b*hora;
        System.out.println("NUMBER = "+ a);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        escrever.close();

    }
}
