package projeto_ap3_marcosaAntonio.unidade2.exe3;
import java.util.ArrayList;
import java.util.List;

import projeto_ap3_marcosaAntonio.unidade2.exe1.Curso;


public class Teste {
    public static void main(String[] args) {
        Curso curso1 = new Curso("ap3,5000");
        Curso curso2 = new Curso("computação,200");
        Curso curso3 = new Curso("logica, 800");

        List<Curso> cursosUniversidade1 = new ArrayList<>();
        cursosUniversidade1.add(curso1);
        cursosUniversidade1.add(curso2);

        List<Curso> cursosUniversidade2 = new ArrayList<>();
        cursosUniversidade2.add(curso2);
        cursosUniversidade2.add(curso3);

        List<Curso> cursosUniversidade3 = new ArrayList<>();
        cursosUniversidade3.add(curso1);
        cursosUniversidade3.add(curso3);

        final Universidade universidade1 =  Universidade("Universidade universodo saber", cursosUniversidade1);
        Universidade universidade2 =  Universidade("Universidade aprendiz", cursosUniversidade2);
        Universidade universidade3 =  Universidade("Universidade famosa", cursosUniversidade3);

        List<Universidade> universidades = new ArrayList<>();
        universidades.add(universidade1);
        universidades.add(universidade2);
        universidades.add(universidade3);

        SistemaUniversidades sistemaUniversidades = new SistemaUniversidades(universidades);
        String universidadeComMaisAlunos = sistemaUniversidades.encontrarUniversidadeComMaisAlunos();
        System.out.println("A universidade com mais alunos é: " + universidadeComMaisAlunos);
    }

    private static Universidade Universidade(String string, List<Curso> cursosUniversidade2) {
        return null;
    }
    }

