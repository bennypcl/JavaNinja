package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados primitivos: int, double, boolean, short, float, char
        * Objetivo da aula: Criar um ninja - Naruto -
        * */

        int idade = 17; // valor máximo de um int: aprox 2bi
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999900099L; // valor máximo de um Long: apox 9tri

        System.out.println(idade); // comando para exibir para o usuário
        System.out.println(saldoBancario); // print com quebra de linha todos tem que ser println
        System.out.println("Saldo Bancário é = " + saldoBancario);

    }
}
