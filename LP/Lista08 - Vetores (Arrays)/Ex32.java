/* Bruno Rosa Cappio
 * 32) Escreva um programa para solicitar a entrada de um valor String(frases). Calcular a quantidade de palavras desta frase. Criar um vetor de String AN de dimensão N, sendo N a quantidade de palavras da frase.Colocar uma palavra em cada posição do vetor AN. Imprimir o vetor ANoriginal. Ordenar o vetor de String AN de forma crescente. Imprimir o vetorAN ordenado.
 * Ex32.java
 */

import java.util.Scanner;

public class Ex32 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine();
		
		String palavras[] = frase.split(" ");
		
		System.out.println("Frase: " + frase);
		System.out.println("Quantidade de palavras: " + palavras.length);
		
		String AN[] = new String[palavras.length];
		
		for (int i = 0; i < AN.length; i++) {
			AN[i] = palavras[i];
		}
		
		System.out.print("\nVetor AN: ");
		for (int i = 0; i < AN.length; i++) {
			System.out.print(AN[i] + " ");
		}
		
		
		for (int i = 0; i < AN.length - 1; i++) {
			for (int j = 0; j < AN.length - 1; j++) {
				if (AN[j].charAt(0) > AN[j + 1].charAt(0)) {
					String temp = AN[j];
					AN[j] = AN[j + 1];
					AN[j + 1] = temp;
				}
			}
		}
		
		System.out.print("\nVetor AN Ordenado: ");
		for (int i = 0; i < AN.length; i++) {
			System.out.print(AN[i] + " ");
		}
	}
}

