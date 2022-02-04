package com.dh.salario;

import java.util.Scanner;

public class Uri1073 {
    public static void main(String[] args) {
        int a;
        Scanner teclado=new Scanner(System.in);
        a=teclado.nextInt();
        for (int i=2; i<=a;i+=2){
            System.out.printf("%d^%d = %d\n",i,2,(i*i));
        }
    }
}
