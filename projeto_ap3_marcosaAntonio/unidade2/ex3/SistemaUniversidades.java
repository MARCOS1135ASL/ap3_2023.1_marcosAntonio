package projeto_ap3_marcosaAntonio.unidade2.ex3;
import java.util.List;

import projeto_ap3_marcosaAntonio.unidade2.exe1.Curso;
import projeto_ap3_marcosaAntonio.unidade2.exe3.Universidade;

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


    
