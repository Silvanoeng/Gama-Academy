package com.gama.academy.Conta;

public class ContaBancaria {
    int numero;
    String nome;
    String cpd;
    int tipo;
    double saldo;

    public ContaBancaria(int numero, String nome, String cpd, int tipo, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.cpd = cpd;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome!=null) {
            this.nome = nome;
        }
    }

    public String getCpd() {
        return cpd;
    }

    public void setCpd(String cpd) {
        if (cpd!=null) {
            this.cpd = cpd;
        }
    }

    public String getTipo() {
        if (this.tipo==0){
            return "Conta Corrente.";
        }else if (this.tipo==1){
            return "Conta Poupança.";
        }else if (this.tipo==2){
            return "Conta de Investimento.";
        }else {
            return "Conta Inválida.";
        }
    }

    public void setTipo(int tipo) {
        if (tipo<0 || tipo>2){
            System.out.println("Esse valor não é válido.");
        }else {
            this.tipo = tipo;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo>0){
            this.saldo = saldo;
        }
    }

    public void deposito(double valor){
        if (valor>0){
            this.saldo+=valor;
        }else {
            System.out.println("Esse valor não é válido");
        }
    }

    public boolean saque(double valor){
        if (valor<=this.saldo){
            this.saldo-=valor;
            return true;
        }else {
            return false;
        }
    }


    public void dadosConta() {
        System.out.println("ContaBancaria");
        System.out.printf("> Numero= %d\n> Nome= %s\n> CPF= %s\n> Tipo= %s\n> Saldo= %.2f\n" , numero, nome, cpd, getTipo(), saldo);
    }
}
