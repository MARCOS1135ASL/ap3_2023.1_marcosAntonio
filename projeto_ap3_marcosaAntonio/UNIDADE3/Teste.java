package projeto_ap3_marcosaAntonio.UNIDADE3;

public class Teste {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "eco espot", 2021, 4);
        Moto moto = new Moto("Honda", "CBR1000R", 2022, 1000);

        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno() + " " + carro.getNumeroPortas() + " portas");
        System.out.println("Moto: " + moto.getMarca() + " " + moto.getModelo() + " " + moto.getAno() + " cilindrada de " + moto.getCilindrada() + " cc");
    }

    }
