/* Bruno Rosa Cappio
 * 20) Escreva um programa para ler um vetor AA de 10 posições com elementos fornecidos pelo usuário e colocar os elementos em ordem decrescente. Ao final imprimir o vetor Z ordenado
 * 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;

public class Ex20 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int AA[] = new int[10];
		
		for (int i = 0; i < AA.length; i++) {
			System.out.print("Digite o elemento da posicao " + i + ": ");
			AA[i] = leia.nextInt();
		}
				
		Arrays.sort(AA);
		System.out.println("\n\nVetor AA em ordem decrescente: ");
		for (int i = AA.length - 1; i >= 0; i--) {
			System.out.print(AA[i] + " ");
		}
	}
	
}



