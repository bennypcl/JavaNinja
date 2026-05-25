package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
    // Tudo que for digitado aqui dentro com o comando psvm vai ser compilado pelo Java

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir métodos a ele
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // este metodo coloca tudo em caps lock
        System.out.println(nomeUpperCase);
        System.out.println(nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); // este metodo coloca tudo em caixa baixa
        System.out.println(aldeiaLowerCase);

    }

}
