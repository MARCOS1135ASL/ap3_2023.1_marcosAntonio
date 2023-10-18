package projeto_ap3_marcosaAntonio.unidade3.EX1;

public class TestaBanco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        System.out.println("Saldo inicial: " + conta.getSaldo());

        try {
            System.out.println("Tentando depositar -100.0");
            TransacaoBancaria.realizarTransacao(conta, -100.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Tentando sacar 2000.0");
            TransacaoBancaria.realizarTransacao(conta, 2000.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Tentando depositar 500.0");
            conta.depositar(500.0);
            System.out.println("Saldo após depósito: " + conta.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Tentando sacar 300.0");
            conta.sacar(300.0);
            System.out.println("Saldo após saque: " + conta.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
