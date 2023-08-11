//Bruno Rosa Cappio

public abstract class Vaga {
    private String descricao;
    private double salario;

    public Vaga(String descricao, double salario) {
        this.descricao = descricao;
        this.salario = salario;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getSalario() {
        return salario;
    }

    public abstract String getTipoVaga();
}
