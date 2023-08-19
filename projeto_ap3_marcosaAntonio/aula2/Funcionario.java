package projeto_ap3_marcosaAntonio.aula2;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [Nome: " + nome + ", Cargo: " + cargo + ", Salário: " + salario + "]";
    }
}


