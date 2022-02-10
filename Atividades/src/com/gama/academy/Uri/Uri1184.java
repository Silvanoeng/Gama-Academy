package com.gama.academy.Uri;

import java.util.Scanner;

public class Uri1184 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String op= teclado.next();
        double[][] matriz  = new double[12][12];
        double soma=0.0, media;
        int cont=0;
        for (int i=0; i<12; i++){
            for (int l=0; l<12; l++){
                matriz[i][l]=teclado.nextDouble();
                if (i<l){
                    soma+=matriz[i][l];
                    cont++;
                }
            }
        }
        media= soma/cont;
        if (op.equals("S")){
            System.out.printf("%.1f\n",soma);
        }else if (op.equals("M")){
            System.out.printf("%.1f\n",media);
        }
    }
}
