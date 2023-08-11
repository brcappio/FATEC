/*
 * 35) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos:
1,-1, 2,-2, 3,-3, ...
 */
package ex35;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite a quantidade de termos (ou zero para sair): ");
            n = leia.nextInt();

            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + ", -" + i + ", ");
                }
                System.out.println();
            } else if (n < 0) {
                System.out.println("A quantidade de termos deve ser positiva!");
            }
        } while (n != 0);
    }
}

