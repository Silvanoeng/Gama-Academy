package com.gama.academy;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        int a=0, b=0, c=0, d=0, e=0;
        Scanner teclado=new Scanner(System.in);
        for (int i=0; i<5; i++){
            a=teclado.nextInt();
            if (a%2==0){
                b++;
            }else if (a%2!=0){
                c++;
            }
            if (a>0){
                d++;
            }else if (a<0){
                e++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)", b,c,d,e);
    }
}
