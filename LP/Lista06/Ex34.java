/* Bruno Rosa Cappio
 * 34) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o program
a, caso seja positivo imprimir a sequência de termos:
0, 1, 3, 6, 10, 15, ...
 */
package ex34;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite a quantidade de termos (zero ou negativo para sair): ");
            n = leia.nextInt();
        } while (n < 0);

        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(soma + ", ");
            soma += i + 1;
        }

        leia.close();
    }
}
