package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternários: maneiras de diminuir o código
        * Funciona como uma condicional
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        * */

        short numeroDeMissoes = 2;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Este ninja já atingiu 10 missões" : "Este ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);
    }
}
