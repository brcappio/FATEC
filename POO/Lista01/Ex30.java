/* Bruno Rosa Cappio
 * 30) Item ao exercício anterior, mas utilizando a sequencia de Fibonacci
 */

import java.util.*;

public class Ex30 {
	
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
			matriz[i] = new int[elementos[i] + 2];
			
			matriz[i][0] = elementos[i];
			matriz[i][1] = 0;
			
			// Preencher com a sequência de Fibonacci
			int count = 2;
			int a = 0;
			int b = 1;
			for (int j = 1; count <= elementos[i] + 1; j++) {
				int fib = a + b;
				matriz[i][count++] = fib;
				a = b;
				b = fib;
			}
		}
		
		for (int i = 0; i < qtdElementos; i++) {
			for (int j = 0; j < elementos[i] + 2; j++) {
				System.out.print(matriz[i][j]);
				if (j < elementos[i] + 1) {
					System.out.print(",\t");
				}
			}
			System.out.println();
		}
	}
}


