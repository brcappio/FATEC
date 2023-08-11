public class Livro extends Midia {
    private String autor;
    private String editora;
    private int edicao;

    public Livro(int codigo, String descricao, String tipo, String genero, double valor,
                 String autor, String editora, int edicao) {
        super(codigo, descricao, tipo, genero, valor);
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getEdicao() {
        return edicao;
    }
}
