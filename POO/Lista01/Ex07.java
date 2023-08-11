/* Bruno Rosa Cappio
 * 7) Escreva um programa em Java para gerar uma matriz E de dimensão N x M, determinar e imprimir o maior e o menor elemento deste conjunto, informando a posição
dos mesmos.*/

import java.util.Scanner;



public class Ex07 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas da matriz E: ");
		int N = leia.nextInt();
		
		System.out.print("Digite a quantidade de colunas da matriz E: ");
		int M = leia.nextInt();
		
		int E[][] = new int[N][M];
		
		int menor = 0, maior = 0;
		
		System.out.println("Digite os elementos da matriz E");
		
		for (int i = 0; i < E.length; i++) {
			for (int j = 0; j < E[i].length; j++) {
				System.out.println("Elemento: ["+ (i+1) + ", " + (j+1) + "]" );
				E[i][j] = leia.nextInt();
				
				if (i == 0 && j == 0) {
					maior = E[i][j];
					menor = E[i][j];
				}
				
				if (E[i][j]	> maior) {
					maior = E[i][j];
				}
				
				if (E[i][j] < menor) {
					menor = E[i][j];
				}
			}
		}				
		
		System.out.println();
		
		for (int i = 0; i < E.length; i++) {
			for (int j = 0; j < E[i].length; j++) {
				System.out.print(E[i][j] + "\t");
			}
			System.out.println();
		}
		
		String posicaoMenor = "";
		String posicaoMaior = "";
		
		for (int i = 0; i< E.length; i++) {
			for (int j = 0; j < E[i].length; j++) {
				if(E[i][j] == menor) {
					posicaoMenor += "[" + (i+1) + ", " + (j+1) + "]";
				}
				if(E[i][j] == maior) {
					posicaoMaior += "[" + (i+1) + ", " + (j+1) + "]";
				}
			}
		}
		
		System.out.println("O menor valor e : " + menor +  " e sua posicao e " + posicaoMenor);
		System.out.println("O maior valor e : " + maior +  " e sua posicao e " + posicaoMaior);
		
	}
}

