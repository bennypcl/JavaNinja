package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------Naruto--------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 16, 30, 1.80);
        System.out.println("Meu nome é " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println("Na verdade, meu nome é " + naruto.getNome());

        System.out.println("--------------Sasuke--------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 17, 20, 1.80);

    }
}
