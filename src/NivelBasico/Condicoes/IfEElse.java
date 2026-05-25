package NivelBasico.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        * If e Else - NivelBasico.Condicoes
        * ElseIf
        * Objetivo: Passar o ninja de nível de acordo com o numero de missoes
        * */

        // Ninja naruto
        String nome = "Naruto Uzumaki";
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 1;
        String rank;

        // se (condicao) {faça isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        }
        else if (numeroDeMissoes >= 20){ // pode-se dizer que o else-if dá mais importancia para uma certa condicional
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
