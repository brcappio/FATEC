/* Bruno Rosa Cappio
 * 17) Escreva um programa para solicitar ao usuário a quantidade de elementos da sequência de Primos (N <= 20) e gerar um vetor X com os elementos da sequência e imprimir o vetor.
 * 
 * 
 */


import java.util.Scanner;

public class Ex17 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma quantidade de elementos da sequencia de Primos: ");
		int N = leia.nextInt();
		while (N < 0 || N > 20) {
			System.out.print("\nValor invalido! Digite novamente: ");
			N = leia.nextInt();
		}
		
		int X[] = new int[N];
		
		int count = 0;
			
		for (int number = 2; count < N; number++) {
           int divisorCount = 0;

           for (int i = 1; i <= number; i++) {
               if (number % i == 0) {
                   divisorCount++;
               }
           }

           if (divisorCount == 2) {
               X[count] = number;
               count++;
           }
        }
		
		System.out.println("\n\nVetor X: ");
		for (int i = 0; i < X.length; i++) {
			System.out.print(X[i] + " ");
		}
	}
	
}



