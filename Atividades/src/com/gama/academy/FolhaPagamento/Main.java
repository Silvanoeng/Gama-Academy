package com.gama.academy.FolhaPagamento;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> lista = Arrays.asList(new Chefe("Silvano", 123, 5124.30f, 250.50f, 12.40f),
                                            new Comissionado("Sandro", 456, 4654.45f, 45.50f),
                                            new Horista("Sandy", 789, 51.30f, 250),
                                            new Empreiteiro("Sibele", 963, 50124.30f));


        /*for (Funcionario f:lista){
            System.out.println(f);
            System.out.printf("O valor a receber é R$ %.2f.\n", f.calcularSalario());
        }*/
        System.out.println("Listagem de funcionários em ordem de salário");
        lista.stream().sorted().forEach(e-> System.out.printf( "%s recebe\tR$ %.2f.\n", e.getNome() , e.calcularSalario()));
        System.out.println();
        System.out.println("Listagem de funcionários em ordem alfabética");
        lista.stream().sorted(Comparator.comparing(p->p.getNome()))
                        .forEach(e-> System.out.printf( "%s\t", e.getNome()));

        System.out.println("\n");
        System.out.println("Listagem de funcionários em ordem de cadastro");
        lista.stream().sorted(Comparator.comparing(p->p.getNumeroRegistro()))
                .forEach(e-> System.out.printf( "%s\t", e.getNome()));

    }
}
