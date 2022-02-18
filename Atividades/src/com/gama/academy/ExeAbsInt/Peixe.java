package com.gama.academy.ExeAbsInt;

public class Peixe extends Vivo{
    private String tipo;
    private double velMetSeg;


    public Peixe(String nome, String dataNasc, String tipo, double velMetSeg) {
        super(nome, dataNasc);
        this.tipo = tipo;
        this.velMetSeg = velMetSeg;
    }


    @Override
    public void nomeTipo() {
        System.out.printf("Nome %s, tipo %s.\n", this.getNome(), this.tipo);
    }
}
