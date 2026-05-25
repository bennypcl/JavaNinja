package NivelIntermediario.Encapsulamento;

public class Ninja {

    // caso não expecificado se é public, final ou private, é considerado public
    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private double altura;

    // CONSTRUTORES -------------------------------------------------

    public Ninja(){
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }

    // GETTERS E SETTERS -------------------------------------------------
    // relembrando... se tem tipagem (no caso String), deve retornar algo
    public String getNome(){
        return nome;
    }

    // não precisa retornar nada em um setter, então a tipagem é void
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }
}
