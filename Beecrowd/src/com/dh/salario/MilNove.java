package com.dh.salario;

import java.util.Scanner;

public class MilNove {
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
