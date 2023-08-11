//Bruno Rosa Cappio

public class Professor extends Pessoa {
    private double salario;
    private String disciplina;

    public Professor(String nome, int idade, double salario, String disciplina) {
        super(nome, idade);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario + ", Disciplina: " + disciplina;
    }
}
