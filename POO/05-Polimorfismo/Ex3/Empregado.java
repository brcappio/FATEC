//Bruno Rosa Cappio

public class Empregado extends Candidato {
    private String nomeEmpresa;

    public Empregado(String nome, int idade, String nomeEmpresa) {
        super(nome, idade);
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
}
