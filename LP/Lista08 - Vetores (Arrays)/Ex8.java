/* Bruno Rosa Cappio
 * 8) Escreva um programa para ler 5 elementos do vetor F de inteiros. Calcular e imprimir a soma dos elementos ímpares. Supor que o vetor poderá não ter nenhum elemento com esta propriedade e neste caso, mostrar uma mensagem.
 * 
 * 
 */


import java.util.Scanner;

public class Ex8 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o tamanho dos arrays (menor ou igual a 20): ");
		int tamanhoDoArray = leia.nextInt();
				
		if (tamanhoDoArray <= 20) {
			
			//Forma vetor F
			System.out.println("\nVETOR F: ");
			int F[] = new int[tamanhoDoArray];
		
			for (int i = 0; i < tamanhoDoArray; i++){
				System.out.print("Digite o elemento " + (i + 1) + ": ");
				F[i] = leia.nextInt();
				if (F[i] <= 0) {
					System.out.println("Insira um valor maior que zero!");
					i--;
				}				
			}
									
						
			//Exibe vetor F
			System.out.println("\nVETOR F:");
			for (int i = 0; i < tamanhoDoArray; i++) {
				System.out.print(F[i] + " ");
			}
			
			int soma = 0;
			
			for (int i = 0; i < tamanhoDoArray; i++) {
				if (F[i] %2 != 0) {
					soma += F[i];
				}
			}
			
			System.out.println("\n\nSoma dos elementos impares: " + soma);
	
		}					
	}
}



