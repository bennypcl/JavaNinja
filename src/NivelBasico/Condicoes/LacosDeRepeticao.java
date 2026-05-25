package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de Repetição: repetem infinitamente até o parâmetro for atendido
        * WHILE - FOR
        * */

        // while (condicao) {Tudo aqui vai acontecer}
        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

        while (numeroDeClones <= numeroMaxDeClones) {
            numeroDeClones ++;
            System.out.println("Kage bunshin no jutsu " + numeroDeClones);
        }

        // for () {}
        for (int i = 0; i < 5; i++) {
            System.out.println("Rasengan");
        }

    }
}
