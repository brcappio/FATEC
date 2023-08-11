/* Bruno Rosa Cappio
 * 6) Escreva um programa que calcule e escreva a quantidade de vezes que um caractere fornecido pelo usuário aparece em uma frase, também, fornecida pelo mesmo. Nota Importante: para a contagem, o caractere pode ser maiúsculo ou minúsculo.
 * 
 */

import java.util.Scanner;

public class Ex6 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leiaStr.nextLine();
		
		System.out.print("Digite um caracter: ");
		char caracter = Character.toUpperCase(leiaStr.next().charAt(0));
		
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.toUpperCase().charAt(i) == caracter) {
				contador++;
			}
		}
		
		System.out.printf("A quantidade de vezes que o caracter '%c' aparece eh: %d", caracter, contador);
		
		//System.out.println("A quantidade de vezes que o " + caracter + " aparece eh: " + contador);
	}
}

