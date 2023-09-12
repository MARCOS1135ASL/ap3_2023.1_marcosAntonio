package projeto_ap3_marcosaAntonio.aula1;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(221455, "Marcos lima", 1000.0);
        ContaBancaria conta2 = new ContaBancaria(100224, " Juliana Cistina", 1500.0);
        ContaBancaria conta3 = new ContaBancaria(100377, " José Carlos", 500.0);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());

        conta1.depositar(2000.0);
        conta2.sacar(500.0);
        conta3.depositar(1000.0);

        System.out.println("\nApós transações:\n");

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());
    }
}
=======
package projeto_ap3_marcosaAntonio.aula1;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(221455, "Marcos lima", 1000.0);
        ContaBancaria conta2 = new ContaBancaria(100224, " Juliana Cistina", 1500.0);
        ContaBancaria conta3 = new ContaBancaria(100377, " José Carlos", 500.0);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());

        conta1.depositar(2000.0);
        conta2.sacar(500.0);
        conta3.depositar(1000.0);

        System.out.println("\nApós transações:\n");

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());
    }
}
