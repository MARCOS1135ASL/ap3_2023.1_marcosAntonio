package projeto_ap3_marcosaAntonio.unidade2.ex3;
import java.util.ArrayList;
import java.util.List;

import projeto_ap3_marcosaAntonio.unidade2.ex1.Curso;
// Crie uma classe SistemaUniversidades que organize informações sobre várias universidades.
//A classe SistemaUniversidades deve conter uma lista de Universidade como parte de sua composição. 
//Adicione um método encontrarUniversidadeComMaisAlunos() que retorna o nome da universidade que possui mais alunos
//matriculados em todos os cursos. Utilize a classe Curso do exercício 1.
//
//

public class SistemaUniversidades  {
    private List <Universidade> universidades;
    
    public SistemaUniversidades(List <Universidade>universidades){
        this.universidades = universidades;

    }
   
    /**
     * @return
     */
    public String encotrauniversidadecommaisaluno(){
        String universidadecommaisalunos = null;
        int maxaluno=0;
        for (Universidade universidade : universidades) {
            int totalAlunosUniversidade = 0;
            for (Curso curso : universidade.getCursos()) {
                totalAlunosUniversidade += curso.getAlunos();
            }

            int maxAlunos;
            if (totalAlunosUniversidade > maxAlunos) {
                maxAlunos = totalAlunosUniversidade;
                universidadecommaisalunos = universidade.getNome();
            }
        }

        return universidadecommaisalunos;
    }

    public String encontrarUniversidadeComMaisAlunos() {
        return null;
    }
    }


    

