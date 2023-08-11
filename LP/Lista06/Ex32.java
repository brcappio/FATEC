/* Bruno Rosa Cappio
 * 31) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, f
inalizar o programa, caso seja
positivo imprimir a sequência de termos:
0, 2, 4, 6, ...
 */
package ex32;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Digite a quantidade de termos (digite 0 para sair): ");
            n = leia.nextInt();
            if (n < 0) {
                System.out.println("Valor inválido. Tente novamente.");
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(i*2 + ", ");
                }
                System.out.println();
            }
        } while (n != 0);
        
        System.out.println("Programa finalizado.");
    }
}
