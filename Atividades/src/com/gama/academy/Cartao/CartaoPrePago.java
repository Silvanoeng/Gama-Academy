package com.gama.academy.Cartao;

public class CartaoPrePago {
    private String numeroCartao;
    private String nomeTitular;
    private int anoValidade;
    private int mesValidade;
    private double saldo;

    public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.anoValidade = anoValidade;
        this.mesValidade = mesValidade;
        this.saldo = saldo;
    }

    public CartaoPrePago() {
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getAnoValidade() {
        return anoValidade;
    }

    public void setAnoValidade(int anoValidade) {
        this.anoValidade = anoValidade;
    }

    public int getMesValidade() {
        return mesValidade;
    }

    public void setMesValidade(int mesValidade) {
        this.mesValidade = mesValidade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void adicionarCredito(double valor){
        this.saldo+=valor;
        System.out.println("Saldo atualizado: "+this.saldo);
    }

    public boolean comprar(double valor){
        if (valor<=this.saldo){
            this.saldo-=valor;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("\nCartaoPrePago \nnumeroCartao= %s\nnomeTitular= %s\nanoValidade= %d\nmesValidade= %d\nsaldo= %.2f",
                this.numeroCartao, this.nomeTitular, this.anoValidade, this.mesValidade, this.saldo);
    }
}
