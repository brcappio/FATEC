/* Bruno Rosa Cappio
 * 13) Escreva um programa que imprima o número de consoantes de uma frase fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;

public class Ex13 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine().toUpperCase();
		int contadorConsoante = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if (letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {
				contadorConsoante++;
			}
		}
		
		System.out.println("A quantidade de consoantes eh: " + contadorConsoante);
	}
}

