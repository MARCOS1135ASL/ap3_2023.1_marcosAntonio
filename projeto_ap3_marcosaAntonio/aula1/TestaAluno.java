package projeto_ap3_marcosaAntonio.aula1;
// classe teste aluno 
public class TestaAluno {
    public static void main(String[] args) {
        // Passo 10: Crie dois objetos Aluno
        Aluno aluno1 = new Aluno("Marcos Antonio", "20210012023", 7.5);
        Aluno aluno2 = new Aluno("Maria xit", "20210022021", 4.0);

        // Passo 11: Imprima informações dos alunos e seus status de aprovação
        System.out.println(aluno1.toString());
        System.out.println("Status: " + aluno1.calcularStatus());

        System.out.println(aluno2.toString());
        System.out.println("Status: " + aluno2.calcularStatus());
    }
}
