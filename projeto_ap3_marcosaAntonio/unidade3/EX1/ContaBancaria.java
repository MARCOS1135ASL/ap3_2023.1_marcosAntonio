package projeto_ap3_marcosaAntonio.unidade3.EX1;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public boolean sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor infuciciente  ");
        }

        if (saldo < valor) {
            return false;
        }

        saldo -= valor;
        return true;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor negativo não é permitido");
        }

        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
