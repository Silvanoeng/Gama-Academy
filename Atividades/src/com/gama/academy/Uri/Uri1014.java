package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        int dis;
        double comb, media;
        Scanner teclado=new Scanner(System.in);
        dis=teclado.nextInt();
        comb=teclado.nextDouble();
        media=dis/comb;
        System.out.printf("%.3f km/l\n", media);
        teclado.close();
    }
}
