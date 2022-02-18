package com.gama.academy.ExerHeranInter.Core;

import com.gama.academy.ExerHeranInter.Taxes.BemTributavel;

public class Residencial extends Imovel implements BemTributavel {
    private double metragem;

    public Residencial(String endereco, double valorVenal, double metragem) {
        super(endereco, valorVenal);
        this.metragem = metragem;
    }



    @Override
    public double calcularImposto() {
        if (this.metragem>100){
            return this.getValorVenal()*.03;
        }
        return this.getValorVenal()*.015;
    }

    @Override
    public String toString() {
        return "Imovel\n" +
                "Endereco: " + this.getEndereco()+
                "\nValor venal: " + this.getValorVenal() +
                "\nMetragem: " + this.metragem;
    }
}
