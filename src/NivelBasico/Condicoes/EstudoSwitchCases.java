package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: servem para gerar casos específicos
        * Objetivo: Pedir para o usuário escolher entre os ninjas
        * switchCase
        * */

        // Abrindo a nossa "caixa"
        Scanner scanner = new Scanner(System.in);

        // Mostrando as opções para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuário escolher uma das opções
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        // Reação ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // Fechando a "caixa"
        scanner.close();

    }
}
