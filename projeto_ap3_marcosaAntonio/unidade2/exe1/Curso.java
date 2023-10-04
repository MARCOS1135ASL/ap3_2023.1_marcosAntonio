package projeto_ap3_marcosaAntonio.unidade2.exe1;


import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        StringBuilder cursoInfo = new StringBuilder("Curso: ").append(nome).append("\n");

        for (Disciplina disciplina : disciplinas) {
            cursoInfo.append(disciplina).append("\n");
        }

        return cursoInfo.toString();
    }

    public String getNome() {
        return null;
    }

    public List<Disciplina> pesquisarDisciplinasPorCargaHoraria(int i) {
        return null;
    }

    public int getAlunos() {
        return 0;
    }
}
