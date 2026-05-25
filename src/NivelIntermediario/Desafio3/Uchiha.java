package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("O ninja " + nome + " usou a habilidade: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }
}
