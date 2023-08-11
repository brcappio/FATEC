/* Bruno Rosa Cappio
 * 20) Escreva um programa que receba uma frase, conte e imprima o número de palavras desta frase.
 * 
 * 
 */


import java.util.Scanner;

public class Ex20 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine();
		int countPalavras = 0;
		
		if (frase.length() != 0) {
			countPalavras = 1;
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == 32){
					countPalavras++;
				}
			}
		}
						
		System.out.println("A frase possui " + countPalavras + " palavras");

	}
}

