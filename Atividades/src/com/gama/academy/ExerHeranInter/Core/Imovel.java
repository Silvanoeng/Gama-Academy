package com.gama.academy.ExerHeranInter.Core;

public class Imovel {
    private String endereco;
    private double valorVenal;

    public Imovel(String endereco, double valorVenal) {
        this.endereco = endereco;
        this.valorVenal = valorVenal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }


}
