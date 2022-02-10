package com.gama.academy.StringPalindromo;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escreva uma palavra, vamos verificar se ela é palíndromo ou não:");
            String palavra = sc.next();
            int t= palavra.length();
            for (int i=0; i<t/2; i++){
                if (palavra.charAt(i)!= palavra.charAt(t-1-i)){
                    System.out.println("Não é palíndromo.");
                    break;
                }else if (i==t/2 -1){
                    System.out.println("É palíndromo.");
                }
            }
        }
}
