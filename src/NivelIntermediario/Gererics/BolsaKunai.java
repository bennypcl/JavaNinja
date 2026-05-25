package NivelIntermediario.Gererics;

import java.util.List;

public class BolsaKunai {
    private List<Kunai> kunais;

    public BolsaKunai(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    @Override
    public String toString() {
        return "Bolsa de Kunais: " + kunais.toString();
    }
}

