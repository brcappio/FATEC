//Bruno Rosa Cappio

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String nome;
    private List<Pessoa> pessoas;

    public Sala(String nome) {
        this.nome = nome;
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala: ").append(nome).append(", Quantidade de Pessoas: ").append(pessoas.size()).append("\n");

        for (Pessoa pessoa : pessoas) {
            sb.append(pessoa).append("\n");
        }

        return sb.toString();
    }
}
