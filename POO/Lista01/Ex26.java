/* Bruno Rosa Cappio
 * 26) Escreva um programa em Java para gerar uma matriz W (N x M).
 * Ordene os elementos da matriz de forma decrescente e imprimir a matriz original e a matriz ordenada.
 * 
 */

import java.util.*;


public class Ex26 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = leia.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = leia.nextInt();

        // Inicializa a matriz
        Integer matriz[][] = new Integer[linhas][colunas];

        // Preenche a matriz
        Random aleatorio = new Random();
        System.out.println("\nMatriz Original: \n");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = aleatorio.nextInt(101);
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
        Integer matrizUni[] = new Integer[linhas * colunas];
        int k = 0;
        for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matrizUni[k++] = matriz[i][j];
			}
		}
        
		
		// Ordena o array em ordem decrescente
        Arrays.sort(matrizUni, Collections.reverseOrder());
        
        // Preenche a matriz ordenada com os valores do array ordenado
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

