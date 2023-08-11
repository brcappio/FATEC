public class Midia {
    private int codigo;
    private String descricao;
    private String tipo;
    private String genero;
    private double valor;

    public Midia(int codigo, String descricao, String tipo, String genero, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.genero = genero;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public double getValor() {
        return valor;
    }
}
