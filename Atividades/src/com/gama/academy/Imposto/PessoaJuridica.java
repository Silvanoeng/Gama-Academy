package com.gama.academy.Imposto;

public class PessoaJuridica extends Contribuinte{
    private String cnpj;
    private double faturamento;

    public PessoaJuridica(int numeroCadastral, String nome, String endereco, String cnpj, double faturamento) {
        super(numeroCadastral, nome, endereco);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    @Override
    public double calcularImposto() {
        double base= this.faturamento;
        double valorDevido;
        if (base<100000){
            valorDevido=0;
        }else if (base<250000){
            valorDevido=base*.06;
        }else if (base<450000){
            valorDevido=base*.15;
        }else {
            valorDevido=base*.25;
        }
        return valorDevido;
    }
}
