package com.gama.academy.Conta;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria(1456, "Silvano Araujo Pereira", "000.000.000-00", 1, 1500.10);
        conta01.dadosConta();
        conta01.deposito(450.40);
        System.out.println("Saldo= " + conta01.getSaldo());
        System.out.println(conta01.saque(1000.50));
        System.out.println("Saldo= " + conta01.getSaldo());
        System.out.println(conta01.saque(2000.00));
        System.out.println("Saldo= " + conta01.getSaldo());

    }
}
