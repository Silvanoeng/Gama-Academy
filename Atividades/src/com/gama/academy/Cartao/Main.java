package com.gama.academy.Cartao;

public class Main {
    public static void main(String[] args) {
        CartaoPrePago cartao01 = new CartaoPrePago("123456", "Isidro A. S.", 2029, 01, 2000.00);

        cartao01.adicionarCredito(555.55);
        if (cartao01.comprar(1000.00)){
            System.out.println("Compra realizada.");
            System.out.printf("Saldo: %.2f\n",cartao01.getSaldo());
        }else {
            System.out.println("Não foi possivel efetuar a compra.");
        }
        System.out.println(cartao01);
    }
}
