package projeto_ap3_marcosaAntonio.unidade3.EX1;

public class TransacaoBancaria {
    public static void realizartransiçao(ContaBancaria conta, double valor){
        try{
            conta.sacar(valor);
            System.out.println("transiçâo realizada com sucesso");

    }catch (IllegalArgumentException e ){
        System.out.println("VALOR INVALIDO ");
        e.printStackTrace();
    }catch(Exception e){
        System.out.println("saldo insuficiente");
        e.printStackTrace();
    }
    }

    public static void realizarTransacao(ContaBancaria conta, double d) {
    }
}
