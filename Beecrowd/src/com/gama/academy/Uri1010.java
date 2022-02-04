package com.gama.academy;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        int peca1, peca2, num1, num2;
        double valor1, valor2, total;
        Scanner teclado =new Scanner(System.in);
        peca1=teclado.nextInt();
        num1=teclado.nextInt();
        valor1=teclado.nextDouble();
        peca2=teclado.nextInt();
        num2=teclado.nextInt();
        valor2=teclado.nextDouble();
        total=num1*valor1+num2*valor2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        teclado.close();
    }
}
