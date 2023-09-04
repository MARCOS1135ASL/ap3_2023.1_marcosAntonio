package projeto_ap3_marcosaAntonio.unidade2_ex1.exe4;
 
public class Endereco {
    private String logradouro;
    private String cidade;
    private String cep;

    public Endereco(String logradouro, String cidade, String cep) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }
}
