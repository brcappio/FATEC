/* Bruno Rosa Cappio
5) Escreva um programa em Java para ler 2 matrizes N x M (definido pelo usuário) e
calcular a soma entre elas gerando uma terceira matriz.*/

import java.util.Scanner;

public class Ex05 {

    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("--SOMA DE MATRIZES--");
        System.out.println("!!!IMPORTANTE!!!");
        System.out.println("Para que seja possivel somar as duas matrizes, elas devem obrigatoriamente ter a mesma ordem (mesma quantidade de linhas e colunas)!");
        System.out.println();
                
        
        
        System.out.println("--PRIMEIRA MATRIZ (N)--");
        System.out.println();
        
        System.out.print("Digite a quantidade de linhas da primeira matriz: ");
        int x = leia.nextInt();
        
        System.out.println();
        
        System.out.print("Digite a quantidade de colunas da primeira matriz: ");
        int y = leia.nextInt();
        
        int N [][] = new int[x][y];
        
        for (int linha = 0; linha < N.length; linha++) {
            for (int coluna = 0; coluna < N[linha].length; coluna++) {
                System.out.print("Elemento [" + (linha + 1) + ", " + (coluna + 1) + "]: ");
                N[linha][coluna] = leia.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("Primeira matriz: ");
        System.out.println();
        
        for (int linha = 0; linha < N.length; linha++) {
            for (int coluna = 0; coluna < N[linha].length; coluna++) {
                System.out.print(N[linha][coluna] + "\t");
            }
            System.out.println();
        }
        
        
        
        System.out.println();
        System.out.println();
             
        
        System.out.println("--SEGUNDA MATRIZ (M)--");
        System.out.println();
        
        System.out.println();
             
        System.out.print("Digite a quantidade de linhas da segunda matriz: ");
        int w = leia.nextInt();
        
        System.out.println();
        
        System.out.print("Digite a quantidade de colunas da segunda matriz: ");
        int z = leia.nextInt();
        
        int M [][] = new int[w][z];
        
        for (int linha = 0; linha < M.length; linha++) {
            for (int coluna = 0; coluna < M[linha].length; coluna++) {
                System.out.print("Elemento [" + (linha + 1) + ", " + (coluna + 1) + "]: ");
                M[linha][coluna] = leia.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("Segunda matriz: ");
        System.out.println();
        
        for (int linha = 0; linha < M.length; linha++) {
            for (int coluna = 0; coluna < M[linha].length; coluna++) {
                System.out.print(M[linha][coluna] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("--SOMA DAS MATRIZES--");
        System.out.println();
        
        int matrizSoma[][] = new int[x][y];
        
		for (int linha = 0; linha < x; linha++) {
			for (int coluna = 0; coluna < y; coluna++) {
				matrizSoma[linha][coluna] = N[linha][coluna] + M[linha][coluna];
				System.out.print(matrizSoma[linha][coluna] + "\t");
			}
			
			System.out.println();
		}
    }
    
}
