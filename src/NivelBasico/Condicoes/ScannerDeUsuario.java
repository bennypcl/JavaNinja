package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDeUsuario {
    public static void main(String[] args) {

        /*
         * Scanner = um jeito de trazer o usuário para dentro da aplicacao
         * Objetivo: O usuário vai criar um ninja e vamos validar os dados
         * */

        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.print("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine(); // o metodo nextLine() so funciona para variaveis do tipo String
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.print("Escreva aqui a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja);

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Este ninja é maior de idade, pode ir em missões fora da aldeia.");
        } else {
            System.out.println("Este ninja é muito novo, precisa de mais treinamento.");
        }

        // Fechar sempre o Scanner
        caixaDeTexto.close();

    }

}
