package com.gama.academy.Lista;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> estoque=new ArrayList<>();
        estoque.add(new Produto(01, "Monitor de 27", 1450.00, 45));
        estoque.add(new Produto(02, "Notebook i7", 2450.00, 15));
        estoque.add(new Produto(03, "Mesa para escritório", 450.00, 55));
        estoque.add(new Produto(04, "Headset Redragon", 369.90, 40));
        estoque.add(new Produto(05, "Teclado", 150.00, 5));
        Produto maiorValor=null;
        Produto menorValor=null;
        double valorTotal=0;

        for (Produto p:estoque){
            valorTotal+=p.valorEstoque();
            if (maiorValor==null){
                maiorValor=p;
            }else  if (p.getPreco()>maiorValor.getPreco()){
                maiorValor=p;
            }
            if (menorValor==null){
                menorValor=p;
            }else if (p.getPreco()<menorValor.getPreco()){
                menorValor=p;
            }

        }
        System.out.println("O produto de maior valor:");
        System.out.println(maiorValor);
        System.out.println();
        System.out.println("O produto de menor valor:");
        System.out.println(menorValor);
        System.out.println();
        System.out.printf("O valor total em estoque é de R$ %.2f.",valorTotal);


    }
}
