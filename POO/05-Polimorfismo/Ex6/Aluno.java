//Bruno Rosa Cappio

public class Aluno extends Pessoa {
    private String curso;
    private double mensalidade;

    public Aluno(String nome, int idade, String curso, double mensalidade) {
        super(nome, idade);
        this.curso = curso;
        this.mensalidade = mensalidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso + ", Mensalidade: " + mensalidade;
    }
}
