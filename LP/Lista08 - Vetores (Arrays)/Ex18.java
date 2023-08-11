/* Bruno Rosa Cappio
 * 18) Escreva um programa para solicitar ao usuário a quantidade de elementos da sequência de Fatoriais (N <= 15) e gerar um vetor Y com os elementos da sequência e imprimir o vetor.
 * 
 * 
 */


import java.util.Scanner;

public class Ex18 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma quantidade de elementos da sequencia de Fatoriais (entre 0 e 15): ");
		int N = leia.nextInt();
		while (N < 0 || N > 15) {
			System.out.print("\nValor invalido! Digite novamente: ");
			N = leia.nextInt();
		}
		
		long Y[] = new long[N];
		
		int count = 0;
		long fatorial = 1;
			
		for (int i = 1; count < N; i++) {
			fatorial *= i;
			Y[count] = fatorial;
			count++;
		}
		
		System.out.println("\n\nVetor Y: ");
		for (int i = 0; i < Y.length; i++) {
			System.out.print(Y[i] + " ");
		}
	}
	
}



