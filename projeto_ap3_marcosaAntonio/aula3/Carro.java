package projeto_ap3_marcosaAntonio.aula3;
//
//Exercício de cadastro de carros:

//Exercício de cadastro de carros:
//Crie uma classe chamada Carro com os seguintes
//atributos privados: marca, modelo e ano.
//Crie um construtor com os três atributos, crie os métodos get e set para cada atributo.
//Crie a Classe TestaCarro. Utilize a classe Scanner para receber entradas do usuário e criar 
//objetos Carro com base nas informações fornecidas. Faça o cadastro de 4 carros, armazenando em um ArrayList.


public class Carro {
    private String nome;
    private String modelo;
    private int ano;

    public Carro(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
