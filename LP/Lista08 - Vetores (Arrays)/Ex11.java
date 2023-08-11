/* Bruno Rosa Cappio
 * 11) Escreva um programa para ler dois vetores QA e QB de inteiros de 5 elementos e imprimir os vetores lidos. Construir outro vetor QC de tamanho 10, com todos oselementos lidos de QA e de QB e imprimir este vetor obtido. (Intercalação)
 * 
 * 
 */


import java.util.Scanner;

public class Ex11 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanhoDoArray = 5;
		int tamanhoDoArrayQC = 10;
		
		System.out.println("VETOR QA: ");
		int QA[] = new int[tamanhoDoArray];
		
		//Monta vetor QA
		for (int i = 0; i < tamanhoDoArray; i++){
			System.out.print("Digite o elemento " + (i + 1) + ": ");
			QA[i] = leia.nextInt();
			if (QA[i] <= 0) {
				System.out.println("Insira um valor maior que zero!");
				i--;
			}				
		}
		
		System.out.println("\nVETOR QB: ");
		int QB[] = new int[tamanhoDoArray];
		
		//Monta vetor QB
		for (int i = 0; i < tamanhoDoArray; i++){
			System.out.print("Digite o elemento " + (i + 1) + ": ");
			QB[i] = leia.nextInt();
			if (QB[i] <= 0) {
				System.out.println("Insira um valor maior que zero!");
				i--;
			}				
		}
		
		// Monta vetor QC
		int QC[] = new int[tamanhoDoArrayQC];
		int indexQC = 0;
		
		for (int i = 0; i < tamanhoDoArray; i++) {
			if (indexQC %2 == 0) {
				QC[indexQC] = QA[i];
				indexQC++;
			}
			if (indexQC %2 != 0) {
				QC[indexQC] = QB[i];
				indexQC++;
			}
		}
									
						
		//Exibe vetor QA
		System.out.println("\nVETOR QA:");
		for (int i = 0; i < tamanhoDoArray; i++) {
			System.out.print(QA[i] + " ");
		}			
		
		//Exibe vetor QB
		System.out.println("\n\nVETOR QB:");
		for (int i = 0; i < tamanhoDoArray; i++) {
			System.out.print(QB[i] + " ");
		}
		
		//Exibe vetor QC
		System.out.println("\n\nVETOR QC:");
		for (int i = 0; i < tamanhoDoArrayQC; i++) {
			System.out.print(QC[i] + " ");
		}		
	}
}



