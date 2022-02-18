package com.gama.academy.ExerHeranInter.Core;

public class Rural extends Imovel{
    private String tipo;

    public Rural(String endereco, double valorVenal, String tipo) {
        super(endereco, valorVenal);
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Imovel\n" +
                "Endereco: " + this.getEndereco()+
                "\nValor venal: " + this.getValorVenal() +
                "\nTipo: " + this.tipo;
    }
}
