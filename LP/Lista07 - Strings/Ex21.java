/* Bruno Rosa Cappio
 * 21) Escreva um programa que receba uma frase, imprima cada palavras desta frase em umalinha.
 * 
 * 
 */


import java.util.Scanner;

public class Ex21 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine();
		
		String[] palavras = frase.split(" ");
		
		for (int i = 0; i < palavras.length; i++) {
			String palavra = palavras[i];
			System.out.print(palavra);
		}
	}
}

