package CarManagement;

public class Main {
    public static void main(String[] args) {


        Carro corsa = new Carro("Chevrolet", "Classic", 2012, 150);

        Caminhao scania = new Caminhao("Scania", "Linha XT", 2010, 90);

        corsa.exibirInfo();
        System.out.println();

        scania.exibirInfo();
        System.out.println();

        System.out.println();
        System.out.println();

        corsa.frear();
        System.out.println();

        scania.frear();

    }
}
