package NivelIntermediario.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    public void mostrarInformacoes(){
        System.out.println("---Informações do ninja: " + nome + "---\n" +
                            "Idade: " + idade + "\n" +
                            "Habilidade: " + habilidade + "\n" +
                            "Especialidade: " + especialidade);
    }

    public void executarHabilidade(){
        System.out.println("O ninja "+ nome + " executou a habilidade " + habilidade +
                " com a especialidade de " + especialidade);
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }
}
