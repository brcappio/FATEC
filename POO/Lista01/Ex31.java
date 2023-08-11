/* Bruno Rosa Cappio
 * 31) Escreva um programa em Java para gerar uma matriz (N x M).
 * O usuário deve informar uma faixa de valores inteiros positivos (valor inicial e valor final).
 * O programa deve gerar aleatoriamente os elementos da matriz, respeitando a faixa de valores fornecida pelo usuário.
 * Ao final, imprimir a matriz resultante
 */

import java.util.*;

public class Ex31 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas da matriz: ");
		int N = leia.nextInt();
		
		System.out.print("Digite a quantidade de colunas da matriz: ");
		int M = leia.nextInt();
		
		System.out.print("Digite o limite inicial para os numeros gerados: ");
		int limiteInicial = leia.nextInt();
		
		System.out.print("Digite o limite final para os numeros gerados: ");
		int limiteFinal = leia.nextInt();
		
		int matriz[][] = new int[N][M];
		
		Random aleatorio = new Random();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				matriz[i][j] = aleatorio.nextInt(limiteInicial, limiteFinal);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

