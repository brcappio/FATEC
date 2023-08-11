/* Bruno Rosa Cappio
 * 23) Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz.
 * Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.
 * 
 */


import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = leia.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = leia.nextInt();

        // Inicializa a matriz
        int matriz[][] = new int[linhas][colunas];

        // Preenche a matriz com os números primos
        int count = 2;
        boolean isPrimo = false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                // Verifica se o número atual é primo
                isPrimo = false;
                while (!isPrimo) {
                    count++;
                    isPrimo = true;
                    for (int k = 2; k <= Math.sqrt(count); k++) {
                        if (count % k == 0) {
                            isPrimo = false;
                            break;
                        }
                    }
                }
                matriz[i][j] = count;
                count++;
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
