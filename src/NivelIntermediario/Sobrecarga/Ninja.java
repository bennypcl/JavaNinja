package NivelIntermediario.Sobrecarga;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: adicionar 2 novos atributos missoesConcluidas e rank


    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public void infoNinja(){
        System.out.println("\nNinja: " + nome +
                            "\nAldeia: " + aldeia +
                            "\nIdade: " + idade +
                            "\nMissões Concluídas: " + numeroDeMissoesConcluidas +
                            "\nRank: " + rank +
                            "\n---------------------");
    }

    final void tacarKunai(){
        System.out.println(nome + "tacou uma kunai!");
    }

    public void estrategiaDeBatalha(){
        System.out.println("Eu sou " + nome + " e esta é minha ESTRATEGIA de batalha.");
    }

    // metodo padrao
    public void inteligenciaDeCombate(){
        System.out.println("Eu sou " + nome + " e esta é minha INTELIGENCIA de combate");
    }

    // metodo sobrecarregado
    public void inteligenciaDeCombate(int qi){
        if (qi > 150){
            System.out.println("Seu QI é igual à " + qi + ". E você é um gênio.");
        } else if (qi >= 130) {
            System.out.println("Seu QI é igual à " + qi + ". E você é um ninja promissor.");
        } else {
            System.out.println("Seu QI é igual à " + qi + ". E você precisa melhorar suas estragégias.");
        }
    }

    // Construtores ----------------------------------

    public Ninja(){
        // Contrutor vazio
    }

    // Construtor com os 3 primeiros atributos da classe
    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank){
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Esse é o método toString() para referência de memória.";
    }
}
