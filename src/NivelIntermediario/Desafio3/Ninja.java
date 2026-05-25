package NivelIntermediario.Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("=== Informações do Ninja: " + nome + " ===" +
                            "\nIdade: " + idade +
                            "\nMissão: "+ missao +
                            "\nNível de dificuldade: " + nivelDeDificuldade +
                            "\nStatus da missão: " + statusMissao);
    }
}
