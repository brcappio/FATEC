/*Bruno Rosa Cappio
* 6) Escreva um programa em Java para gerar aleatoriamente (menor que 25)
uma matriz N x M de dimensão definidas pelo usuário. Solicitar ao usuário
um valor. Imprimir a matriz gerada. Informar se o valor digitado existe na
matriz, indicando a posição (linha X coluna) e no final a quantidade de
ocorrências.
*/

import java.util.Scanner;
import java.util.Random;

public class Ex06 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas da matriz: ");
		int n = leia.nextInt();
		System.out.println();
		
		System.out.print("Digite a quantidade de colunas da matriz: ");
		int m = leia.nextInt();
		System.out.println();
					
		int matriz[][] = new int[n][m];
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				Random aleatorio = new Random();
				matriz[linha][coluna] = aleatorio.nextInt(26);
			}
		}
		
		System.out.println();
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				Random aleatorio = new Random();
				System.out.print(matriz[linha][coluna] + "\t");
							
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Digite um numero de sua escolha de 0 a 25: ");
		int escolha = leia.nextInt();
		
		int qtdOcorrencias = 0;
		String posicoes = "";
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (matriz[linha][coluna] == escolha) {
					qtdOcorrencias++;
					posicoes += "(" + (linha + 1) + "," + (coluna + 1) + ") ";
				}
			}
		}
		
		System.out.println();
		
		if (qtdOcorrencias != 0) {
			System.out.println("O valor " + escolha + " foi encontrado nas seguintes posicoes: ");
			System.out.println(posicoes);
			System.out.println("A quantidade de vezes que ele aparece e: " + qtdOcorrencias);
		} else {
			System.out.println("Nao foi encontrado nenhuma ocorrencia do numero na matriz");
		}
	}
}

