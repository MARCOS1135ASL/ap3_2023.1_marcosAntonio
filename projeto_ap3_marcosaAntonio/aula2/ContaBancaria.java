package projeto_ap3_marcosaAntonio.aula2;

public class ContaBancaria {
/*
 * Código Secreto: 10094890715
 * Código secreto do aluno.
 */
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria [Número: " + numeroConta + ", Titular: " + nomeTitular + ", Saldo: " + saldo + "]";
    }
}

