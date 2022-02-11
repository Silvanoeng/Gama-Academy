package MaquinaRefrigerante;

public class Main {
    public static void main(String[] args) {
        Itens item1 = new Itens("Coca 600ml", 4.50, 1);
        Itens item2 = new Itens("Fanta 600ml", 4.30, 12);
        Itens item3 = new Itens("Guarana 600ml", 4.50, 10);
        Itens item4 = new Itens("Água 600ml", 2.50, 8);
        Itens item5 = new Itens("Chá gelado 500ml", 3.50, 12);

        Maquina maqui1 = new Maquina(item1, item2, item3, item4, item5);

        maqui1.comprar(15.00);
    }
}
