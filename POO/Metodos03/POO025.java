/* Bruno Rosa Cappio
 * 12) [POO-025] Crie um programa que solicite ao usuário um número inteiro. Utilizando métodos, exiba a
sequência dos números perfeito até o número informado.
Entrada: 										Saída:
Entre com um número: 10 						>> 6
Entre com um número: 50 						>> 6 28
Entre com um número: -4 						Erro! Valor inválido.
Entre com um número: 0 							Erro! Valor inválido.
 * 
 * 
 */

import java.util.Scanner;

public class POO025 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        int num = input.nextInt();
        if (num <= 0) {
            System.out.println("Erro! Valor inválido.");
            return;
        }
        System.out.print(">> ");
        for (int i = 2; i <= num; i++) {
            if (ehPerfeito(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean ehPerfeito(int num) {
        int somaDivisores = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                somaDivisores += i;
                if (num / i != i) {
                    somaDivisores += num / i;
                }
            }
        }
        return somaDivisores == num;
    }
}

