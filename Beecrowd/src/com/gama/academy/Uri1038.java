package com.gama.academy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {
        Integer a, b;
        Double total;
        Map<Integer, Double> tabelaPreco = new HashMap<Integer, Double>();
        tabelaPreco.put(1, 4.00);
        tabelaPreco.put(2, 4.50);
        tabelaPreco.put(3, 5.00);
        tabelaPreco.put(4, 2.00);
        tabelaPreco.put(5, 1.50);
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        total= tabelaPreco.get(a)*b;
        System.out.printf("Total: R$ %.2f\n", total);

    }
}
