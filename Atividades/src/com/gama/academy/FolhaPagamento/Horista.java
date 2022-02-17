package com.gama.academy.FolhaPagamento;

public class Horista extends Funcionario{
    private float valorHora;
    private int numeroHoras;

    public Horista(String nome, int numeroRegistro, float valorHora, int numeroHoras) {
        super(nome, numeroRegistro);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public float calcularSalario() {
        float valor=this.valorHora*this.numeroHoras;
        return valor;
    }
}
