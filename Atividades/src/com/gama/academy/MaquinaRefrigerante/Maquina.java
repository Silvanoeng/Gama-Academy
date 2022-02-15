package com.gama.academy.MaquinaRefrigerante;

import java.util.Scanner;

public class Maquina {
    private Itens bebidas[];

    public Maquina(Itens b1, Itens b2, Itens b3, Itens b4, Itens b5) {
        this.bebidas = new Itens[]{b1, b2, b3, b4, b5};
    }

    public void comprar(double dinheiro){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Lista de produtos");

        int produto=0;
        do {
            listar();
            System.out.println();
            System.out.println("Seu saldo é "+dinheiro);
            System.out.println("Digite o codigo do produto ou 6 para finalizar.");
            produto = teclado.nextInt();
            if (produto!=6){
                dinheiro-=selecionar(produto, dinheiro);
            }
        }while (produto!=6);
        if (dinheiro>0){
            System.out.println("Seu troco é "+ dinheiro);
        }
    }

    public void listar(){
        for (int i=0; i<bebidas.length; i++){
            Itens be=bebidas[i];
            if (be.getQuantidade()>0) {
                System.out.println("cod. " + (i + 1) + " Tipo " + be.getNome() + " valor R$ " + be.getPreco());
            }
        }
    }

    public double selecionar(int escolha, double saldo){
        if (bebidas[escolha-1].getPreco()>saldo){
            System.out.println("Saldo insuficiente");
            return 0;
        }else {
            System.out.println("Você compro um "+ bebidas[escolha-1].getNome());
            bebidas[escolha-1].setQuantidade(bebidas[escolha-1].getQuantidade()-1);
            return bebidas[escolha-1].getPreco();
        }
    }
}
