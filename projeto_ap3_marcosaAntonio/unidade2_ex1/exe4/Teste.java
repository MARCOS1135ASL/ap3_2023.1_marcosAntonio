package projeto_ap3_marcosaAntonio.unidade2_ex1.exe4;

public class Teste {
     public static void main(String[] args) {
        Endereco enderecoEscola = new Endereco("RUA: MIRANTE DA SERRA, 242", "CIDADE: NOVO ORIZONTE", "03092023");
        Escola escola = new Escola("ESCOLA: PUBLICA NOVA ALIANÇA", enderecoEscola);


        Disciplina disciplinaMatematica = new Disciplina();
        Disciplina disciplinaHistoria = new Disciplina();

        Professor professor1 = new Professor("XICO", "01/01/2001", disciplinaMatematica);
        Professor professor2 = new Professor("MARCOS", "20/03/1993", disciplinaHistoria);

        escola.contratarProfessor(professor1, disciplinaMatematica);
        escola.contratarProfessor(professor2, disciplinaHistoria);

        escola.listarProfessores();
    }

        
    }
