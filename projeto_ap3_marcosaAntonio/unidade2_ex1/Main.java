
package projeto_ap3_marcosaAntonio.unidade2_ex1;

public class Main {
    public static void main(String[] args) {
    
        Disciplina disciplina3 = new Disciplina("AP3", 60);
        Disciplina disciplina4 = new Disciplina("Lógica", 60);
        Disciplina disciplina5 = new Disciplina("Banco de Dados", -100); // Carga horária negativa

        Curso curso = new Curso("Sistemas de Informação");

        curso.adicionarDisciplina(disciplina3);
        curso.adicionarDisciplina(disciplina4);
        curso.adicionarDisciplina(disciplina5);

        System.out.println(curso.toString());
    }
}

