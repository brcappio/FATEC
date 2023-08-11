/* Bruno Rosa Cappio
 * 21) Escreva um programa para ler um vetor AB de 10 posições com elementos fornecidos pelo usuário. Para cada elemento ímpar encontrado, multiplique ele por dois, gerando assim um vetor de elementos pares e ao final exiba o resultado.
 * 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;

public class Ex21 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int AB[] = new int[10];
		
		for (int i = 0; i < AB.length; i++) {
			System.out.print("Digite o elemento da posicao " + i + ": ");
			int num = leia.nextInt();
			if (num %2 != 0) {
				num *= 2;
				AB[i] = num;
			} else {
				AB[i] = num;
			}
		}
				
		
		System.out.println("\n\nVetor AB: ");
		for (int i = 0; i < AB.length; i++) {
			System.out.print(AB[i] + " ");
		}
		
		
		//Extra
		Arrays.sort(AB);
		System.out.println("\n\nVetor AB em ordem crescente: ");
		for (int i = 0; i < AB.length; i++) {
			System.out.print(AB[i] + " ");
		}
	}
	
}



