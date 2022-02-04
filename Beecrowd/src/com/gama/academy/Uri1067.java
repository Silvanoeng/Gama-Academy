package com.gama.academy;

import java.util.Scanner;

public class Uri1067 {
    public static void main(String[] args) {
        int a;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextInt();
        for (int i=1; i<=a; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
