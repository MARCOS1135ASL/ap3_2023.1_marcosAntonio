package projeto_ap3_marcosaAntonio.unidade2_ex1;

// Crie uma classe Empresa que contenha atributos como nomeEmpresa e uma lista de funcionários. 
// Encapsule adequadamente esses atributos. Implemente um método adicionarFuncionario(Funcionario funcionario) 
// para adicionar um funcionário à empresa. Além disso, crie um método calcularTotalSalarios() 
//que calcula e retorna o total de salários de todos os funcionários na empresa.



import java.util.ArrayList;
import java.util.List;

import projeto_ap3_marcosaAntonio.unidade2_ex1.exe2.Funcionario;

public class Empresa {
    private List<Funcionario> funcionarios;
    public Empresa(String nomeEmpresa) {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularTotalSalarios() {
        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.getSalario();
        }
        return totalSalarios;
    }
}