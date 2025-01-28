package CarManagement;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;



    public Veiculo(String marca, String modelo, int ano, int velocidademaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidademaxima;
    }


    public abstract void exibirInfo();

    public void acelerar(){
        System.out.println("O veículo está acelerando");
    }


    public String get_marca(){
        return marca;
    }

    public String get_modelo(){
        return modelo;
    }

    public int get_ano(){
        return ano;
    }

    public int get_velocidade_maxima(){
        return velocidadeMaxima;
    }


}
