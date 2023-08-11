//Bruno Rosa Capppio

public class Flor extends Planta {
    private String cor;

    public Flor(String nome, String especie, String cor) {
        super(nome, especie);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
