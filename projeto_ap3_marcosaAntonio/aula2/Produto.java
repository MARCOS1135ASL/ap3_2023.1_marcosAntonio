package projeto_ap3_marcosaAntonio.aula2;
//Crie uma classe chamada "Produto" que tenha os atributos nome, preço e quantidade em estoque.
//Implemente métodos para adicionar e remover produtos do estoque,
//além de exibir as informações completas do produto. Implemente getters, setters e toString.
//Crie a classe TestaProduto, com 258 produtos. Utilize uma coleção do tipo "ArrayList" para armazenar os produtos em estoque.

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    @Override
    public String toString() {
        return "Produto [Nome: " + nome + ", Preço: " + preco + ", Quantidade em Estoque: " + quantidadeEstoque + "]";
    }
}

