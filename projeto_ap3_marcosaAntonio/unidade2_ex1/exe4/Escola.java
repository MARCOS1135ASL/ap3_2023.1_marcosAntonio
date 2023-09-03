package projeto_ap3_marcosaAntonio.unidade2_ex1.exe4;

import java.util.ArrayList;
import java.util.List;


public class Escola {
    

    private String  nomeEscola;
    private  Endereco endereco;
    private String nomeEscola;
    private List<professor> = new ArrayList <>();
    
    public Escola (String nomeEscola, Endereco endereco){
        nomeEscola = nomeEscola;
        this.nomeEscola = nomeEscola;
        this.endereco = endereco;
        
    }
public void contratarprofessor(){
    System.out.println("Escola:"+ nomeEscola);
    System.out.println("endereco;" + endereco.getLagradouro()+"," + endereco.getCidade()+ ","+ endereco.getCep());
    System.out.println("Professor:");

    Professor[] professores;
    for (Professor professor : professores) {
        System.out.println("Nome: " + professor.getName());
        System.out.println("Data de Nascimento: " + professor.getDatadenascimento());
        System.out.println("Disciplina: " + professor.getDisciplina().getNomeDisciplina());
        System.out.println("----------------------");
    }
}
public void contratarProfessor(Professor professor1, Disciplina disciplinaMatematica) {
}
public void listarProfessores() {
}


}


    
