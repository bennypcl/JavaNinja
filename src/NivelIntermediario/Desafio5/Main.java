package NivelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente naruto = new ContaCorrente("Naruto", 100);

        System.out.println("Naruto");
        System.out.println("Antes de depositar");
        naruto.consultarSaldo();
        naruto.depositar(70.20);

        System.out.println("\nDepois de depositar");
        naruto.consultarSaldo();

        ContaPoupanca sakura = new ContaPoupanca("Sakura", 200);
        System.out.println("\nSakura");
        sakura.consultarSaldo();
        sakura.depositar(100);
        sakura.consultarSaldo();
    }
}
