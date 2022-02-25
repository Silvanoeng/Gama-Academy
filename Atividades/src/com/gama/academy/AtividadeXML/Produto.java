package com.gama.academy.AtividadeXML;

public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private String urlFoto;

    public Produto(int id, String descricao, double preco, String urlFoto) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.urlFoto = urlFoto;
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

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
