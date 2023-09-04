package projeto_ap3_marcosaAntonio.unidade2_ex1.exe4;

import projeto_ap3_marcosaAntonio.unidade2_ex1.Disciplina;


public class Escola {
    private String nomeEscola;
    private Endereco endereco;
    private Professor[] professores;

    public Escola(String nomeEscola, Endereco endereco) {
        this.nomeEscola = nomeEscola;
        this.endereco = endereco;
        this.professores = new Professor[10];
    }

    public void contratarProfessor(Professor professor, Disciplina disciplina) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] == null) {
                professores[i] = professor;
                professor.setDisciplina(disciplina);
                break;
            }
        }
    }

    public void listarProfessores() {
        System.out.println("Escola: " + nomeEscola);
        System.out.println("Endereço: " + endereco.getLogradouro() + ", " + endereco.getCidade() + ", " + endereco.getCep());
        System.out.println("Professores:");
        for (Professor professor : professores) {
            if (professor != null) {
                System.out.println(professor.getNome() + " - " + professor.getDisciplina().getNomeDisciplina());
            }
        }
    }
}