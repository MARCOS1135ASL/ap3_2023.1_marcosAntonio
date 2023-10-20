package projeto_ap3_marcosaAntonio.unidade3.EX1;


public class TransacaoBancaria {
    public static void realizarTransacao(ContaBancaria conta, double valor) {
        try {
            if (!conta.sacar(valor)) {
                throw new SaldoInsuficienteException();
            }
            System.out.println("Transação concluída. Saldo restante: " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Valor inválido: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
