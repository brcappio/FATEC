/* Bruno Rosa Cappio
 * 25) Escreva um programa em Java para gerar uma matriz Y (N x M).
 * Ordene os elementos da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.
 * 
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ex25 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = leia.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = leia.nextInt();

        // Inicializa a matriz
        int matriz[][] = new int[linhas][colunas];

        // Preenche a matriz
        Random aleatorio = new Random();
        System.out.println("Matriz Original: \n");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = aleatorio.nextInt(21);
            }
        }

        // Imprime a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Converte a matriz para um array de uma dimensão
        int matrizUni[] = new int[linhas * colunas];
        int k = 0;
        for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matrizUni[k++] = matriz[i][j];
			}
		}
        
        
        // Ordena a matriz
        Arrays.sort(matrizUni);
        
        k = 0;
        for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = matrizUni[k++];
			}
		}
        
        // Imprime a matriz ordenada
        System.out.println("\nMatriz Ordenada: \n");
        for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

