package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1134 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int a=0, alcool=0, gasolina=0, diesel=0, sair=0;
        do {
            a=teclado.nextInt();
            if (a == 1) {
                alcool++;
            } else if (a == 2) {
                gasolina++;
            } else if (a == 3) {
                diesel++;
            } else if (a == 4) {
                sair++;
            }
        }while (sair==0);
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);

    }
}
