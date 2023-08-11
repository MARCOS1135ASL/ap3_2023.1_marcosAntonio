package ContaBancaria;

public class TestaContaBancaria {
        public static void main(String[] args) {
            ContaBancaria conta1 = new ContaBancaria(1, "Marcos", 1000.0);
            ContaBancaria conta2 = new ContaBancaria(2, "nina", 1500.0);
            ContaBancaria conta3 = new ContaBancaria(3, "Pedro", 200.0);
    
            System.out.println(conta1);
            conta1.depositar(500.0);
            System.out.println("Saldo após depósito na conta 1: " + conta1.getSaldo());
    
            System.out.println(conta2);
            conta2.sacar(200.0);
            System.out.println("Saldo após saque na conta 2: " + conta2.getSaldo());
    
            System.out.println(conta3);
            System.out.println("Saldo atual da conta 3: " + conta3.getSaldo());
        }
    }
    
    

    
