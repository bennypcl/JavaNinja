package NivelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Konohamaru = new NinjaBasico("Konohamaru",
                                                13,
                                                "Rasengan");

        NinjaAvancado Jiraya = new NinjaAvancado("Jiraya",
                                                43,
                                                "Rasengan",
                                                "Modo Sábio");

        Konohamaru.mostrarInformacoes();
        Jiraya.mostrarInformacoes();

        Konohamaru.executarHabilidade();
        Jiraya.executarHabilidade();
    }
}
