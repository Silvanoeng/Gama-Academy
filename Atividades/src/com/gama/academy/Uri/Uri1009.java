package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        String nome;
        double salario, vendas, total;
        Scanner teclado = new Scanner(System.in);
        nome=teclado.next();
        salario=teclado.nextDouble();
        vendas=teclado.nextDouble();
        total=(salario+(vendas*0.15));
        System.out.printf("TOTAL = R$ %.2f\n", total);

    }

}
