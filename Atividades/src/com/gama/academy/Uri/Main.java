package com.gama.academy.Uri;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        while (n < 10) {
            n++;
            if (n==5){
                System.out.println("5" + n);
                continue;
            }
            System.out.println("O numero = "+n);
        }
    }
}
