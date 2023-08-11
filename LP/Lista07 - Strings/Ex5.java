/* Bruno Rosa Cappio
 * 5) Escreva um programa que calcule e escreva a quantidade de vezes que o caractere ‘a’
aparece em uma frase fornecida pelo usuário. Nota Importante: para a contagem, o caractere pode ser maiúsculo ou minúsculo.
 * 
 * 
 */

import java.util.Scanner;

public class Ex5 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leiaStr.nextLine();
		
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++) {			
			if (frase.toUpperCase().charAt(i) == 'A'){
				contador++;
			}
		}
		
		System.out.println("A quantidade de vezes que o 'a' aparece eh: " + contador);
	}
}

