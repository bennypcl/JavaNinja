package NivelIntermediario.Sobrecarga;

public class Uzumaki extends Ninja{
    public void humildadeUzumaki(){
        System.out.println("Eu sou " + nome + " e tô de boa.");
    }

    @Override
    public void estrategiaDeBatalha(){
        System.out.println("Eu sou " + nome + " e esta é minha ESTRATEGIA de batalha.");
    }

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Eu sou " + nome + " e esta é minha INTELIGENCIA de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        if (qi > 150){
            System.out.println("Seu QI é igual à " + qi + ". E você é um gênio.");
        } else if (qi >= 130) {
            System.out.println("Seu QI é igual à " + qi + ". E você é um ninja promissor.");
        } else {
            System.out.println("Seu QI é igual à " + qi + ". E você precisa melhorar suas estragégias.");
        }
    }

    // Construtores -----------------------------------

    public Uzumaki(){
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

}
