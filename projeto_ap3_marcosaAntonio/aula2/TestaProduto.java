package projeto_ap3_marcosaAntonio.aula2;
// criada a classe testa produto 
import java.util.ArrayList;

public class TestaProduto {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();

        estoque.add(new Produto("Camiseta", 29.99, 50));
        estoque.add(new Produto("Calça Jeans", 79.90, 30));
        estoque.add(new Produto("Tênis", 129.50, 20));

        for (Produto produto : estoque) {
            System.out.println(produto.toString());
        }
    }
}
