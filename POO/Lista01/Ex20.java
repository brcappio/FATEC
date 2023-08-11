/* Bruno Rosa Cappio
 * 20) Escreva um programa em Java para gerar uma matriz quadrada T de dimensão N.
 * Imprimir os elementos da “ampulheta”.
 */


/* Bruno Rosa Cappio
 * 19) Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N.
 * Imprimir os elementos da “asa da borboleta”.
 * 
 */

import java.util.Random;
import java.util.Scanner;


public class Ex20 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite as dimensoes da matriz quadrada T: ");
		int N = leia.nextInt();
		
		int T[][] = new int[N][N];
		
		Random aleatorio = new Random();
		
		System.out.println("Digite os elementos da matriz T: ");
		for (int i = 0; i < T.length; i++) {
			for (int j = 0; j < T[i].length; j++) {
				T[i][j] = aleatorio.nextInt(100);
			}
		}
		
		System.out.println();
		System.out.println("Matriz T: ");
		for (int i = 0; i < T.length; i++) {
			for (int j = 0; j < T[i].length; j++) {
				System.out.print(T[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Ampulheta: ");
		
		for (int i = 0; i < T.length; i++) {
			for (int j = 0; j < T[i].length; j++) {
				if ((i <= j && i + j <= T.length - 1)|| (i >= j && i + j >= T.length - 1)) {
					System.out.print(T[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
				
		
	}
}


