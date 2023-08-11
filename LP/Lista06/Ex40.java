/*
 * 40) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos:
1, 2, 3, ..., 10, 10, 9, 8, ..., 1 .Exemplo com entrada de 20 termos

 */
package ex40;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite a quantidade de termos: ");
            n = leia.nextInt();
        } while (n < 0);
        
        for (int i = 1; i <= n/2; i++) {
            System.out.print(i + " ");
        }
        for (int i = 10; i >= 1; i--) {
            if (n > 10) {
                System.out.print(i + " ");
            } else if (n == 10) {
                System.out.print(i + " ");
            } else {
                if (i > 10 - n) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
