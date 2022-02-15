package com.gama.academy.ArquivoTeste;

public class Main {
    public static void main(String[] args) {
        Produto mercado[]=new Produto[4];
        mercado[0]=new Produto("teclado", "periferico", 175.50);
        mercado[1]=new Produto("mouse", "periferico", 70.40);
        mercado[2]=new Produto("cadeira", "movel", 750.00);
        mercado[3]=new Produto("monitor", "periferico", 1120.00);

        for (Produto tmp :  mercado){
            if (tmp.getNome().equals("mouse")){
                System.out.println("promoção");
                continue;
            }
            System.out.println(tmp);


        }
    }
}
