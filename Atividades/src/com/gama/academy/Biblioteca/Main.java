package com.gama.academy.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Ebook livro01 = new Ebook("Você não é tão esperto quanto pensa", "David Mcraney", 252, 0, 100);
        livro01.avancarPagina();
        livro01.irParaPagina(100);
        livro01.avancarPagina();
        livro01.retrocederPagina();
        livro01.exibirPagina();
        livro01.mostrarCapa();
    }
}
