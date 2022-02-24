package com.gama.academy.LerArquivo.Empresa;

public class Empreiteiro extends Funcionario {
    private float valorEmpreitada;

    public Empreiteiro(String nome, int numeroRegistro, float valorEmpreitada) {
        super(nome, numeroRegistro);
        this.valorEmpreitada = valorEmpreitada;
    }

    public float getValorEmpreitada() {
        return valorEmpreitada;
    }

    public void setValorEmpreitada(float valorEmpreitada) {
        this.valorEmpreitada = valorEmpreitada;
    }

    @Override
    public float calcularSalario() {
        return this.valorEmpreitada;
    }
}
