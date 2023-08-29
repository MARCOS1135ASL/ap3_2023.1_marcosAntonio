package projeto_ap3_marcosaAntonio.unidade2_ex1;

// Crie uma classe Disciplina com os atributos nomeDisciplina e cargaHoraria. 
// Encapsule corretamente os atributos. A classe Curso deve conter 
// um nome e uma lista de Disciplina como parte de sua composição. No método toString() 
// exiba todas as informações do Curso e das Disciplinas. 
//Implemente corretamente a visibilidade de cada método e cada atributo. Opcionalmente, trate como 
// "IllegalArgumentException" se a carga horária for menor que 0.

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String Disciplina;
    private int cargahoraria;
    private String nomeDisciplina;
    public Disciplina(String nomeDisciplina, int cargahoraria){
        if(cargahoraria <0){
            throw new IllegalArgumentException("Carga horária não pode ser menor que 0.");
        }
        this. nomeDisciplina = nomeDisciplina;
        this.cargahoraria = cargahoraria;


        }
        public String geteNameDisciplina(){
            return Disciplina;
        }
        public int cargahoraria(){
            return cargahoraria;

        }
         @Override
    public String toString() {
        return "Disciplina: " + nomeDisciplina + " - Carga Horária: " + cargahoraria;
    }
}

class Curso {
    private String nomeCurso;
    private List<Disciplina> disciplinas;
     public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
     @Override
    public String toString() {
        StringBuilder cursoInfo = new StringBuilder("Curso: " + nomeCurso + "\nDisciplinas:\n");
        for (Disciplina disciplina : disciplinas) {
            cursoInfo.append(disciplina.toString()).append("\n");
        }
        return cursoInfo.toString();
    }
}

