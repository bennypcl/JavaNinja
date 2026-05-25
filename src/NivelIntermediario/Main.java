package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.ModoSabioAtivado();

        // Criar o ninja Sasuke - Sasuke é um objeto!!!
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.SharinganAtivado();

        // Criar Sakura
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.AtivarCura();

        // Criar a Hinata
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 18;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.ByakuganAtivado();
        Hinata.PunhoSuave();

        //Criar boruto
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.idade = 10;
        Boruto.aldeia = "Aldeia da Folha";

        Boruto.ModoSabioAtivado();
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();

        /*String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(50);
        System.out.println("Você tem " + Sasuke.idade + " anos, faltam no mínimo "
                + quantoTempoFalta + " anos para se tornar Hokage.");*/

    }
}
