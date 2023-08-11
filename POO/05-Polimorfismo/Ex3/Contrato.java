//Bruno Rosa Cappio

public class Contrato extends Vaga {
    private boolean temporario;

    public Contrato(String descricao, double salario, boolean temporario) {
        super(descricao, salario);
        this.temporario = temporario;
    }

    public boolean isTemporario() {
        return temporario;
    }

    @Override
    public String getTipoVaga() {
        return "Contrato";
    }
}
