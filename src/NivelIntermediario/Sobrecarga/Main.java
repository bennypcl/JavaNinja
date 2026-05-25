package NivelIntermediario.Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki",
                                    "Aldeia da Folha",
                                    15,
                                    30,
                                    NivelNinja.GENIN
        );
        naruto.humildadeUzumaki();
        naruto.infoNinja();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha",
                                    "Aldeia da Folha",
                                    16,
                                    12,
                                    NivelNinja.GENIN
        );
        sasuke.orgulhoUchiha();
        sasuke.sharinganAtivado();
        sasuke.infoNinja();

        Uchiha madara = new Uchiha("Madara Uchiha",
                                    "Aldeia da Folha",
                                    45,
                                    200,
                                    NivelNinja.KAGE
        );
        madara.orgulhoUchiha();
        madara.infoNinja();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(100);

        System.out.println("\n---------- Naruto ----------");
        System.out.println(naruto);
    }
}
