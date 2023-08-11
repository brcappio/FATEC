/* Bruno Rosa Cappio
 * 29) Escreva um programa em Java para solicitar ao usuário um valor.
 * Este valor lido será a quantidade de elementos de um vetor.
 * Gerar os elementos do vetor.
 * A partir do vetor gerado, criar uma matriz, onde a quantidade de linhas será igual à quantidade de elementos do vetor e as colunas serão os valores dos elementos do vetor mais um.
 * Com a matriz criada, armazenar na primeira coluna de cada linha o respectivo elemento do vetor criado inicialmente e os demais elementos da linha serão formados pela sequencia de Primos.
 * Imprimir a matriz resultante.
 * Exemplo:
 * Quantidade de elementos: 4
 * Vetor gerado:  3, 5, 1, 6
 * Matriz gerada: 3, 1, 2, 3
 * 				  5, 1, 2, 3, 5, 7
 * 				  1, 1
 * 				  6, 1, 2, 3, 5, 7, 11
 */

import java.util.*;

public class Ex29 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de elementos do vetor: ");
		int qtdElementos = leia.nextInt();
		
		int elementos[] = new int[qtdElementos];
		Random aleatorio = new Random();
		
		for (int i = 0; i < qtdElementos; i++) {
			elementos[i] = aleatorio.nextInt(11);
		}
		
		int matriz[][] = new int[qtdElementos][];
		
		for (int i = 0; i < qtdElementos; i++) {
			matriz[i] = new int[elementos[i] + 1];
			
			matriz[i][0] = elementos[i];
			
			// Preencher com a sequência de primos
			int count = 1;
			for (int j = 2; count <= elementos[i]; j++) {
				boolean primo = true;
				for (int k = 2; k < j; k++) {
					if (j % k == 0) {
						primo = false;
						break;
					}
				}
				if (primo) {
					matriz[i][count++] = j;
				}
			}
		}
		
		for (int i = 0; i < qtdElementos; i++) {
			for (int j = 0; j < elementos[i] + 1; j++) {
				System.out.print(matriz[i][j]);
                if (j < elementos[i]) {
                    System.out.print(",\t");
                }
			}
			System.out.println();
		}
	}
}
