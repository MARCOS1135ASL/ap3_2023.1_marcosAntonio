package projeto_ap3_marcosaAntonio.aula2;

import java.util.HashMap;

public class TestaFuncionario {
    public static void main(String[] args) {
        HashMap<String, Funcionario> funcionarios = new HashMap<>();

        funcionarios.put("Marcos", new Funcionario("Marcos", "Gerente", 5000.0));
        funcionarios.put("Maria", new Funcionario("Maria", "Analista", 3500.0));
        funcionarios.put("Carlos", new Funcionario("Carlos", "Desenvolvedor", 2800.0));
        funcionarios.put("Ana", new Funcionario("Ana", "Gerente", 5500.0));
        // Adicione mais funcionários aqui...

        for (Funcionario funcionario : funcionarios.values()) {
            System.out.println(funcionario.toString());
        }
    }
}


