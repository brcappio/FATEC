/* Bruno Rosa Cappio
 * 4
) Escreva um programa em Java para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive)
e N (inclusive). Considere que o N será sempre
maior
que ZERO
 * 
 * 
 */

import java.util.Scanner;

public class Ex4 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int N = leia.nextInt();
		
		for (int i = 1; i <= N; i++){
			System.out.println(i);
		}
	}
}

