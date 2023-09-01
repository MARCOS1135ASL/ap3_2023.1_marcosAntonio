
package projeto_ap3_marcosaAntonio.unidade2_ex1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("sistema de informações");

        try {
            Disciplina disciplina1 = new Disciplina("AP3", 60);
            Disciplina disciplina2 = new Disciplina("Banco de Dados", 60);
            Disciplina disciplina3 = new Disciplina("Computação", -10); // Carga horária negativa
            Disciplina disciplina4 = new Disciplina("Sistemas de Informação", 60);

            curso.adicionarDisciplina(disciplina1);
            curso.adicionarDisciplina(disciplina2);
            curso.adicionarDisciplina(disciplina3);
            curso.adicionarDisciplina(disciplina4);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro carga horaria invalida: " + e.getMessage());
        }

        // Listar todas as disciplinas
        List<Disciplina> disciplinas = curso.getDisciplinas();
        System.out.println("Disciplinas do curso:");

        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }
}

