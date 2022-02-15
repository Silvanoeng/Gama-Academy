package com.gama.academy.Teste01;

import java.util.Scanner;

public class Uri1159 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int digito=0;
        do {
            digito=teclado.nextInt();
            int soma=0;
            if (digito!=0) {
                if (digito % 2 == 0) {
                    for (int i = 0; i < 5; i++) {
                        soma = soma +digito;
                        digito=digito+2;
                    }
                    System.out.println(soma);
                } else {
                    digito++;
                    for (int i = 0; i < 5; i++) {
                        soma = soma +digito;
                        digito=digito+2;
                    }
                    System.out.println(soma);
                }
            }
        }while (digito!=0);
        teclado.close();
    }
}
