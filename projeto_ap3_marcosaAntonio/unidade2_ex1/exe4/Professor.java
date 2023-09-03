package projeto_ap3_marcosaAntonio.unidade2_ex1.exe4;

import projeto_ap3_marcosaAntonio.unidade2_ex1.Disciplina;

public class Professor {
    private String nome;
    private String dataNascimento;
    private Disciplina disciplina;

    public Professor(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}

