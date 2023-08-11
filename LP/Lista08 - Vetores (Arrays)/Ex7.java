/* Bruno Rosa Cappio
 * 7) Escreva um programa para ler um vetor E (de inteiros), de tamanho N (N <= 20), determinar e imprimir o maior e o menor elemento deste vetor.
 * 
 * 
 */


import java.util.Scanner;

public class Ex7 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o tamanho dos arrays (menor ou igual a 20): ");
		int tamanhoDoArray = leia.nextInt();
		
		int menor, maior;
		
		if (tamanhoDoArray <= 20) {
			
			//Forma vetor E
			System.out.println("\nVETOR E: ");
			int E[] = new int[tamanhoDoArray];
		
			for (int i = 0; i < tamanhoDoArray; i++){
				System.out.print("Digite o elemento " + (i + 1) + ": ");
				E[i] = leia.nextInt();
				if (E[i] <= 0) {
					System.out.println("Insira um valor maior que zero!");
					i--;
				}				
			}
									
						
			//Exibe vetor E
			System.out.println("\nVETOR E:");
			for (int i = 0; i < tamanhoDoArray; i++) {
				System.out.print(E[i] + " ");
			}
			
			maior = E[0];
			menor = E[0];
			for (int i = 0; i < tamanhoDoArray; i++) {
				if (E[i] > maior) {
					maior = E[i];
				}
				if (E[i] < menor) {
					menor = E[i];
				}
			}
			
			System.out.println("\n\nMenor numero do vetor: " + menor);
			System.out.println("Maior numero do vetor: " + maior);		
		}					
	}
}



