package Teste01;

import java.util.Scanner;

public class Uri2483 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=teclado.nextInt();
        String frase= "Feliz nat";
        for (int i=0; i<num; i++){
            frase+="a";
        }
        frase+="l!";
        System.out.println(frase);
        teclado.close();
    }
}
