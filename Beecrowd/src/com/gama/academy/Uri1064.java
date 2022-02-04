package com.gama.academy;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        double a, b=0;
        int c=0;
        Scanner teclado=new Scanner(System.in);
        for (int i=0; i<6; i++){
            a=teclado.nextDouble();
            if (a>0){
                c++;
                b+=a;
            }
        }
        System.out.printf("%d valores positivos\n",c);
        System.out.printf("%.1f\n",b/c);
    }
}
