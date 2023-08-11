/* Bruno Rosa Cappio
2) Escreva um programa em Java para geral aleatoriamente os elementos
(menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz
gerada e imprimir a matriz em ordem invertida.
*/
package ex02;

import java.util.Random;

public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[][] b = new int[6][3];
        Random aleatorio = new Random();
        
        for (int linha = 0; linha < b.length; linha++) {
            for (int coluna = 0; coluna < b[linha].length; coluna++) {
                b[linha][coluna] = aleatorio.nextInt(100);
            }
        }
        
        System.out.println("A matriz 6x3 gerada aleatoriamente é: ");
        
        for (int x = 0; x < b.length; x++) {
            for (int y = 0; y < b[x].length; y++) {
                System.out.print(b[x][y] + "\t");
            }
            
            System.out.println();
        }
        
        System.out.println("Mostrando a matriz na ordem invertida: ");
        
        for(int i = b.length - 1; i>= 0; i--) {
            for(int j = b[i].length - 1; j >= 0; j--) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
