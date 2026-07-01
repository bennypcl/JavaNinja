package NivelIntermediario.Gererics;

public class EquipamentosNinja {
    private String nome;

    // Construtores
    public EquipamentosNinja(){
        //vazio
    }
    public EquipamentosNinja(String nome){
        this.nome = nome;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
