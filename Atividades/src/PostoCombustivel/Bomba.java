package PostoCombustivel;

public class Bomba {
    private String nome;
    private double valorLitro;

    public Bomba(String nome, double valorLitro) {
        this.nome = nome;
        this.valorLitro = valorLitro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void abastecerLitros(double litros){
        double valorTotal= litros*this.valorLitro;
        System.out.printf("Foram abastecidos %.2f litros, valor a pagar R$ %.2f\n", litros, valorTotal);

    }

    public void abastecerValor(double valor){
        double litros= valor/this.valorLitro;
        System.out.printf("Foram abastecidos %.2f litros, valor a pagar R$ %.2f\n", litros, valor);

    }
}
