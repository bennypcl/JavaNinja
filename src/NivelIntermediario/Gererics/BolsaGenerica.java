package NivelIntermediario.Gererics;
import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    // Construtores ------------------
    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    // Colocar equipamentos Genericos
    public void adicionarEquipamentos (T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    // Getters e Setters ------------------
    public List<T> getEquipamentos(){
        return equipamentos;
    }
    public void setEquipamentos(List<T> equipamentos){
        this.equipamentos = equipamentos;
    }

    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
