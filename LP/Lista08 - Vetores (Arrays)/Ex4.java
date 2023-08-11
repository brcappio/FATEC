/* Bruno Rosa Cappio
 * 4) Escreva um programa para ler um vetor D de N posições, onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o número de posições e os elementos. O programa deve validar a quantidade de posições, não permitindo que o usuário forneça um valor inválido.
 * 
 * 
 */

import java.util.Scanner;

public class Ex4 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do array (menor que 20): ");
		int tamanhoDoArray = leia.nextInt();
		
		if (tamanhoDoArray <= 20) {
			int D[] = new int[tamanhoDoArray];
		
			for (int i = 0; i < D.length; i++){
				System.out.print("Digite o elemento " + (i + 1) + ": ");
				D[i] = leia.nextInt();
				if (D[i] <= 0) {
					System.out.println("Insira um valor maior que zero!");
					i--;
				}				
			}
			
			System.out.println("\nOrdem normal:");
			for (int i = 0; i < D.length; i++) {
				System.out.print(D[i] + " ");
			}
			
			System.out.println("\nOrdem invertida:");
			for (int i = tamanhoDoArray - 1; i >= 0; i--) {
				System.out.print(D[i] + " ");
			}
		} else {
			System.out.print("Tamanho deve ser menor ou igual a 20!");
		}
		
	}
}

