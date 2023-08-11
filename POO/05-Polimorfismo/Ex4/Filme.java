public class Filme extends Midia {
    private String classificacao;
    private int duracao;

    public Filme(int codigo, String descricao, String tipo, String genero, double valor,
                 String classificacao, int duracao) {
        super(codigo, descricao, tipo, genero, valor);
        this.classificacao = classificacao;
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public int getDuracao() {
        return duracao;
    }
}
