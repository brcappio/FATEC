/* Bruno Rosa Cappio
 * 11) Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N.
 * Imprimir os elementos abaixo da diagonal principal (inclusa).
 */


import java.util.Scanner;

public class Ex11 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite as dimensoes da matriz quadrada K: ");
		int N = leia.nextInt();
		
		int K[][] = new int[N][N];
		
		System.out.println("Digite os elementos da matriz K: ");
		for (int i = 0; i < K.length; i++) {
			for (int j = 0; j < K[i].length; j++) {
				System.out.println("Elemento: ["+ (i+1) + ", " + (j+1) + "]" );
				K[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz K: ");
		for (int i = 0; i < K.length; i++) {
			for (int j = 0; j < K[i].length; j++) {
				System.out.print(K[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Elementos abaixo da diagonal principal (inclusa): ");
		System.out.println();
		
		
		for (int i = 0; i < K.length; i++) {
			for (int j = 0; j < K[i].length; j++) {
				if (j <= i) {
					System.out.print(K[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}		
		
	}
}

