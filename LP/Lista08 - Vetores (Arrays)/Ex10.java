/* Bruno Rosa Cappio
 * 10) Escreva um programa para ler dois vetores PA e PB de inteiros de 5 elementos e imprimir os vetores lidos. Construir outro vetor PC de tamanho 10, com todos os elementos lidos de PA e de PB e imprimir este vetor obtido. (Concatenação)
 * 
 * 
 */


import java.util.Scanner;

public class Ex10 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanhoDoArray = 5;
		int tamanhoDoArrayPC = 10;
		
		System.out.println("VETOR PA: ");
		int PA[] = new int[tamanhoDoArray];
		
		//Monta vetor PA
		for (int i = 0; i < tamanhoDoArray; i++){
			System.out.print("Digite o elemento " + (i + 1) + ": ");
			PA[i] = leia.nextInt();
			if (PA[i] <= 0) {
				System.out.println("Insira um valor maior que zero!");
				i--;
			}				
		}
		
		System.out.println("\nVETOR PB: ");
		int PB[] = new int[tamanhoDoArray];
		
		//Monta vetor PB
		for (int i = 0; i < tamanhoDoArray; i++){
			System.out.print("Digite o elemento " + (i + 1) + ": ");
			PB[i] = leia.nextInt();
			if (PB[i] <= 0) {
				System.out.println("Insira um valor maior que zero!");
				i--;
			}				
		}
		
		System.out.println("\nVETOR PC: ");
		int PC[] = new int[tamanhoDoArrayPC];
		int indexPC = 0;

		// Monta vetor PC
		for (int i = 0; i < tamanhoDoArray; i++) {
			PC[indexPC] = PA[i];
			indexPC++;
		}

		for (int i = 0; i < tamanhoDoArray; i++) {
			PC[indexPC] = PB[i];
			indexPC++;
		}
									
						
		//Exibe vetor PA
		System.out.println("\nVETOR PA:");
		for (int i = 0; i < tamanhoDoArray; i++) {
			System.out.print(PA[i] + " ");
		}			
		
		//Exibe vetor PB
		System.out.println("\n\nVETOR PB:");
		for (int i = 0; i < tamanhoDoArray; i++) {
			System.out.print(PB[i] + " ");
		}
		
		//Exibe vetor PC
		System.out.println("\n\nVETOR PC:");
		for (int i = 0; i < tamanhoDoArrayPC; i++) {
			System.out.print(PC[i] + " ");
		}		
	}
}



