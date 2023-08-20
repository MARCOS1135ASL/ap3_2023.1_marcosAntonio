package projeto_ap3_marcosaAntonio.aula3;
//agoras iremos adicionar aclasse time 

import java.util.ArrayList;
import java.util.Scanner;

public class Time {
    private String nomeTime;
    private ArrayList<Jogador> jogadores;
    public Time(String nomeTime) {
        this.nomeTime = nomeTime;
        this.jogadores = new ArrayList<>(11);
    }
    public void cadastrarJogador() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do jogador: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do jogador: ");
        int idade = scanner.nextInt();

        System.out.print("Altura do jogador: ");
        double altura = scanner.nextDouble();

        Jogador jogador = new Jogador(nome, idade, altura);
        jogadores.add(jogador);

        System.out.println("Jogador cadastrado com sucesso!\n");

        scanner.nextLine(); // Limpar o buffer

        public void listarJogadores() {
            System.out.println("Jogadores do time " + nomeTime + ":");
            for (Jogador jogador : jogadores) {
                System.out.println("Código: " + jogador.getCodigo() + ", Nome: " + jogador.getNome() +
                                   ", Idade: " + jogador.getIdade() + ", Altura: " + jogador.getAltura());
            }
        }
    }
}
