/* Bruno Rosa Cappio
 * 8) Escreva um programa para ler uma frase fornecida pelo usuário e contar a quantidade de cada caractere do alfabeto,
 * imprimindo ao final uma listagem onde consta o caractere e na frente a quantidade de ocorrências.
 * Caso a quantidade de ocorrências de um caractere seja zero, não apresentar o caractere na listagem.
 * Não diferenciar maiúsculo de minúsculo
 * 
 * 
 */

import java.util.Scanner;

public class Ex8 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leiaStr.nextLine().toUpperCase();
		
		int contador = 0;
		
		for (char letra = 'A'; letra <= 'Z'; letra++) {	
								
			contador = 0;
			
			for (int i = 0; i < frase.length(); i++) {
				
				if (frase.charAt(i) == letra) {
					contador++;
				}
			}
			
			if(contador != 0){
				System.out.println(letra + " - " + contador);
			}
		}
		
		
	}
}

