/* Bruno Rosa Cappio
 * 12) Escreva um programa em Java para gerar uma matriz quadrada L de di-mensão N. Imprimir os elementos da acima da diagonal principal (exclusa).
 */


import java.util.Scanner;

public class Ex12 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite as dimensoes da matriz quadrada L: ");
		int N = leia.nextInt();
		
		int L[][] = new int[N][N];
		
		System.out.println("Digite os elementos da matriz L: ");
		for (int i = 0; i < L.length; i++) {
			for (int j = 0; j < L[i].length; j++) {
				System.out.println("Elemento: ["+ (i+1) + ", " + (j+1) + "]" );
				L[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz L: ");
		for (int i = 0; i < L.length; i++) {
			for (int j = 0; j < L[i].length; j++) {
				System.out.print(L[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Elementos acima da diagonal principal (exclusa): ");
		System.out.println();
		
		
		for (int i = 0; i < L.length; i++) {
			for (int j = 0; j < L[i].length; j++) {
				if (j > i) {
					System.out.print(L[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}		
		
	}
}

