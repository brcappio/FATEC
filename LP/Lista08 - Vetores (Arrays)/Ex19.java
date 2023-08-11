/* Bruno Rosa Cappio
 * 19) Escreva um programa para ler um vetor Z de 10 posições com elementos fornecidos pelo usuário e colocar os elementos em ordem crescente. Ao final imprimir o vetor Z ordenado.
 * 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;

public class Ex19 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int Z[] = new int[10];
		
		for (int i = 0; i < Z.length; i++) {
			System.out.print("Digite o elemento da posicao " + i + ": ");
			Z[i] = leia.nextInt();
		}
				
		Arrays.sort(Z);
		System.out.println("\n\nVetor Z em ordem crescente: ");
		for (int i = 0; i < Z.length; i++) {
			System.out.print(Z[i] + " ");
		}
	}
	
}



