/* Bruno Rosa Cappio
 * Ex31.java
31) Escreva um programa para criar um vetor de String AM de dimensão N definida pelo usuário (N<=10). 
* Solicitar a entrada dos N valores String (palavras ou frases).
* Imprimir o vetor AM original. Ordenar o vetor de String AM de forma crescente.
* Imprimir o vetor AM ordenado.
 */

import java.util.Scanner;

public class Ex31 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		
		System.out.print("Digite a dimensao do array de doubles AM: ");
		int tamanhoAM = leia.nextInt();
		while (tamanhoAM < 10) {
			System.out.print("Tamanho de AM deve ser maior ou igual a 10, tente novamente: ");
			tamanhoAM = leia.nextInt();
		}
		
		String AM[] = new String[tamanhoAM];
		
		for(int i = 0; i < tamanhoAM; i++) {
			System.out.print("Digite a string para a posicao " + i + ": ");
			AM[i] = leiaStr.nextLine();		
		}
		
		for (int i = 0; i < tamanhoAM - 1; i++) {
			for (int j = 0; j < tamanhoAM - 1; j++) {
				if (AM[j].charAt(0) > AM[j + 1].charAt(0)) {
					String temp = AM[j];
					AM[j] = AM[j + 1];
					AM[j + 1] = temp;
				}
			}
		}
		
		System.out.println("\nVetor AM ordenado: ");
		for(int i = 0; i < tamanhoAM; i++) {
			System.out.print(AM[i] + " ");		
		}
	}
}

