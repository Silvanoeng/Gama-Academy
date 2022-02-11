package Teste01;

import java.util.Scanner;

public class Uri2780 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dis = teclado.nextInt();
        if (dis<=800){
            System.out.println(1);
        }else if (dis<=1400){
            System.out.println(2);
        }else {
            System.out.println(3);
        }
    }
}
