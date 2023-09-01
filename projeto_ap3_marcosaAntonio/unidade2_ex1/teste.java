package projeto_ap3_marcosaAntonio.unidade2_ex1;

public class teste {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("JavaDevelopers");

        Funcionario funcionario1 = new Funcionario("MARCOS", 3000);
        Funcionario funcionario2 = new Funcionario("MARCIEL", 3500);
        Funcionario funcionario3 = new Funcionario("CARLOS", 5500);

        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);
        empresa.adicionarFuncionario(funcionario3);

        double totalSalarios = empresa.calcularTotalSalarios();
        System.out.println("Total de salários da empresa: " + totalSalarios);
    }
}
