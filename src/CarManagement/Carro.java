package CarManagement;

public class Carro extends Veiculo implements Frenavel{


    public Carro(String marca, String modelo, int ano, int velocidademaxima) {
        super(marca, modelo, ano, velocidademaxima);
    }

    @Override
    public void frear(){
        System.out.println("O carro está freando");
    }


    @Override
    public void exibirInfo(){
        System.out.println("Carro da Marca: " + get_marca()
                + ", Modelo: " + get_modelo()
                + ", Ano: " + get_ano()
                + ", Velocidade Máxima: " + get_velocidade_maxima());
    }

}
