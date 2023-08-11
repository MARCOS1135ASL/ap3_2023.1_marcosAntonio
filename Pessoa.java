public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método toString() sobrescrito
    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + " anos\nAltura: " + altura + " metros";
    }

    // Método para fazer aniversário
    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário! Agora você tem " + idade + " anos.");
    }

    // Método para verificar se é maior de idade
    public boolean ehMaiorDeIdade() {
        return idade >= 18;
    }
    
    // Método para verificar se é menor de idade
    public boolean ehMenorDeIdade() {
        return idade < 18;
    }

    // Métodos getter e setter para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
