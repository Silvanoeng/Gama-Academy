package com.gama.academy.Imposto;

public class Main {
    public static void main(String[] args) {
        Contribuinte cont01=new PessoaFisica(154,"Silvano", "Mostardas", "000.000.000-00", 7500.00, 2);
        Contribuinte cont02=new PessoaJuridica(155,"Silvano SA", "Mostardas", "000.000.000-00", 750000.00);

        System.out.printf("O valor devido de imposto é R$ %.2f\n", cont01.calcularImposto());
        System.out.printf("O valor devido de imposto é R$ %.2f\n", cont02.calcularImposto());

    }
}
