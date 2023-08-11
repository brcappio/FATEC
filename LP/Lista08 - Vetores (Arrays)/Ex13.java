/* Bruno Rosa Cappio
 * 13) Escreva um programa para ler um vetor de inteiros P de N elementos (N <= 10) e imprimir o vetor lido.
 * Ler outro vetor de inteiros Q de M elementos (M <= 15) e imprimir este vetor lido.
 * Construir outro vetor R com todos os elementos lidos de P e de Q e imprimir este vetor obtido. (Concatenação)
 * 
 * 
 */


import java.util.Scanner;

public class Ex13 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int N, M;
        System.out.print("Digite a quantidade de elementos desejados para o primeiro vetor P (Deve ser menor ou igual a 10): ");
        N = leia.nextInt();
        while (N > 10 || N < 0) {
            System.out.print("Número inválido. Digite novamente (Deve ser menor ou igual a 10): ");
            N = leia.nextInt();
        }

        System.out.print("Digite a quantidade de elementos desejados para o segundo vetor Q (Deve ser menor ou igual a 15): ");
        M = leia.nextInt();
        while (M > 15 || M < 0) {
            System.out.print("Número inválido. Digite novamente (Deve ser menor ou igual a 15): ");
            M = leia.nextInt();
        }
			
		int P[] = new int[N];
		
		int Q[] = new int[M];
		
		for (int i = 0; i < N; i++) {
			P[i] = (int) (Math.random() * 10);
		}
		
		for (int i = 0; i < M; i++) {
			Q[i] = (int) (Math.random() * 10);
		}
		
		int R[] = new int[N + M];
		int indexR = 0;
		
		for (int i = 0; i < R.length; i++) {
			if (indexR < N) {
				R[indexR] = P[i];
				indexR++; 
			}
			else {
				R[indexR] = Q[i - N];
				indexR++; 
			}
		}
		
		System.out.println("\nVetor P: ");
		for (int i = 0; i < P.length; i++) {
			System.out.print(P[i] + " ");
		}
		
		System.out.println("\n\nVetor Q: ");
		for (int i = 0; i < Q.length; i++) {
			System.out.print(Q[i] + " ");
		}
		
		System.out.println("\n\nVetor R: ");
		for (int i = 0; i < R.length; i++) {
			System.out.print(R[i] + " ");
		}
	}
	
}



