package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;

    //Extra - não consegui fazer
    enum tiposDeHabilidades{
        Taijutsu,
        Genjutsu,
        Ninjutsu,
        Katon,
        Rinnegan
    }

    public void mostrarInformacoes() {
        System.out.println("---Informações do ninja: " + nome + "---\n" +
                            "Idade: " + idade + "\n" +
                            "Habilidade: " + habilidade);
    }

    public void executarHabilidade() {
        System.out.println("O ninja "+ nome + " executou a habilidade " + habilidade);
    }

    // Construtor vazio
    public NinjaBasico(){
    }

    // Construtor com todos os atributos
    public NinjaBasico(String nome, int idade, String habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }


}
