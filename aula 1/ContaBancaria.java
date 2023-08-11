package ContaBancaria;

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
    
        public boolean sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                return true;
            }
            return false;
        }
    
        @Override
        public String toString() {
            return "ContaBancaria [numeroConta=" + numeroConta + ", nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
        }
    }
    
    