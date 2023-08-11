/* Bruno Rosa Cappio
 * 16) Escreva um programa em Java para gerar uma matriz quadrada P de dimensão N.
 * Imprimir os elementos abaixo da diagonal principal (inclusa) 
 * e abaixo da diagonal secundária (inclusa).
 */


import java.util.Scanner;

public class Ex16 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite as dimensoes da matriz quadrada P: ");
		int N = leia.nextInt();
		
		int P[][] = new int[N][N];
		
		System.out.println("Digite os elementos da matriz P: ");
		for (int i = 0; i < P.length; i++) {
			for (int j = 0; j < P[i].length; j++) {
				System.out.println("Elemento: ["+ (i+1) + ", " + (j+1) + "]" );
				P[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz P: ");
		for (int i = 0; i < P.length; i++) {
			for (int j = 0; j < P[i].length; j++) {
				System.out.print(P[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Elementos abaixo da diagonal principal (inclusa): ");
		
		//Abaixo da diagonal Principal (inclusa)
		for (int i = 0; i < P.length; i++) {
			for (int j = 0; j < P[i].length; j++) {
				if (j <= i) {
					System.out.print(P[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("\nElementos abaixo da diagonal secundaria (inclusa): ");
		//Abaixo da diagonal secundaria (inclusa)
		for (int i = 0; i < P.length; i++) {
			for (int j = 0; j < P[i].length; j++) {
				if (i + j >= N - 1) {
					System.out.print(P[i][j] + "\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		}		
		
	}
}

