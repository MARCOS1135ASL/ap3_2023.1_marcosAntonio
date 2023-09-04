package projeto_ap3_marcosaAntonio.unidade2_ex1.exe4;

import projeto_ap3_marcosaAntonio.unidade2_ex1.Disciplina;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua: nova luz ", " cidade: nova terra", "cep:04092023");
        Escola escola = new Escola(" estacial nova era ", endereco);

        Professor professor1 = new Professor("xiquinho", "01/01/2001");
        Disciplina disciplina1 = new Disciplina("ap3");
        escola.contratarProfessor(professor1, disciplina1);

        Professor professor2 = new Professor("jasminy ", "03/03/2003");
        Disciplina disciplina2 = new Disciplina("logica");
        escola.contratarProfessor(professor2, disciplina2);

        Professor professor3 = new Professor("Carlos galileu", "05/05/2000");
        Disciplina disciplina3 = new Disciplina("Banco de Dados");
        escola.contratarProfessor(professor3, disciplina3);

        Professor professor4 = new Professor("Marcos liam", "07/07/2023");
        Disciplina disciplina4 = new Disciplina("Algoritmos");
        escola.contratarProfessor(professor4, disciplina4);

        escola.listarProfessores();
    }
}