/* Bruno Rosa Cappio
 * 39) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor
ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos:
1/50 + 2/49, 3/48 + ... + 50/1.
Exemplo com entrada de 50 termos.
Apresentar a soma desta sequência no final.
 */
package ex39;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double soma = 0;

        System.out.print("Digite a quantidade de termos: ");
        int n = leia.nextInt();

        while (n <= 0) {
            System.out.print("Quantidade inválida. Digite novamente: ");
            n = leia.nextInt();
        }

        for (int i = 1, j = 50; i <= 50 && j >= 1; i++, j--) {
            double termo = (double)i/j;
            System.out.printf("%d/%d = %.2f\n", i, j, termo);
            soma += termo;
        }

        System.out.printf("Soma dos termos: %.2f", soma);
        System.out.println();
    }
}

