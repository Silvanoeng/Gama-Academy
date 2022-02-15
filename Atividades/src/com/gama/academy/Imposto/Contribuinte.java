package com.gama.academy.Imposto;

public class Contribuinte {
    private int numeroCadastral;
    private String nome;
    private String endereco;

    public Contribuinte(int numeroCadastral, String nome, String endereco) {
        this.numeroCadastral = numeroCadastral;
        this.nome = nome;
        this.endereco = endereco;
    }

    public double calcularImposto(){
        return 0;
    }
}
