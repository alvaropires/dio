package one.digitalInnovation.com.herancas;

public class Herancas {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        System.out.println(veiculo.toString());
        Carro carro = new Carro("VW","azul", 2020, 4, "voyage");
        System.out.println(carro.toString());

    }
}

class Veiculo {
    private String marca;
    private String cor;
    private String ano;

    public Veiculo(){

    }
    public Veiculo(String marca, String cor, String ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}

class Carro extends Veiculo{
    private Integer numeroPortas;
    private String modelo;

    public Carro(String vw, String azul, int i, int numeroPortas, String voyage){

    }

    public Carro(String marca, String cor, String ano, Integer numeroPortas, String modelo) {
        super(marca, cor, ano);
        this.numeroPortas = numeroPortas;
        this.modelo = modelo;
    }

}

class Motocicleta extends Veiculo{
    private Integer cilindradas;
    private Integer velocidadeMaxima;

    public Motocicleta(String marca, String cor, String ano, Integer cilindradas, Integer velocidadeMaxima) {
        super(marca, cor, ano);
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }
}

class Caminhao extends Veiculo{
    private Integer capacidadeCarga;
    private Integer numeroDeEixos;

    public Caminhao(String marca, String cor, String ano, Integer capacidadeCarga, Integer numeroDeEixos) {
        super(marca, cor, ano);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroDeEixos = numeroDeEixos;
    }
}

