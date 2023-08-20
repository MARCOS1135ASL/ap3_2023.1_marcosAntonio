package projeto_ap3_marcosaAntonio.aula3;

// aqui iremos teta a funcionalidade de nossa biblioteca

import java.util.Scanner;

public class Testabibliotecapequena {
    public static void main(String[] args) {
     Bibliotecapequena Biblioteca = new Bibliotecapequena("minha Biblioteca");
     Scanner scanner  = new Scanner(System.in);
     for ( int i = 0 ; i < 6; i++){
        System.out.println("Digite o nome do livro" + (i + 1) + ": ");
        String Nomedolivro = scanner.nextLine();
        Biblioteca.livros[i] = Nomedolivro;
     }
     scanner.close();
     Biblioteca.listarLivros();

    }

}
