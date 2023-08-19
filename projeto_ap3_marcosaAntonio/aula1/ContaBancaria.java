<<<<<<< Updated upstream
package projeto_ap3_marcosaAntonio.aula1;
//Crie uma classe chamada "ContaBancaria" que tenha os atributos
// número da conta, nome do titular e saldo. Implemente métodos para depositar, sacar e verificar o saldo da conta.
// Implemente getters, setters e toString. Crie a classe TestaContaBancaria, com 3 contas.

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
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
        return "ContaBancaria [Número da Conta: " + numeroConta + ", Titular: " + nomeTitular + ", Saldo: " + saldo + "]";
    }
}
=======
package projeto_ap3_marcosaAntonio.aula1;
//Crie uma classe chamada "ContaBancaria" que tenha os atributos
// número da conta, nome do titular e saldo. Implemente métodos para depositar, sacar e verificar o saldo da conta.
// Implemente getters, setters e toString. Crie a classe TestaContaBancaria, com 3 contas.

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
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
        return "ContaBancaria [Número da Conta: " + numeroConta + ", Titular: " + nomeTitular + ", Saldo: " + saldo + "]";
    }
}
>>>>>>> Stashed changes
