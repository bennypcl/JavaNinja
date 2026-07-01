package NivelIntermediario.Generics2;

public class Kunai {
    // Atributos da classe
    private String nome;
    private int tamanho;

    // Construtores
    public Kunai(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // Sobreescrita do method toString
    @Override
    public String toString() {
        return "Kunai: " + nome + "(Tamanho: " + tamanho + ")";
    }
}
