package com.gama.academy.Teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            String texto="Testando o github no Mac";
            for (int l=0;l<i;l++){
                System.out.printf(" ");
            }
            System.out.printf("%-30s\n", texto);
        }

        List<Character> letras= Arrays.asList('a', 'x', 'b', 'm', 'c', 'e', 'z');

        letras.stream().sorted().forEach(e -> System.out.println(e));

    }
}
