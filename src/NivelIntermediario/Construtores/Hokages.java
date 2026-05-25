package NivelIntermediario.Construtores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuMorto;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokages(){
        //construtor vazio
    }

    // Criar construtor com argumento
    public Hokages(String nome){
        this.nome = nome;
    }

    public Hokages(int idade){
        this.idade = idade;
    }

    public Hokages(String nome, int idade, boolean vivoOuMorto){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }

    // Atalho: alt+insert
    public Hokages(String nome, int idade, boolean vivoOuMorto,
                   String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
