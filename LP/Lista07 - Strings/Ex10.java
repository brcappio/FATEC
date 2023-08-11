/* Bruno Rosa Cappio
 * 10) Escreva um programa que calcule e escreva a quantidade de letras maiúsculas de uma frase fornecida pelo usuário.
 * 
 * 
 */


import java.util.Scanner;

public class Ex10 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leiaStr.nextLine();
		String testeFrase = frase.toUpperCase();
		
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);
			
			if (Character.isUpperCase(caracter)) {
				contador++;
			}
		}
		
		System.out.println("Quantidade de letras maiusculas: " + contador);
	}
}

