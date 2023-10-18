 package projeto_ap3_marcosaAntonio.unidade3.EX1;

public class ContaBancaria {

    private double saldo;
    public ContaBancaria(double saldoinicial){
        if (saldoinicial < 0){
            throw new IllegalArgumentException ("saldoiinicial não pode ser negativo");

        }
         this.saldo= saldoinicial;
    }
    
    public void depositar( Double valor){
        if (valor < 0){
            throw new IllegalArgumentException("saldo de deposito não pode ser negativo");
            
    }
    this.saldo= +valor;

}
public void sacar (double valor) {
    if(valor >this.saldo ){
        throw new IllegalArgumentException("saldo insuficiente para saldo ");

    }
    this.saldo -= valor;

}
public double getSaldo() {
    return  this.saldo;
}
}