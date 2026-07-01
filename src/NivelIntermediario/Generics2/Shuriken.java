package NivelIntermediario.Generics2;

public class Shuriken {
    // Atributos da classe
    private String nome;
    private int tamanho;

    // Construtores
    public Shuriken(String nome, int tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }

    //Getters e Setters
    public String getNomeShuriken(){
        return nome;
    }
    public int getTamanhoShuriken(){
        return tamanho;
    }
    public void setNomeShuriken(String nome){
        this.nome = nome;
    }
    public void setTamanhoShuriken(int tamanho){
        this.tamanho = tamanho;
    }

    // Sobreescrita do method toString
    public String toString(){
        return "Shuriken: " + nome + "(Tamanho: " + tamanho + ")";
    }
}
