/* Bruno Rosa Cappio
 * 5) Escreva um programa para ler 2 vetores de dimensão n (n <= 15) e calcular a soma entre eles gerando um terceiro vetor de mesma dimensão.
 * 
 * 
 */


import java.util.Scanner;

public class Ex5 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o tamanho dos arrays (menor ou igual a 15): ");
		int tamanhoDoArray = leia.nextInt();
		
		if (tamanhoDoArray <= 15) {
			System.out.println("\nVETOR 1: ");
			int vetor1[] = new int[tamanhoDoArray];
		
			for (int i = 0; i < tamanhoDoArray; i++){
				System.out.print("Digite o elemento " + (i + 1) + ": ");
				vetor1[i] = leia.nextInt();
				if (vetor1[i] <= 0) {
					System.out.println("Insira um valor maior que zero!");
					i--;
				}				
			}
			
			System.out.println("\nVETOR 2: ");
			int vetor2[] = new int[tamanhoDoArray];
		
			for (int i = 0; i < tamanhoDoArray; i++){
				System.out.print("Digite o elemento " + (i + 1) + ": ");
				vetor2[i] = leia.nextInt();
				if (vetor2[i] <= 0) {
					System.out.println("Insira um valor maior que zero!");
					i--;
				}				
			}
			
			int vetor3[] = new int[tamanhoDoArray];
		
			for (int i = 0; i < tamanhoDoArray; i++) {
				vetor3[i] = vetor1[i] + vetor2[i];
			}
			
			//Exibe vetor 1
			System.out.println("\nVETOR 1:");
			for (int i = 0; i < tamanhoDoArray; i++) {
				System.out.print(vetor1[i] + " ");
			}
			
			//Exibe vetor 2
			System.out.println("\n\nVETOR 2");
			for (int i = 0; i < tamanhoDoArray; i++) {
				System.out.print(vetor2[i] + " ");
			}
			
			//Exibe vetor 3
			System.out.println("\n\nVETOR 3 (SOMA DO VETOR 1 E VETOR 2):");
			for (int i = 0; i < tamanhoDoArray; i++) {
				System.out.print(vetor3[i] + " ");
			}
			
		} else {
			System.out.print("Tamanho deve ser menor ou igual a 20!");
		}
			
	}
}



