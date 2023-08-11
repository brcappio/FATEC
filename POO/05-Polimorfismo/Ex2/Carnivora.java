//Bruno Rosa Capppio

public class Carnivora extends Planta {
    private boolean venenosa;

    public Carnivora(String nome, String especie, boolean venenosa) {
        super(nome, especie);
        this.venenosa = venenosa;
    }

    public boolean isVenenosa() {
        return venenosa;
    }
}
