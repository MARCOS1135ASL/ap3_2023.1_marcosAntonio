package projeto_ap3_marcosaAntonio.unidade2_ex1.exe4;

import projeto_ap3_marcosaAntonio.unidade2_ex1.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class Testep {
    private static Object biologia;
    private static Object programaçao;

    public static void main(String[] args) {
         
        Endereco enderecoEscola = new Endereco("Rua da Escola", "Cidade Escolar", "12345-678");

   
        Endereco enderecoEscola = new Endereco("Rua da Escola", "Cidade Escolar", "12345-678");

        Escola minhaEscola = new Escola("Minha Escola", enderecoEscola);

        Disciplina matematica = new Disciplina("ap3", 60);
        Disciplina historia = new Disciplina("logoca", 45);
        Disciplina ciencias = new Disciplina("rede de computadores", 50);

        Professor professor1 = new Professor("victor", "01/01/2031");
        Professor professor2 = new Professor("toric", "04/04/2024");
        Professor professor3 = new Professor("maxjava", "03/09/2023");

        Object filosofia;
        minhaEscola.contratarProfessor(professor1, filosofia);
        minhaEscola.contratarProfessor(professor2, biologia);
        minhaEscola.contratarProfessor(professor3, programaçao web);

       
        minhaEscola.listarProfessores();
    }
}