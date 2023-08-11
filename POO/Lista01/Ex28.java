/* Bruno Rosa Cappio
 * 28) Escreva um programa em Java para gerar uma matriz Z (N x M).
 *  Ordenaras colunas da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.
 */

import java.util.*;

public class Ex28 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz Z: ");
        int linhas = leia.nextInt();

        System.out.print("Digite o número de colunas da matriz Z: ");
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
		

        
        // Ordena as colunas da matriz
        for (int j = 0; j < colunas; j++) {
            int[] coluna = new int[linhas];
            for (int i = 0; i < linhas; i++) {
                coluna[i] = matriz[i][j];
            }
            Arrays.sort(coluna);
            for (int i = 0; i < linhas; i++) {
                matriz[i][j] = coluna[i];
            }
        }

        // Imprime a matriz ordenada
        System.out.println("\nMatriz Z Ordenada: \n");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

