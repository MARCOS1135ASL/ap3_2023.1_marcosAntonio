package projeto_ap3_marcosaAntonio.aula3;
//  Crie uma classe BibliotecaPequena com atributos nome (private) e livros[6] (protected). 
//  A classe Biblioteca deve conter um método listarLivros de visibilidade public 
//  que exibe os nomes dos livros cadastrados. Faça uma classe TestaBibliotecaPequena com o
//  cadastro de 6 livros. Armazene o nome dos livros no array e use a classe Scanner para ler o nome de cada livro.


public class Bibliotecapequena{
private String nome;
protected String [] livros = new String[6];

 public Bibliotecapequena (String nome){
this.nome = nome;

 }
public void listarLivros() {
    System.out.println("livros na biblioteca" + nome +":");
    for (String livros: livros ){
        if (livros!= null) {
            System.out.println(livros);
        }
    }
}

}


