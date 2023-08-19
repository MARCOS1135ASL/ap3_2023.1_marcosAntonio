package projeto_ap3_marcosaAntonio.aula3;

// Crie uma classe chamada Pessoa com um atributo nome (private). Forneça métodos públicos getNome 
//e setNome para acessar e modificar o atributo. Altere o toString para exibir o nome completo em letras maiúsculas.

import java.util.Scanner;

public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        if (nome == null) {
            return "Nome não definido";
        }
        return nome.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nomeDigitado = scanner.nextLine();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nomeDigitado);

        System.out.println("Nome em maiúsculas: " + pessoa);

        scanner.close();
    }
}
