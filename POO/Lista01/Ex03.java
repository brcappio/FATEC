/*Bruno Rosa Cappio
3) Escreva um programa em Java para ler uma matriz C quadrada de dimensão N, onde N é menor ou igual a 20
e imprimir seus elementos. O usuário deve informar o número o tamanho da matriz quadrada (dimensão)
e os elementos podem ser gerados aleatoriamente (menor que 100).*/
package ex03;

import java.util.Scanner;
import java.util.Random;

public class Ex03 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Escolha as dimensões da matriz quadrada (o número escolhido deve ser menor que 20): ");
        int n = leia.nextInt();
        
        if (n <= 20) {
            int C[][] = new int[n][n];
        
            for (int linha = 0; linha < C.length; linha++ ) {
                for (int coluna = 0; coluna < C[linha].length; coluna++) {
                    Random aleatorio = new Random();
                    C[linha][coluna] = aleatorio.nextInt(100);
                }
            }

            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[i].length; j++) {
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("A dimensão da matriz necessariamente deve ser menor que 20!!");
        }
    }
    
}
