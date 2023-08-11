/* Bruno Rosa Cappio
 * 24) Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz.
 *  Preencher a matriz com os elementos da sequencia de Fibonaccie imprimir o resultado.
 * 
 */

import java.util.Scanner;


public class Ex24 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = leia.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = leia.nextInt();

        // Inicializa a matriz
        int matriz[][] = new int[linhas][colunas];

        // Preenche a matriz com os números primos
        System.out.println("Matriz: \n");
        int a = 0, b = 1, proximo;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = a;
                proximo = a + b;
                a = b;
                b = proximo;
            }
        }

        // Imprime a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
	}
}

