package com.gama.academy.ExeAbsInt;

public class Lula extends Vivo implements Nadar{
    private String tipo;
    private double velMetSeg;

    public Lula(String nome, String dataNasc, String tipo, double velMetSeg) {
        super(nome, dataNasc);
        this.tipo = tipo;
        this.velMetSeg = velMetSeg;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelMetSeg() {
        return velMetSeg;
    }

    public void setVelMetSeg(double velMetSeg) {
        this.velMetSeg = velMetSeg;
    }



    @Override
    public void nomeTipo() {
        System.out.printf("Nome %s, tipo %s.\n", this.getNome(), this.tipo);
    }

    @Override
    public double nadar(double tempo) {
        double dis=tempo*this.velMetSeg;
        return dis;
    }
}
