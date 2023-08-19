package projeto_ap3_marcosaAntonio.aula2;
 // Código Secreto: 10094890715
  //Código secreto do aluno.
 
import java.util.LinkedList;

public class Banco {
    private LinkedList<ContaBancaria> contas;

    public Banco(String nome) {
        this.contas = new LinkedList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(ContaBancaria conta) {
        contas.remove(conta);
    }

    public void exibirInformacoesContas() {
        for (ContaBancaria conta : contas) {
            System.out.println(conta.toString());
        }
    }
}

