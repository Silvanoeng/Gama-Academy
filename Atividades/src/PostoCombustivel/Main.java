package PostoCombustivel;

public class Main {
    public static void main(String[] args) {
        Bomba bomba01 = new Bomba("Gasolina", 7.15);
        Bomba bomba02 = new Bomba("Gasolina Aditivada", 7.55);
        Bomba bomba03 = new Bomba("Álcool", 6.55);

        Posto posto01 = new Posto("Ipiranga", 3);
        posto01.addBomba(bomba01);
        posto01.addBomba(bomba02);
        posto01.addBomba(bomba03);

        posto01.abastecer();


    }
}
