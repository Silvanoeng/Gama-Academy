package com.gama.academy.Imposto;

public class PessoaFisica extends Contribuinte {
    private String cpf;
    private double rendimentoAnual;
    private int dependentes;

    public PessoaFisica(int numeroCadastral, String nome, String endereco, String cpf, double rendimentoAnual,
                        int dependentes) {
        super(numeroCadastral, nome, endereco);
        this.cpf = cpf;
        this.rendimentoAnual = rendimentoAnual;
        this.dependentes = dependentes;
    }

    @Override
    public double calcularImposto() {
        double base= this.rendimentoAnual - 1770 * this.dependentes;
        double valorDevido;
        if (base<2500){
            valorDevido=0;
        }else if (base<5000){
            valorDevido=base*.15;
        }else if (base<10000){
            valorDevido=base*.2;
        }else {
            valorDevido=base*.275;
        }
        return valorDevido;
    }
}
