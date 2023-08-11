/* Bruno Rosa Cappio
 * 18) Escreva um programa em Java para gerar uma matriz quadrada R de dimensão N.
 * Imprimir os elementos da acima da diagonal principal (inclusa)
 * e acima da diagonal secundária (inclusa).
 * 
 */



import java.util.Scanner;

public class Ex18 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite as dimensoes da matriz quadrada R: ");
		int N = leia.nextInt();
		
		int R[][] = new int[N][N];
		
		System.out.println("Digite os elementos da matriz R: ");
		for (int i = 0; i < R.length; i++) {
			for (int j = 0; j < R[i].length; j++) {
				System.out.println("Elemento: ["+ (i+1) + ", " + (j+1) + "]" );
				R[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz R: ");
		for (int i = 0; i < R.length; i++) {
			for (int j = 0; j < R[i].length; j++) {
				System.out.print(R[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Elementos acima da diagonal principal (inclusa): ");
		
		//Acima da diagonal Principal (inclusa)
		for (int i = 0; i < R.length; i++) {
			for (int j = 0; j < R[i].length; j++) {
				if (j >= i) {
					System.out.print(R[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("\nElementos acima da diagonal secundaria (inclusa): ");
		//Abaixo da diagonal secundaria (inclusa)
		for (int i = 0; i < R.length; i++) {
			for (int j = 0; j < R[i].length; j++) {
				if (i + j <= N - 1) {
					System.out.print(R[i][j] + "\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		}		
		
	}
}




