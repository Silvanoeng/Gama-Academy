package com.gama.academy.ExerHeranInter.Core;

import com.gama.academy.ExerHeranInter.Taxes.BemTributavel;

public class Carro extends Veiculo implements BemTributavel {
    private int numeroPortas;
    private int potencia;

    public Carro(String marca, String modelo, int ano, double preco, int numeroPortas, int potencia) {
        super(marca, modelo, ano, preco);
        this.numeroPortas = numeroPortas;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Veiculo\n"+
                "Marca: " + this.getMarca() +
                "\nModelo: " + this.getModelo() +
                "\nAno: " + this.getAno() +
                "\nCategoria: Carro" +
                "\nPotencia: " + this.potencia;

    }

    @Override
    public double calcularImposto() {
        if (this.getAno()>2000){
            return this.getPreco() * 0.04;
        }
        return 0;
    }
}
