package projeto_ap3_marcosaAntonio.aula3;
//nessa classe iremos testa nosso programa !

import java.util.ArrayList;
import java.util.Scanner;

public class Testacarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Cadastro do Carro Popular #" + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            Carro carro = new Carro(nome, modelo, ano);
            carros.add(carro);
        }

        scanner.close();

        System.out.println("Carros populares cadastrados:");
        for (Carro carro : carros) {
            System.out.println("Nome: " + carro.getNome() + ", Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno());
        }
    }
}