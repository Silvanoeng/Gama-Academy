package com.gama.academy.Lista;

public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private int qtdEstoque;

    public Produto(int id, String descricao, double preco, int qtdEstoque) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double valorEstoque(){
        double valor=this.preco*this.qtdEstoque;
        return valor;
    }

    @Override
    public String toString() {
        return "Produto:\n" +
                "Id: " + id +
                "\nDescricao: " + descricao +
                "\nPreco: " + preco +
                "\nQuantidade em Estoque: " + qtdEstoque;
    }
}
