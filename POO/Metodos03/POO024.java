/* Bruno Rosa Cappio
 * 11) [POO-024] Crie um programa que solicite ao usuário um número inteiro. Através de um método que
receba esse número inteiro como parâmetro de entrada, verifique e retorne um valor boolean, que
indicará, caso true que ele é um número perfeito, caso false, que não é.
* 
Entrada: 													Saída:
Entre com um número: 6 										O número 6 é perfeito
Entre com um número: 11 									O número 11 não é perfeito
Entre com um número: -4 									Erro! Valor inválido.
Entre com um número: 0 										Erro! Valor inválido.
 * 
 * 
 */

import java.util.Scanner;

public class POO024 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Entre com um numero: ");
		int num = leia.nextInt();
		
		if (num <= 0) {
			System.out.println("Erro! Valor invalido.");
		} else {
			if (verificaNum(num)) {
				System.out.println("O numero " + num + " eh perfeito");
			} else {
				System.out.println("O numero " + num + " nao eh perfeito");
			}
		}		
	}
	
	static boolean verificaNum(int num) {
		int somaDivisores = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == num;
	}
}

