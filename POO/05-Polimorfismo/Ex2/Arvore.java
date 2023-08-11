//Bruno Rosa Capppio

public class Arvore extends Planta {
    private boolean frutifera;

    public Arvore(String nome, String especie, boolean frutifera) {
        super(nome, especie);
        this.frutifera = frutifera;
    }

    public boolean isFrutifera() {
        return frutifera;
    }
}
