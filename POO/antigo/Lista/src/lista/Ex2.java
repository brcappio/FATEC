/* Bruno Rosa Cappio
 *2) Escreva um programa em Java para geral aleatoriamente os elementos (menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz
gerada e imprimir a matriz em ordem invertida.
 */
package lista;

/**
 *
 * @author ALUNO
 */
public class Ex2 {
    public static void ex2() {
        int matriz[][] = new int[4][5];
    
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
    }
    }
    
}
