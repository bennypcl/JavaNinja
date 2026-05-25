package NivelIntermediario.Listas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Arrays
        // são estáticos, não mudam de tamanho
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        // Listas
        // são dinâmicas, podem mudar de tamanho
        List<String> ninjasList = new ArrayList<>();

        // adicionando elementos
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Kakashi Hatake");
        ninjasList.add("Might Guy");

        System.out.println("ninjasList = " + ninjasList);

        // removendo elemento
        ninjasList.remove("Might Guy");

        System.out.println("ninjasList = " + ninjasList);

        // alterando elemento
        ninjasList.set(1, "Sai");

        System.out.println("ninjasList = " + ninjasList);

        // verificando o tamanho (la ele)
        System.out.println("Número de elementos: " + ninjasList.size());

        // verificando se um objeto está dentro da Lista
        System.out.println(ninjasList.contains("Naruto Uzumaki"));

        System.out.println(ninjasList.get(2));

        System.out.println(ninjasList.hashCode());

        System.out.println(ninjasList.isEmpty());
    }
}
