/* Bruno Rosa Cappio
 * 19) Escreva um programa que leia uma cadeia de caracteres qualquer é determine se a palavra lida representa um palíndromo ou não (exemplo de palavras palíndromas: ovo, natan, sos, arara, etc).
 * 
 * 
 */


import java.util.Scanner;

public class Ex19 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine();
		String testaFrase = "";
				
		
		for (int i = 0; i < frase.length(); i++) {
			testaFrase = frase.charAt(i) + testaFrase;
		}
				
		boolean isPalindromo = frase.equalsIgnoreCase(testaFrase);
		
		System.out.println(testaFrase);
		System.out.println(isPalindromo? "A frase eh palindromo": "A frase NAO eh palindromo");

	}
}

