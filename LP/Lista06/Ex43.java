/* Bruno Rosa Cappio
43) Solicite ao usuário 7 números inteiros e para cada leitura informar o fatorial desse número.
*/

import java.util.Scanner;


public class Ex43 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
	
	for (int i = 1; i <= 7; i++) {
		System.out.print("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		int fatorial = 1;
		for (int j = numero; j > 0; j--) {
			fatorial *= j;
		}
		
		System.out.println("O fatorial de " + numero + " é " + fatorial);
	}
	}
}

