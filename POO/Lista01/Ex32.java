/* Bruno Rosa Cappio
 * 32) Escreva um programa em Java para gerar uma matriz (N x M).
 * A matriz deve ser criada com a seguinte dimensão ((N+1) x (M+1)).
 * Para cada linha imprimir a soma na casa final.
 * Repetir o processo para coluna.
 * Na posição((N+1) x (M+1)), apresentar a soma dos elementos da diagonal principal (linha = coluna)
 */

import java.util.*;

public class Ex32 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da matriz: ");
        int linhas = leia.nextInt();

        System.out.print("Digite a quantidade de colunas da matriz: ");
        int colunas = leia.nextInt();

        int matriz[][] = new int[linhas+1][colunas+1];

        Random aleatorio = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = aleatorio.nextInt(11);
            }
        }

        // Calcula a soma de cada linha e imprime na última coluna
        for (int i = 0; i < linhas; i++) {
            int somaLinha = 0;
            for (int j = 0; j < colunas; j++) {
                somaLinha += matriz[i][j];
            }
            matriz[i][colunas] = somaLinha;
        }

        // Calcula a soma de cada coluna e imprime na última linha
        for (int j = 0; j < colunas; j++) {
            int somaColuna = 0;
            for (int i = 0; i < linhas; i++) {
                somaColuna += matriz[i][j];
            }
            matriz[linhas][j] = somaColuna;
        }

        // Calcula a soma dos elementos da diagonal principal e imprime na posição (N+1) x (M+1)
        int somaDiagonal = 0;
        for (int i = 0; i < linhas; i++) {
            somaDiagonal += matriz[i][i];
        }
        matriz[linhas][colunas] = somaDiagonal;

        // Imprime a matriz completa
        for (int i = 0; i < linhas+1; i++) {
            for (int j = 0; j < colunas+1; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
