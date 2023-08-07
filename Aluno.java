package Aluno;
public class Aluno {
    private String nome;
    private String matricula;
    private double nota;


    // Construtor
    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para matrícula
    public String getMatricula() {
        return matricula;
    }

    // Setter para matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter para nota
    public double getNota() {
        return nota;
    }

    // Setter para nota
    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para verificar se o aluno foi aprovado
    public boolean foiAprovado() {
        return nota >= 7.0;
    }

    // Método toString para representação em string do aluno
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
    }
}




    
    

