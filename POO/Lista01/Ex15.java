/* Bruno Rosa Cappio
 * 15) Escreva um programa em Java para gerar uma matriz quadrada O de dimensão N.
 * Imprimir os elementos abaixo da diagonal principal (inclusa)
 * e acima da diagonal secundária (inclusa).
 */


import java.util.Scanner;

public class Ex15 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite as dimensoes da matriz quadrada O: ");
		int N = leia.nextInt();
		
		int O[][] = new int[N][N];
		
		System.out.println("Digite os elementos da matriz O: ");
		for (int i = 0; i < O.length; i++) {
			for (int j = 0; j < O[i].length; j++) {
				System.out.println("Elemento: ["+ (i+1) + ", " + (j+1) + "]" );
				O[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz O: ");
		for (int i = 0; i < O.length; i++) {
			for (int j = 0; j < O[i].length; j++) {
				System.out.print(O[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Elementos abaixo da diagonal principal (inclusa): ");
		
		//Abaixo da diagonal Principal (inclusa)
		for (int i = 0; i < O.length; i++) {
			for (int j = 0; j < O[i].length; j++) {
				if (j <= i) {
					System.out.print(O[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("\nElementos acima da diagonal secundaria (inclusa): ");
		//Acima da diagonal secundaria (inclusa)
		for (int i = 0; i < O.length; i++) {
			for (int j = 0; j < O[i].length; j++) {
				if (i + j <= N - 1) {
					System.out.print(O[i][j] + "\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		}		
		
	}
}




