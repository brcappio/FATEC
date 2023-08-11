/* Bruno Rosa Cappio
*/


import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorMercadoria, totalEstoque = 0;
        int numMercadorias = 0;
        String maisMercadorias;

        do {
            System.out.print("Digite o valor da mercadoria: ");
            valorMercadoria = input.nextDouble();
            totalEstoque += valorMercadoria;
            numMercadorias++;

            System.out.print("MAIS MERCADORIAS (S/N)? ");
            maisMercadorias = input.next();
        } while (maisMercadorias.equalsIgnoreCase("S"));

        double mediaValor = totalEstoque / numMercadorias;

        System.out.printf("Valor total em estoque: R$ %.2f\n", totalEstoque);
        System.out.printf("Média de valor das mercadorias: R$ %.2f\n", mediaValor);
    }
}
