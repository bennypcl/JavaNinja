package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // inicializando o objeto
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Recuperar amuleto cristal";
        sasuke.nivelDeDificuldade = "Alta";
        sasuke.statusMissao = "Em andamento";

        sasuke.mostrarInformacoes();

        /*Scanner scanner = new Scanner(System.in);

        String[][] ninjas = new String[3][6];
        int numeroDeNinjas = 0;
        int opcao = 0;


        while (opcao != 4){
            System.out.println("============ Menu ============");
            System.out.println("1. Adicionar novo ninja.");
            System.out.println("2. Exibir informações de todos os ninjas.");
            System.out.println("3. Editar habilidade especial.");
            System.out.println("4. Sair.");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do ninja: ");
                    String nomeNinja = scanner.nextLine();


                    System.out.print("Digite a idade do ninja: ");
                    System.out.print("Digite a missao do ninja: ");
                    System.out.print("Digite o nivel da missão: ");
                    System.out.print("Digite o status da missão: ");
                case 2:
                case 3:
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
            }


        }
        scanner.close();*/
    }
}
