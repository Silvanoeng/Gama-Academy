package PostoCombustivel;

import java.util.Scanner;

public class Posto {
    private String nome;
    private Bomba bombas[];

    public Posto(String nome, int num) {
        this.nome = nome;
        this.bombas = new Bomba[num];
    }

    public String getNome() {
        return nome;
    }

    public Bomba[] getBombas() {
        return bombas;
    }

    public void addBomba(Bomba nome){
        for (int i=0; i<bombas.length;i++){
            if (this.bombas[i]==null){
                this.bombas[i]=nome;
                break;
            }
        }

    }

    public void abastecer(){
        Scanner teclado=new Scanner(System.in);
        int menu=0;
        do {
            System.out.println("Bem vindo ao autoatendimento do Posto "+nome);
            System.out.println("Digite o codigo do combustivel que você deseja abastecer:");
            for (int i=0; i<bombas.length; i++){
                System.out.printf("Cod. [ %d ] tipo: %s valor: %.2f\n", i, bombas[i].getNome(), bombas[i].getValorLitro());
            }
            int index=teclado.nextInt();
            System.out.println("Gostaria de abastecer: \n[ 1 ] Quantidade de litros \n[ 2 ] Valor(R$)");
            int formaAbastecimento=teclado.nextInt();
            do {
                if (formaAbastecimento == 1) {
                    System.out.println("Qual o quantidade de litros que deseja abastecer:");
                    double valor = teclado.nextDouble();
                    bombas[index].abastecerLitros(valor);
                    menu=88;
                } else if (formaAbastecimento == 2) {
                    System.out.println("Qual o valor que deseja abastecer:");
                    double valor = teclado.nextDouble();
                    bombas[index].abastecerValor(valor);
                    menu=88;
                }
            }while (menu!=88);
            System.out.println("Deseja realizar outro abastecimento:\n [ 1 ] Sim\n [ 99 ] Não");
            menu=teclado.nextInt();

        }while (menu!=99);
        System.out.println("Muito obrigado pela preferência.");
    }
}
