/* Bruno Rosa Cappio
 * 9) Fazer um programa para contar quantos espaços em branco existem em uma frase fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;

public class Ex9 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leiaStr.nextLine();		
		
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
				
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}
		
		System.out.println("Quantidade de espacos em branco: " + contador);
	}
}

