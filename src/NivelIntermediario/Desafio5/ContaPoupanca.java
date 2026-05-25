package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    // Métodos ----------------------------------------
    @Override
    public void depositar(double valor) {
        // acrescimo no saldo com desconto de 1% de taxa
        saldo += valor - (valor*0.01);
    }

    // Construtores ----------------------------------------
    public ContaPoupanca(){
    }

    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }
}
