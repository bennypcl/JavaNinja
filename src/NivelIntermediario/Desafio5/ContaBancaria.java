package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta{

    String titular;
    double saldo;
    TipoConta tipoDeConta;

    // Métodos ----------------------------------------
    @Override
    public void consultarSaldo() {
        System.out.println("Titular: "+ titular + "\nSaldo=" + saldo);
    }

    // Deixando abstrato pois vai ter funções diferentes nas classes filhas
    @Override
    public abstract void depositar(double valor);
    //scanner... ouve o valor digitado, guarda numa var e soma ao saldo

    // Construtores ----------------------------------------
    public ContaBancaria(){
        // vazio
    }

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria(String titular, double saldo, TipoConta tipoDeConta) {
        this(titular, saldo);
        this.tipoDeConta = tipoDeConta;
    }
}
