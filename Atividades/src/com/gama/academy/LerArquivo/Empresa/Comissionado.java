package com.gama.academy.LerArquivo.Empresa;

public class Comissionado extends Funcionario {
    private float salarioBase;
    private float comissao;

    public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
        super(nome, numeroRegistro);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calcularSalario() {
        float valor = this.salarioBase + this.salarioBase * comissao/100;
        return valor;
    }
}
