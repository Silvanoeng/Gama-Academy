package com.gama.academy.Teste01;

import java.util.Scanner;

public class Uri1174 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vetor[] = new double[100];
        for (int i=0; i<100; i++){
            vetor[i]=teclado.nextDouble();
        }
        for (int i=0; i<100; i++){
            if (vetor[i]<=10.00){
                System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
            }
        }
    }
}
