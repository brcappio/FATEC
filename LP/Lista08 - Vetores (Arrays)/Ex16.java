/* Bruno Rosa Cappio
 * 16) Escreva um programa para solicitar ao usuário a quantidade de elementos da sequência de Fibonacci (N <= 20) e gerar um vetor V com os elementos da sequência e imprimir o vetor.
 * 
 * 
 */


import java.util.Scanner;

public class Ex16 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma quantidade de elementos da sequencia de Fibonacci: ");
		int qtd = leia.nextInt();
		while (qtd < 0 || qtd > 20) {
			System.out.print("\nValor invalido! Digite novamente: ");
			qtd = leia.nextInt();
		}
		
		int V[] = new int[qtd];
		
		int a = 0;
		int b = 1;
		int c = 0;
			
		for (int i = 0; i < V.length; i++) {				
			a = b;
			b = c;			
			c = a + b;
			V[i] = c;
		}
		
		System.out.println("\n\nVetor V: ");
		for (int i = 0; i < V.length; i++) {
			System.out.print(V[i] + " ");
		}
	}
	
}



