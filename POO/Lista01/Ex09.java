/* Bruno Rosa Cappio
 * 9) Escreva um programa em Java para gerar uma matriz quadrada G de dimensão N.
 * Imprimir os elementos da diagonal principal (linha = coluna)
 */

import java.util.Scanner;

public class Ex09 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite as dimensoes da matriz quadrada G: ");
		int N = leia.nextInt();
		
		int G[][] = new int[N][N];
		
		System.out.println("Digite os elementos da matriz G: ");
		for (int i = 0; i < G.length; i++) {
			for (int j = 0; j < G[i].length; j++) {
				System.out.println("Elemento: ["+ (i+1) + ", " + (j+1) + "]" );
				G[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz G: ");
		for (int i = 0; i < G.length; i++) {
			for (int j = 0; j < G[i].length; j++) {
				System.out.print(G[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Elementos da diagonal principal: ");
		
		
		
		for (int i = 0; i < G.length; i++) {
			for (int j = 0; j < G[i].length; j++) {
				if (i == j) {
					if (j == 0) {
						System.out.print(G[i][j]);
					} else {
						System.out.print(" " + G[i][j]);
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
		
	}
}

