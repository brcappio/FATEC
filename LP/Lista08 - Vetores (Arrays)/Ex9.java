/* Bruno Rosa Cappio
 * 9) Escreva um programa para ler 5 elementos do vetor G de inteiros. Criar e imprimir um novo vetor H, tal que, este seja formado pelos elementos pares do vetor G lido. Supor que o vetor poderá não ter nenhum elemento com esta propriedade e neste caso, mostrar uma mensagem e encerrar o programa.
 * 
 * 
 */


import java.util.Scanner;

public class Ex9 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanhoDoArray = 5;
		
		System.out.println("VETOR F: ");
		int G[] = new int[tamanhoDoArray];
		
		for (int i = 0; i < tamanhoDoArray; i++){
			System.out.print("Digite o elemento " + (i + 1) + ": ");
			G[i] = leia.nextInt();
			if (G[i] <= 0) {
				System.out.println("Insira um valor maior que zero!");
				i--;
			}				
		}
									
						
		//Exibe vetor G
		System.out.println("\nVETOR G:");
		for (int i = 0; i < tamanhoDoArray; i++) {
			System.out.print(G[i] + " ");
		}			
		
		int tamanhoH = 0;
		
		for (int i = 0; i < tamanhoDoArray; i++) {
			if (G[i] %2 == 0) {
				tamanhoH++;
			}
		}
		
		if (tamanhoH == 0) {
			System.out.println("Não há elementos pares no vetor G.");
			return; // Encerra o programa
		}

		int H[] = new int[tamanhoH];
		int indexH = 0; // Índice para percorrer o vetor H

		for (int i = 0; i < tamanhoDoArray; i++) {
			if (G[i] % 2 == 0) {
				H[indexH] = G[i];
				indexH++; // Incrementa o índice do vetor H
			}
		}

		// Exibe vetor H
		System.out.println("\nVETOR H:");
		for (int i = 0; i < tamanhoH; i++) {
			System.out.print(H[i] + " ");
		}
									
	}
}



