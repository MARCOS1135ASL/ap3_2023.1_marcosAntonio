<<<<<<< Updated upstream
package projeto_ap3_marcosaAntonio.aula1;
//Crie uma classe chamada "Aluno" que tenha os atributos nome, matrícula e nota.
//Implemente um método para calcular se o aluno foi aprovado (média maior ou igual a 7.0) ou reprovado
// Implemente getters, setters e toString. Crie a classe TestaAluno, com 2 alunos.

public class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    // Passo 5: Crie o construtor da classe
    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    // Passo 6: Implemente o método para calcular se o aluno foi aprovado ou reprovado
    public String calcularStatus() {
        if (nota >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // Passo 7: Implemente os getters, setters e toString
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
    }
}

=======
package projeto_ap3_marcosaAntonio.aula1;
//Crie uma classe chamada "Aluno" que tenha os atributos nome, matrícula e nota.
//Implemente um método para calcular se o aluno foi aprovado (média maior ou igual a 7.0) ou reprovado
// Implemente getters, setters e toString. Crie a classe TestaAluno, com 2 alunos.

public class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    // Passo 5: Crie o construtor da classe
    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    // Passo 6: Implemente o método para calcular se o aluno foi aprovado ou reprovado
    public String calcularStatus() {
        if (nota >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // Passo 7: Implemente os getters, setters e toString
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
    }
}

>>>>>>> Stashed changes
