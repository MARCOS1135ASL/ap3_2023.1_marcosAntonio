package projeto_ap3_marcosaAntonio.aula3;
// Exercício de cadastro de times de jogadores:
//Crie uma classe chamada Jogador com os seguintes atributos privados: codigo, nome, idade, altura.
//Crie um construtor público na classe Jogador que aceite três valores como 
//parâmetros e inicialize os atributos. O código deve ser randômico até 99999 e deve ser gerenciado pela classe.
//Crie uma classe chamada Time com os atributos privados: nomeTime, jogadores (um ArrayList).
//Crie um construtor público na classe Time que aceite o nome do time como
//parâmetro e inicialize o atributo nomeTime. Inicialize também a lista de jogadores com um tamanho de 11.
//Crie um método público cadastrarJogador na classe Time, que use a classe Scanner 
//para receber informações sobre um jogador (nome, idade e altura) e crie um objeto Jogador. Adicione o jogador ao vetor de jogadores.
//Crie um método público listarJogadores na classe Time, que exiba as
//informações de cada jogador do time, incluindo codigo, nome, idade e altura.
//Crie a classe TestaTime. Use a classe Scanner e permita que o usuário cadastre informações sobre 2 times e seus 11 jogadores.
//Após cadastrar todos os times e jogadores, exiba todas as informações cadastradas.

import java.util.Random;

public class Jogador {
    private int codigo;
    private String nome;
    private int idade;
    private double altura;

    public Jogador(String nome, int idade, double altura) {
        this.codigo = gerarCodigoAleatorio();
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    private int gerarCodigoAleatorio() {
        Random random = new Random();
        return random.nextInt(100000);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
