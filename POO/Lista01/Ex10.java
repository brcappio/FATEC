/* Bruno Rosa Cappio
 * 10) Escreva um programa em Java para gerar uma matriz quadrada H de dimensão N.
 *  Imprimir os elementos da diagonal secundária (linha + coluna = dimensão - 1)
 * 
 */


import java.util.Scanner;

public class Ex10 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite as dimensoes da matriz quadrada H: ");
		int N = leia.nextInt();
		
		int H[][] = new int[N][N];
		
		System.out.println("Digite os elementos da matriz G: ");
		for (int i = 0; i < H.length; i++) {
			for (int j = 0; j < H[i].length; j++) {
				System.out.println("Elemento: ["+ (i+1) + ", " + (j+1) + "]" );
				H[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz H: ");
		for (int i = 0; i < H.length; i++) {
			for (int j = 0; j < H[i].length; j++) {
				System.out.print(H[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Elementos da diagonal secundaria: ");
		System.out.println();
		
		
		for (int i = 0; i < H.length; i++) {
			for (int j = 0; j < H[i].length; j++) {
				if (i + j == N - 1) {
					System.out.print(H[i][j] + "\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		}		
		
	}
}



