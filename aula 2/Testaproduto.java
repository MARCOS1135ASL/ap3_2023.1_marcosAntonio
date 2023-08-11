package aula 2;

    import java.util.ArrayList;
    
public class TestaProduto {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();

        // Adicionando 258 produtos ao estoque
        for (int i = 1; i <= 258; i++) {
            Produto produto = new Produto("Produto " + i, i * 10.0, i * 5);
            estoque.add(produto);
        }

        // Exibindo informações dos produtos
        for (Produto produto : estoque) {
            System.out.println(produto);
            System.out.println("--------------------");
        }
    }
}

    
}
