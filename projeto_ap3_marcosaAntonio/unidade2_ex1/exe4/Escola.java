package projeto_ap3_marcosaAntonio.unidade2_ex1.exe4;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nomeEscola;
    private Endereco endereco;
    private List<Professor> professores = new ArrayList<>();

    public Escola(String nomeEscola, Endereco endereco) {
        this.nomeEscola = nomeEscola;
        this.endereco = endereco;
    }

    public void contratarProfessor(Professor professor, Object filosofia) {
        professor.setDisciplina(filosofia);
        professores.add(professor);
    }

    public void listarProfessores() {
        System.out.println("Escola: " + nomeEscola);
        System.out.println("Endereço: " + endereco.getLogradouro() + ", " + endereco.getCidade() + ", " + endereco.getCep());
        System.out.println("Professores:");

        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Data de Nascimento: " + professor.getDataNascimento());
            System.out.println("Disciplina: " + professor.getDisciplina().getNomeDisciplina());
            System.out.println("----------------------");
        }
    }
}
