package NivelIntermediario.Enums;

public enum RankDeMissoes {

    // enums não têm tipagem
    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Difícil", 5),
    S("ALtíssimo", 12);

    private String descricao;
    private int dificuldade;

    // isso é um construtor, acredite.
    RankDeMissoes(String descricao, int dificuldade){
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}



// comentário de linha única.

/*
* Comentário com
* múltiplas linhas.
* */