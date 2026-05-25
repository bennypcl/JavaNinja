package NivelIntermediario;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    // Criar um metodo personalidado

    /*
    * Metodo String vai ter que retornar uma String
    * */
    public String euSouUmNinja(){
        return "Oi, eu sou um ninja!";
    }

    /*
    * Metodo int vai ter que retornar um int
    * */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
