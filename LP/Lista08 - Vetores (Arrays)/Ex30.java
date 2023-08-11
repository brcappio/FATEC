/* Bruno Rosa Cappio
 * Ex30.java
 30) Escreva um programa para gerar um vetor de double AK de dimensão e elementos definidos pelo usuário. 
 * Ordenar de forma crescente. 
 * Criar um vetor AL, tal que, este receba os elementos do vetor AK com a média entre cada dois elementos. 
 */

import java.util.Scanner;

public class Ex30 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a dimensao do array de doubles AK: ");
		int tamanhoAK = leia.nextInt();
		
		double AK[] = new double[tamanhoAK];
		
		for(int i = 0; i < tamanhoAK; i++) {
			System.out.print("Digite um numero para a posicao " + i + ": ");
			AK[i] = leia.nextDouble();		
		}
		
		for(int i = 0; i < tamanhoAK - 1; i++) {
			for(int j = 0; j < tamanhoAK - 1; j++) {
				if (AK[j] > AK[j+1]) {
					double temp = AK[j];
					AK[j] = AK[j+1];
					AK[j+1] = temp;
				}
			}
		}
		
		System.out.println("\nArray AK:");
		for(int i = 0; i < tamanhoAK; i++) {
			System.out.print(AK[i] + " ");		
		}
		
		
		
		double AL[] = new double[(2*tamanhoAK) - 1];
		
		for (int i = 0, j = 0; i < AL.length; i += 2, j++) {
			AL[i] = AK[j];
			if (i > 0) {
				AL[i-1] = (AL[i] + AL[i - 2]) / 2 ;
			}
		}
		
		for (int i = 0; i < AL.length; i++) {
			System.out.print(AL[i] + " ");
		}
		
		
	}
}

