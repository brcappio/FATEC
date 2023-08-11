//Bruno Rosa Cappio

public class Estagio extends Vaga {
    private int mesesDuracao;

    public Estagio(String descricao, double salario, int mesesDuracao) {
        super(descricao, salario);
        this.mesesDuracao = mesesDuracao;
    }

    public int getMesesDuracao() {
        return mesesDuracao;
    }

    @Override
    public String getTipoVaga() {
        return "Estágio";
    }
}
