/* Bruno Rosa Cappio
 * 19) Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N.
 * Imprimir os elementos da “asa da borboleta”.
 * 
 */

import java.util.Random;
import java.util.Scanner;


public class Ex19 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite as dimensoes da matriz quadrada R: ");
		int N = leia.nextInt();
		
		int R[][] = new int[N][N];
		
		Random aleatorio = new Random();
		
		System.out.println("Digite os elementos da matriz R: ");
		for (int i = 0; i < R.length; i++) {
			for (int j = 0; j < R[i].length; j++) {
				R[i][j] = aleatorio.nextInt(100);
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
		System.out.println("Asa da borboleta: ");
		
		for (int i = 0; i < R.length; i++) {
			for (int j = 0; j < R[i].length; j++) {
				if ((i >= j && i + j <= R.length - 1)|| (i <= j && i + j >= R.length - 1)) {
					System.out.print(R[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
				
		
	}
}

