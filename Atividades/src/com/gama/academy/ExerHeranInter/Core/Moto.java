package com.gama.academy.ExerHeranInter.Core;

import com.gama.academy.ExerHeranInter.Taxes.BemTributavel;

public class Moto extends Veiculo implements BemTributavel {
    private int cilindradas;
    private String tipo;

    public Moto(String marca, String modelo, int ano, double preco, int cilindradas, String tipo) {
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Veiculo\n"+
                "Marca: " + this.getMarca() +
                "\nModelo: " + this.getModelo() +
                "\nAno: " + this.getAno() +
                "\nCategoria: Moto" +
                "\nTipo: " + this.tipo +
                "\nCelindradas: " + this.cilindradas;

    }

    @Override
    public double calcularImposto() {
        if (this.cilindradas>500){
            return this.getPreco()*0.05;
        }
        return this.getPreco()*0.025;
    }
}
