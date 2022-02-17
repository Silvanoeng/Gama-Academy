package com.gama.academy.FolhaPagamento;

public class Main {
    public static void main(String[] args) {
        Funcionario lista[] = new Funcionario[4];

        lista[0] = new Chefe("Silvano", 123, 5124.30f, 250.50f, 12.40f);
        lista[1] = new Comissionado("Sandro", 456, 4654.45f, 45.50f);
        lista[2] = new Horista("Sandy", 789, 51.30f, 250);
        lista[3] = new Empreiteiro("Sibele", 963, 50124.30f);


        for (Funcionario f:lista){
            System.out.println(f);
            System.out.printf("O valor a receber é R$ %.2f.\n", f.calcularSalario());
        }
    }
}
