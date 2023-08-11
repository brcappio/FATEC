/*  Bruno Rosa Cappio
 * 17) Escreva um programa em Java para gerar uma matriz quadrada Q de dimensão N.
 * Imprimir os elementos acima da diagonal principal (inclusa)
 * e abaixo da diagonal secundária (inclusa).
 * 
 */


import java.util.Scanner;

public class Ex17 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite as dimensoes da matriz quadrada Q: ");
		int N = leia.nextInt();
		
		int Q[][] = new int[N][N];
		
		System.out.println("Digite os elementos da matriz Q: ");
		for (int i = 0; i < Q.length; i++) {
			for (int j = 0; j < Q[i].length; j++) {
				System.out.println("Elemento: ["+ (i+1) + ", " + (j+1) + "]" );
				Q[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz Q: ");
		for (int i = 0; i < Q.length; i++) {
			for (int j = 0; j < Q[i].length; j++) {
				System.out.print(Q[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Elementos acima da diagonal principal (inclusa): ");
		
		//Acima da diagonal Principal (inclusa)
		for (int i = 0; i < Q.length; i++) {
			for (int j = 0; j < Q[i].length; j++) {
				if (j >= i) {
					System.out.print(Q[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("\nElementos abaixo da diagonal secundaria (inclusa): ");
		//Abaixo da diagonal secundaria (inclusa)
		for (int i = 0; i < Q.length; i++) {
			for (int j = 0; j < Q[i].length; j++) {
				if (i + j >= N - 1) {
					System.out.print(Q[i][j] + "\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		}		
		
	}
}



