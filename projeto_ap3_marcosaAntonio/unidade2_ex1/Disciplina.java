package projeto_ap3_marcosaAntonio.unidade2_ex1;

// Crie uma classe Disciplina com os atributos nomeDisciplina e cargaHoraria. 
// Encapsule corretamente os atributos. A classe Curso deve conter 
// um nome e uma lista de Disciplina como parte de sua composição. No método toString() 
// exiba todas as informações do Curso e das Disciplinas. 
//Implemente corretamente a visibilidade de cada método e cada atributo. Opcionalmente, trate como 
// "IllegalArgumentException" se a carga horária for menor que 0.

public class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;

    public Disciplina(String nomeDisciplina, int cargaHoraria) {
        setNomeDisciplina(nomeDisciplina);
        setCargaHoraria(cargaHoraria);
    }

    public Disciplina(String string) {
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria < 0) {
            throw new IllegalArgumentException(" erro Carga horária invalida para a disciplina: " + nomeDisciplina);
        }
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nomeDisciplina + ", Carga Horária: " + cargaHoraria + " horas";
    }
}
