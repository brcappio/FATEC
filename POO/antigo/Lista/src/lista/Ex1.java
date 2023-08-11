/* Bruno Rosa Cappio
 * 1) Escreva um programa em Java para
ler uma matriz A de 4 linhas por 5 colunas e
imprimir seus elementos.
 */
package lista;

/**
 *
 * @author ALUNO
 */
public class Ex1 {
    
    public static void ex1() {
        int matriz[][] = new int[4][5];
    
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
    }
    }
    
}
