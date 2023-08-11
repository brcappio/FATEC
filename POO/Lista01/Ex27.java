/* Bruno Rosa Cappio
 * 27) Escreva um programa em Java para gerar uma matriz X (N x M).
 * Ordenar as linhas da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.
 */

import java.util.*;

public class Ex27 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz X: ");
        int linhas = leia.nextInt();

        System.out.print("Digite o número de colunas da matriz X: ");
        int colunas = leia.nextInt();

        // Inicializa a matriz
        int matriz[][] = new int[linhas][colunas];

        // Preenche a matriz
        Random aleatorio = new Random();
        System.out.println("\nMatriz Original: \n");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = aleatorio.nextInt(11);
            }
        }

        // Imprime a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
		

        
        // Imprime a matriz ordenada
        System.out.println("\nMatriz X Ordenada: \n");
        for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				Arrays.sort(matriz[i]);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

