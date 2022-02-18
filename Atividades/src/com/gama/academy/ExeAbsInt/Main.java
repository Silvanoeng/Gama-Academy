package com.gama.academy.ExeAbsInt;

public class Main {
    public static void main(String[] args) {
        Vivo teste01=new Peixe("Isa", "21/12/2011", "Peixe", 2);

        teste01.nomeTipo();
        System.out.println(teste01.getNome());

        Lula teste02=new Lula("Nai", "25/01/1986", "Lula", 1);
        teste02.nomeTipo();
        System.out.println(teste02.nadar(12.50));


    }
}
