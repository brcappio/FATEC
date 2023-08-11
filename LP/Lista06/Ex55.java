/* Bruno Rosa Cappio
 * 55) Solicite um número inteiro ao usuário e informe se o número é perfeito ou não.
 */

import java.util.Scanner;

public class Ex55 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		int soma = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				soma += i;
			}
		}
		
		if (soma == numero) {
			System.out.println(numero + " é um número perfeito.");
		} else {
			System.out.println(numero + " não é um número perfeito.");
		}
		
	}
}
