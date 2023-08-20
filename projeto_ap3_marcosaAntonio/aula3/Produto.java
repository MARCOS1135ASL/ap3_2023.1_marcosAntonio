package projeto_ap3_marcosaAntonio.aula3;

public class Produto {
    private String descricao;
    private String cor;
    private String tamanho;
    private String marca;
     
    public Produto (String descricao, String cor, String tamanho, String marca
    ){
     this. descricao = descricao;
     this.cor = cor;
     this.tamanho = tamanho;
     this. marca = marca;  
    }
    public void exibirdescricao(){
        System.out.println("descricao do produto" + descricao);
        System.out.println("cor" + cor);
        System.out.println("tamanho" + tamanho);
        System.out.println("marca" + marca);

    }
}
