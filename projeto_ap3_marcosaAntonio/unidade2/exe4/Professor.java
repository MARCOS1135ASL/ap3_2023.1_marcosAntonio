package projeto_ap3_marcosaAntonio.unidade2.exe4;

import projeto_ap3_marcosaAntonio.unidade2.ex1.Disciplina;

public class Professor {

 private String nome;
    private String dataNascimento;
    private Disciplina disciplina;

    public Professor(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}
