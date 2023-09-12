
package projeto_ap3_marcosaAntonio.aula1;
// classe crida para testa carro.

public class TestaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2018);
        Carro carro3 = new Carro("Ford", "Mustang", 2019);
        Carro carro4 = new Carro("Chevrolet", "Camaro", 2022);

        Carro[] carros = {carro1, carro2, carro3, carro4};

        for (Carro carro : carros) {
            System.out.println(carro.toString());
            System.out.println("É semi-novo? " + (carro.isSemiNovo() ? "Sim" : "Não"));
            System.out.println();
        }
    }
}

=======
package projeto_ap3_marcosaAntonio.aula1;
// classe crida para testa carro.

public class TestaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2018);
        Carro carro3 = new Carro("Ford", "Mustang", 2019);
        Carro carro4 = new Carro("Chevrolet", "Camaro", 2022);

        Carro[] carros = {carro1, carro2, carro3, carro4};

        for (Carro carro : carros) {
            System.out.println(carro.toString());
            System.out.println("É semi-novo? " + (carro.isSemiNovo() ? "Sim" : "Não"));
            System.out.println();
        }
    }
}

