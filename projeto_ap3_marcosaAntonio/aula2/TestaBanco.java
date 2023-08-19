package projeto_ap3_marcosaAntonio.aula2;

/*
 * Código Secreto: 10094890715
 * Código secreto do aluno.
 */
public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco ABC");

        ContaBancaria conta1 = new ContaBancaria(100121, "Marcos Lima", 50.0);
        ContaBancaria conta2 = new ContaBancaria(100222, "Maria Luiza", 200.0);
        ContaBancaria conta3 = new ContaBancaria(100323, "Antônio Carlos", 2000.0);
        // Crie mais contas aqui...

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);
        // Adicione mais contas ao banco...

        // Crie e adicione mais 27 contas ao banco usando um loop
        for (int i = 4; i <= 30; i++) {
            ContaBancaria novaConta = new ContaBancaria(1000 + i, "Titular " + i, 1000.0 + i * 100);
            banco.adicionarConta(novaConta);
        }

        banco.exibirInformacoesContas();
    }
}
