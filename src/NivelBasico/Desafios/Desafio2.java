package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        /*
        * Desafio 2 - Cadastro de ninjas
        * Objetivo: criar um sistema simples de cadastro de novos ninjas e listagem de todos os ninjas cadastrados
        * Topicos a serem utilizados: Arrays, Switch Cases, Loops e Condicionais.
        * */

        Scanner scanner = new Scanner(System.in);

        String[] ninjas = new String[10];

        int ninjasCadastrados = 0;
        int acao = 0;

        while (acao != 3) {
            // Menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            acao = scanner.nextInt();
            scanner.nextLine(); // resolução do bug de quebra de linha no buffer

            switch (acao) {
                case 1:
                    // Caso de cadastro
                    if (ninjasCadastrados < ninjas.length){
                        System.out.print("Digite a seguir o nome do ninja: ");
                        String nomeDoNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeDoNinja;
                        System.out.println("Ninja cadastrado com sucesso!");
                        ninjasCadastrados++;
                    } else {
                        System.out.println("Lista de ninjas cheia, impossível cadastrar novo ninja.");
                    }
                    break;

                case 2:
                    // Caso de listagem
                    System.out.println("Listando todos os ninjas cadastrados:");
                    for (int i = 0; i < ninjasCadastrados; i++) {
                        System.out.println(ninjas[i]);
                    }
                    break;

                case 3:
                    // Caso de saída da aplicação
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    // Caso inválido
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        // Sempre é necessário fechar o scanner aberto
        scanner.close();
    }
}
