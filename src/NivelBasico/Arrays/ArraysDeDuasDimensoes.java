package NivelBasico.Arrays;

public class ArraysDeDuasDimensoes {
    public static void main(String[] args) {
        String[][] timesNinja = new String[3][4];

        timesNinja[0][0] = "Kakashi Hatake";
        timesNinja[0][1] = "Naruto Uzumaki";
        timesNinja[0][2] = "Sasuke Uchiha";
        timesNinja[0][3] = "Sakura Haruno";

        timesNinja[1][0] = "Asuma Sarutobi";
        timesNinja[1][1] = "Shikamaru Nara";
        timesNinja[1][2] = "Choji Inosuke";
        timesNinja[1][3] = "Ino Iamanaka";

        timesNinja[2][0] = "Might Guy";
        timesNinja[2][1] = "Rock Lee";
        timesNinja[2][2] = "Neji Hyuuga";
        timesNinja[2][3] = "Tenten ";

        System.out.println("\n"); // totalmente besteira pra deixar a saída do console bonitinha

        for (int i = 0; i < timesNinja.length; i++) {
            System.out.println("O time do jounin " + timesNinja[i][0] + " é composto por:\n" + timesNinja[i][1] + "\n"
                                                                                            + timesNinja[i][2] + "\n"
                                                                                            + timesNinja[i][3]);
            System.out.println("=====================================");
        }
        /*
        *  Outra forma de fazer o mesmo seria usando um for iterando dentro de outro for:
        *  Enquanto o for "mais de fora" itera sobre os jounins, o mais de "dentro" itera sobre os subordinados do
        *  jounin do for externo.
        * */

    }
}
