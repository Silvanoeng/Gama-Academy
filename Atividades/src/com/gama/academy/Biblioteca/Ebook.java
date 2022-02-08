package com.gama.academy.Biblioteca;

public class Ebook {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private int zoom;

    public Ebook(String titulo, String autor, int totalPaginas, int paginaAtual, int zoom) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
        this.zoom = zoom;
    }

    public Ebook() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public void avancarPagina(){
        if (this.paginaAtual<this.totalPaginas){
            System.out.println("Passando da página "+ this.paginaAtual + ", para a página "+ ++this.paginaAtual);
        }else {
            System.out.println("Este livro terminou.");
        }
    }

    public void retrocederPagina(){
        if (this.paginaAtual>1){
            System.out.println("Passando da página "+ this.paginaAtual + ", para a página "+ --this.paginaAtual);
        }else {
            System.out.println("Você já está na primeira página.");
        }

    }
    public void irParaPagina(int pagina){
        if (pagina<=this.totalPaginas){
            System.out.println("Passando da página "+ this.paginaAtual + ", para a página "+ pagina);
            this.paginaAtual=pagina;
        }
    }
    public void exibirPagina(){
        System.out.println("\nPagina "+ this.paginaAtual);
        System.out.println("Livro "+ this.titulo);
        System.out.println("Autor "+ this.autor);
    }

    public void mostrarCapa(){
        System.out.println("\n----Capa----");
        System.out.println("Livro "+ this.titulo);
        System.out.println("Autor "+ this.autor);
        System.out.println("Total de paginas "+ this.totalPaginas);
    }



}
