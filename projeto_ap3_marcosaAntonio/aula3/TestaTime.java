package projeto_ap3_marcosaAntonio.aula3;

import java.util.Scanner;

public class TestaTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String nomeTime1 = scanner.nextLine();
        Time time1 = new Time(nomeTime1);

        System.out.print("Digite o nome do segundo time: ");
        String nomeTime2 = scanner.nextLine();
        Time time2 = new Time(nomeTime2);

        cadastrarJogadoresNoTime(time1);
        cadastrarJogadoresNoTime(time2);

        System.out.println("\nInformações dos times e jogadores:");
        time1.listarJogadores();
        time2.listarJogadores();

        scanner.close();
    }

    public static void cadastrarJogadoresNoTime(Time time) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 11; i++) {
            System.out.println("Cadastrando jogador #" + (i + 1) + " para o time " + time.getNomeTime());
            time.cadastrarJogador();
        }
    }
}