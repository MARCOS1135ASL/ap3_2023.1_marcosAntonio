package projeto_ap3_marcosaAntonio.unidade2_ex1.exe4;

public class Professor {
    private String name;
    private String datadenascimento;
    private Disciplina disciplina;
    public Professor(String name, String datadenascimento, Disciplina disciplina) {
        this.name = name;
        this.datadenascimento = datadenascimento;
        this.disciplina = disciplina;
    }
    public String getName() {
        return name;
    }
    public String getDatadenascimento() {
        return datadenascimento;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
    
}
