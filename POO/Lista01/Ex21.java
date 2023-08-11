/* Bruno Rosa Cappio
 * 21) Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P).
	Gerar uma terceira matriz (N x (M+P)), sendo que para cada linha concatenar suas respectivas
	colunas e apresentar as três matrizes
 */

import java.util.Random;
import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas da primeira matriz: ");
        int N = leia.nextInt();
        
        System.out.print("\nDigite a quantidade de colunas da primeira matriz: ");
        int M = leia.nextInt();
        
        System.out.print("\nDigite a quantidade de colunas da segunda matriz: ");
        int P = leia.nextInt();
        
        int matriz1[][] = new int[N][M];
        int matriz2[][] = new int[N][P];
        int matriz3[][] = new int[N][M+P];
        
        Random aleatorio = new Random();
        
        //Matriz 1
        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = aleatorio.nextInt(100);
            }
        }
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Matriz 2
        System.out.println("Matriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = aleatorio.nextInt(100);
            }
        }
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Matriz 3
        System.out.println("Matriz 3: ");
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < M; j++) {
                matriz3[i][j] = matriz1[i][j];
            }
            for (int j = 0; j < P; j++) {
                matriz3[i][M+j] = matriz2[i][j];
            }
        }
        
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
