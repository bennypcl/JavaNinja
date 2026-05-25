package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        // sem usar construtores
        Hokages Hashirama = new Hokages();
        Hashirama.nome = "Hashirama";
        System.out.println(Hashirama.nome);

        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages(40);

        Hokages Minato = new Hokages("Minato Namikaze", 30, false);

        Hokages Tsunade = new Hokages("Tsunade", 60,
                true, "Aldeia da Folha", 10,
                0.00, 1.60);

    }
}
