
package projeto_ap3_marcosaAntonio.unidade2_ex1;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("sistemas de imformaçoes");

        Disciplina disciplina1 = new Disciplina(" java", 60);
        Disciplina disciplina2 = new Disciplina("banco de dados ", 80);
         Disciplina disciplina3 = new Disciplina(" algoritimos de programação", 60);

        curso.adicionarDisciplina(disciplina1);
        curso.adicionarDisciplina(disciplina2);
        curso.adicionarDisciplina(disciplina3);

        System.out.println(curso);
    }
}