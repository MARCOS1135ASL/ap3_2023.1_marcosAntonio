package projeto_ap3_marcosaAntonio.aula3;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class TestaTime {
    private static final String Scanner = null;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in );

        System.out.print("Digite o nome do primeiro time: ");
        String nomeTime1 = scanner.nextLine();
        Time time1 = new Time(nomeTime1);

        System.out.println("digite o nome segundo time:");
        String nomeTime2 = scanner.nextLine();
        Time time2 = new Time(nomeTime2);

        cadastrarJogadoresNoTime(time1);
        cadastrarJogadoresNoTime(time2);

        System.out.println("/informacoes do time e jogadores:");
       
        time1.listarJogadores();
        time2.listarJogadores();

        scanner.close();

    }
    public static void cadastrarJogadoresNoTime(Time time){
        Scanner scanner = new Scanner (System.in);
        for(int i= 0 ; i < 11; i++){
            System.out.println("Cadastrandon jogador#"+ (i + 1) + " para o time " + time.getNomeTime());
            time.cadastrarJogador();
        }

    }
}
