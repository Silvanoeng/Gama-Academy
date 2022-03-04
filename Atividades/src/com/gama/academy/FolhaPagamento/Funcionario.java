package com.gama.academy.FolhaPagamento;

public abstract class Funcionario implements Comparable<Funcionario>{
    private String nome;
    private int numeroRegistro;

    public Funcionario(String nome, int numeroRegistro) {
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public abstract float calcularSalario();

    @Override
    public String toString() {
        return  "Nome:" + nome +
                "\nNumeroRegistro:" + numeroRegistro;
    }

    @Override
    public int compareTo(Funcionario fun) {
        if (this.calcularSalario() < fun.calcularSalario()){
            return 1;
        }else if (this.calcularSalario() > fun.calcularSalario()){
            return -1;
        }
        return 0;

    }
}
