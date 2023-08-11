/* Bruno Rosa Cappio
 * 3) Escreva um programa para ler um vetor C de N posições, onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o número de posições e os elementos.
 * 
 * 
 */

import java.util.Scanner;

public class Ex3 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do array (menor que 20): ");
		int tamanhoDoArray = leia.nextInt();
		
		if (tamanhoDoArray <= 20) {
			int C[] = new int[tamanhoDoArray];
		
			for (int i = 0; i < C.length; i++){
				System.out.print("Digite o elemento " + (i + 1) + ": ");
				C[i] = leia.nextInt();
			}
			
			System.out.println("\nOrdem normal:");
			for (int i = 0; i < C.length; i++) {
				System.out.print(C[i] + " ");
			}
			
			System.out.println("\nOrdem invertida:");
			for (int i = tamanhoDoArray - 1; i >= 0; i--) {
				System.out.print(C[i] + " ");
			}
		} else {
			System.out.print("Tamanho deve ser menor ou igual a 20!");
		}
		
	}
}

