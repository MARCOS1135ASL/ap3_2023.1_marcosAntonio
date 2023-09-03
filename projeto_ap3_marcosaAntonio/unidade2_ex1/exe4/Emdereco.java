package projeto_ap3_marcosaAntonio.unidade2_ex1.exe4;
 
import projeto_ap3_marcosaAntonio.unidade2_ex1.Disciplina;

public class Emdereco {
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
    
        public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }
    
        public String getCidade() {
            return cidade;
        }
    
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
    
        public String getCep() {
            return cep;
        }
    
        public void setCep(String cep) {
            this.cep = cep;
        }
    } 
}
