package Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marcos", "123452023", 7.5);
        Aluno aluno2 = new Aluno("Maria", "678902022", 6.9);

        System.out.println(aluno1);
        System.out.println("Situação do aluno 1: " + (aluno1.foiAprovado() ? "Aprovado" : "Reprovado"));

        System.out.println(aluno2);
        System.out.println("Situação do aluno 2: " + (aluno2.foiAprovado() ? "Aprovado" : "Reprovado"));
    }
}
    

