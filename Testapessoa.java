public class Testapessoa {
    public static void main(String[] args) {
        Pessoa maria = new Pessoa("Maria", 30, 1.65);
        Pessoa arcos = new Pessoa("Arcos", 22, 1.80);
        Pessoa pedro = new Pessoa("Pedro", 17, 1.70);

        System.out.println("Informações de Maria:\n" + maria);
        System.out.println("\nInformações de Arcos:\n" + arcos);
        System.out.println("\nInformações de Pedro:\n" + pedro);

        maria.fazerAniversario();
        arcos.fazerAniversario();
        pedro.fazerAniversario();

        System.out.println("\nNovas informações de Maria:\n" + maria);
        System.out.println("\nNovas informações de Arcos:\n" + arcos);
        System.out.println("\nNovas informações de Pedro:\n" + pedro);

        System.out.println("\nMaria é maior de idade? " + maria.ehMaiorDeIdade());
        System.out.println("Arcos é maior de idade? " + arcos.ehMaiorDeIdade());
        System.out.println("Pedro é maior de idade? " + pedro.ehMaiorDeIdade());
    }
}
