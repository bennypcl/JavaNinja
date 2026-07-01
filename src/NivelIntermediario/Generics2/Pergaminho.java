package NivelIntermediario.Generics2;

public class Pergaminho {
    // Atributos da classe
    private String titulo;
    private String conteudo;

    // Contrutores
    public Pergaminho(String titulo, String conteudo){
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    // Getters e Setters
    public String getTituloPergaminho(){
        return titulo;
    }
    public String getConteudoPergaminho(){
        return conteudo;
    }
    public void setTituloPergaminho(String titulo){
        this.titulo = titulo;
    }
    public void setConteudoPergaminho(String conteudo){
        this.conteudo = conteudo;
    }

    @Override
    public String toString(){
        return "Pergaminho: " + titulo;
    }
}
