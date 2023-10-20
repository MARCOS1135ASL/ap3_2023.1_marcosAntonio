package projeto_ap3_marcosaAntonio.unidade3.EX1;

public class TestaBanco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        try {
            conta.depositar(11000);
            TransacaoBancaria.realizarTransacao(conta, 5000);
            TransacaoBancaria.realizarTransacao(conta, -1200); // Isso deve lançar IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao realizar transação: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

