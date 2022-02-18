package com.gama.academy.ExerHeranInter.Core;

import com.gama.academy.ExerHeranInter.Taxes.BemTributavel;

public class Comercial extends Imovel implements BemTributavel {
    private String uso;

    public Comercial(String endereco, double valorVenal, String uso) {
        super(endereco, valorVenal);
        this.uso = uso;
    }

    @Override
    public double calcularImposto() {
        return this.getValorVenal()*.04;
    }

    @Override
    public String toString() {
        return "Imovel\n" +
                "Endereco: " + this.getEndereco()+
                "\nValor venal: " + this.getValorVenal() +
                "\nUso: " + this.uso;
    }
}
