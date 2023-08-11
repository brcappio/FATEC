/* Bruno Rosa Cappio
 * 18) Desenvolva um programa que leia uma cadeia de caracteres e através de uma mensagem indique se esta cadeia representa uma sequência binária de 8 bit’s ou não.
 * Ex:
 * - não é uma sequência de 8bit’s: 01101, 10192898, 10001jaA
 * - é uma sequência de 8bit’s: 01101011, 10110101, 10000000
 * 
 * 
 */


import java.util.Scanner;

public class Ex18 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine();
				
		boolean is8bit = false;
		int count = 0;
		
		if (frase.length() == 8) {
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == 48 || frase.charAt(i) == 49) {
					is8bit = true;
				}
			}
		}		
				
		System.out.println(is8bit? "A sequencia eh binaria de 8 bits": "A sequencia NAO eh binaria de 8 bits");

	}
}

