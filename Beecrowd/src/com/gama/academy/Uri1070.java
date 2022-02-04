package com.gama.academy;

import java.util.Scanner;

public class Uri1070 {
    public static void main(String[] args) {
        int a;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextInt();
        if (a%2==0){
            a++;
        }
        for (int i=1;i<=6;i++){
            System.out.println(a);
            a+=2;
        }
    }
}
