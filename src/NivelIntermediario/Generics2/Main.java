package NivelIntermediario.Generics2;

public class Main {
    public static void main(String[] args) {

        // Object é uma superclasse usada para trabalhar com vários tipos
        BolsaNinja<Object> bolsaNinjaNaruto = new BolsaNinja<>();

        // Observar que dentro do array iniciamos um novo tipo de objeto
        bolsaNinjaNaruto.adicionarFerramenta(new Kunai("Kunai do Minato", 20));
        bolsaNinjaNaruto.adicionarFerramenta(new Pergaminho("Jardim dos amaços: Versão do diretor", "Jiraya é o melhor!"));
        bolsaNinjaNaruto.adicionarFerramenta(new Shuriken("Shuriken do Vento", 5));

        bolsaNinjaNaruto.mostrarFerramentas();
    }
}
