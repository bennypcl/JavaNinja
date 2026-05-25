package NivelBasico.Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        /*
        * Criar um programa que represente três ninjas da vila da folha
        * Cada um tem nome, idade, e uma missao atribuída
        * A missao tem um nome, nível de dificuldade e status de conclusão
        * EXTRA: adicionar uma condicional para ninjas menores de 15 anos só poderem concluir missões nível C ou D, maiores podem concluir de qualquer nível
        * */

        // Naruto ---------------------------------------------------------
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 13;
        String nomeDaMissaoNinja1 = "Embate direto com Itachi Uchiha";
        char nivelMissaoNinja1 = 'A';
        String statusConclusaoMissaoNinja1;

        if (idadeNinja1 < 15) {
            if (nivelMissaoNinja1 == 'C' || nivelMissaoNinja1 == 'D'){
                statusConclusaoMissaoNinja1 = "concluída";

            } else {
                statusConclusaoMissaoNinja1 = "não concluída";
            }
        } else {
            statusConclusaoMissaoNinja1 = "concluída";
        } System.out.println("A missão de nível " + nivelMissaoNinja1 +
                " atribuída ao ninja " + nomeNinja1 + " consta o status de "
                + statusConclusaoMissaoNinja1);

        // Sasuke ---------------------------------------------------------
        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 13;
        String nomeDaMissaoNinja2 = "Busca de gato fujão";
        char nivelMissaoNinja2 = 'D';
        String statusConclusaoMissaoNinja2;

        if (idadeNinja2 < 15) {
            if (nivelMissaoNinja2 == 'C' || nivelMissaoNinja2 == 'D'){
                statusConclusaoMissaoNinja2 = "concluída";
            } else {
                statusConclusaoMissaoNinja2 = "não concluída";
            }
        } else {
            statusConclusaoMissaoNinja2 = "concluída";
        } System.out.println("A missão de nível " + nivelMissaoNinja2 +
                " atribuída ao ninja " + nomeNinja2 + " consta o status de "
                + statusConclusaoMissaoNinja2);

        // Sakura ---------------------------------------------------------
        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 13;
        String nomeDaMissaoNinja3 = "Pesquisa botânica na vila da chuva";
        char nivelMissaoNinja3 = 'C';
        String statusConclusaoMissaoNinja3;

        if (idadeNinja3 < 15) {
            if (nivelMissaoNinja3 == 'C' || nivelMissaoNinja3 == 'D'){
                statusConclusaoMissaoNinja3 = "concluída";
            } else {
                statusConclusaoMissaoNinja3 = "não concluída";
            }
        } else {
            statusConclusaoMissaoNinja3 = "concluída";
        } System.out.println("A missão de nível " + nivelMissaoNinja3 +
                " atribuída ao ninja " + nomeNinja3 + " consta o status de "
                + statusConclusaoMissaoNinja3);

    }
}
