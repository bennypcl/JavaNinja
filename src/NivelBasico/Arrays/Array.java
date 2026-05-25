package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo referência
        // String inicializa como null
        String[] ninjas = new String[6]; // Pode ser String ninja []; MAS SEGUE A BOA PRÀTICA
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuga";
        ninjas[4] = "Kakashi Hatake";
        System.out.println("Este é o endereço/referência de memória de um Array do tipo String: " + ninjas); // Assim é retornado o endereço de referência do Array
        System.out.println(ninjas[5]);

        // Redeclarar
        String nomeNinja = "Naruto Uzumaki";
        nomeNinja = "Boruto Uzumaki";
        System.out.println(nomeNinja);

        // int inicializa como 0
        int[] idade = new int[2];
        System.out.println("Este é o endereço/referência de memória de um Array do tipo int: " + idade);
        System.out.println(idade[0]);

        // double inicializa como 0.0
        double[] flutuante = new double[1];
        System.out.println("Este é o endereço/referência de memória de um Array do tipo double: " + flutuante);
        System.out.println(flutuante[0]);

        // boolean inicializa como false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println("Este é o endereço/referência de memória de um Array do tipo boolean: " + verdadeiroOuFalso);
        System.out.println(verdadeiroOuFalso[0]);


        System.out.println("------------ Teste de laço ------------");

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }

        // Também pode ser desse jeito
        /*
        * for (String ninja : ninjas) {
        *   System.out.println(ninja);
        * }
        * */
    }
}
