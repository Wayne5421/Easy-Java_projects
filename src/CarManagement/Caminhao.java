package CarManagement;

public class Caminhao extends Veiculo implements Frenavel{

    public Caminhao(String marca, String modelo, int ano, int velocidademaxima) {
        super(marca, modelo, ano, velocidademaxima);
    }

    @Override
    public void exibirInfo() {
        System.out.println(
                "Caminhão da marca: " + get_marca() +
                        ", Modelo: " + get_modelo() +
                        ", Ano: " + get_ano() +
                        ", Velocidade Máxima: " + get_velocidade_maxima());
    }

    @Override
    public void frear() {
        System.out.println(
                "O caminhão freou"
        );
    }
}
