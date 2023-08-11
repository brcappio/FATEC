//Bruno Rosa Cappio

public class Desempregado extends Candidato {
    private int mesesDesempregado;

    public Desempregado(String nome, int idade, int mesesDesempregado) {
        super(nome, idade);
        this.mesesDesempregado = mesesDesempregado;
    }

    public int getMesesDesempregado() {
        return mesesDesempregado;
    }
}
