package NivelIntermediario.Generics2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // Inicializando nosso Array
    private List<T> ferramentas;

    // Construtor
    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    // Method para colocar ferramentas no Array
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    // Mostrar a lista de ferramentas
    public void mostrarFerramentas(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }
}
