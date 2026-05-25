package NivelIntermediario.Desafio5;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria{

    // Métodos ----------------------------------------
    @Override
    public void depositar(double valor) {
//        Scanner campo = new Scanner(System.in);
//        System.out.println("Digite o valor do depósito");
//        valor = campo.nextDouble();

        saldo += valor;

//        campo.close();
    }

    // Construtores ----------------------------------------
    public ContaCorrente() {
    }

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    public ContaCorrente(String titular, double saldo, TipoConta tipoDeConta) {
        super(titular, saldo, tipoDeConta);
    }

}
