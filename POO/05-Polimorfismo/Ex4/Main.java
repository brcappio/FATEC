import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Midia midia1 = new Midia(1, "Filme 1", "DVD", "Drama", 10.0);
        Midia midia2 = new Midia(2, "Livro 1", "Brochura", "Ficção", 5.0);
        Midia midia3 = new Midia(3, "Jogo 1", "Cartucho", "Ação", 15.0);

        Cliente cliente = new Cliente(1, "João", 25);

        Aluguel aluguel = new Aluguel();

        aluguel.alugarMidia(midia1);
        aluguel.alugarMidia(midia2);
        aluguel.alugarMidia(midia3);

        double valorTotal = aluguel.calcularValorTotal();

        System.out.println("Mídias alugadas:");
        for (Midia midia : aluguel.getMidiasAlugadas()) {
            System.out.println("Código: " + midia.getCodigo());
            System.out.println("Descrição: " + midia.getDescricao());
            System.out.println("Tipo: " + midia.getTipo());
            System.out.println("Gênero: " + midia.getGenero());
            System.out.println("Valor: R$" + midia.getValor());
            System.out.println();
        }
        System.out.println("Valor total: R$" + valorTotal);

        System.out.println("Digite o código da mídia a ser devolvida:");
        int codigoDevolucao = scanner.nextInt();
        for (Midia midia : aluguel.getMidiasAlugadas()) {
            if (midia.getCodigo() == codigoDevolucao) {
                aluguel.devolverMidia(midia);
                System.out.println("Mídia devolvida com sucesso!");
                break;
            }
        }

        double valorTotalAtualizado = aluguel.calcularValorTotal();
        System.out.println("Valor total atualizado: R$" + valorTotalAtualizado);

        scanner.close();
    }
}
