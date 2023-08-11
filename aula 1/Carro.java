package Carro;
 public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public boolean ehSemiNovo() {
        return java.time.Year.now().getValue() - ano <= 3;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", semi-novo=" + (ehSemiNovo() ? "Sim" : "Não") + "]";
    }
}
