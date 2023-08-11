/* Bruno Rosa Cappio
 * 15) Escreva um programa para ler um vetor de inteiros S de N elementos (N <= 10) e imprimir o vetor lido. 
 * Ler outro vetor de inteiros T de M elementos (M <= 15) e imprimir este vetor lido. 
 * Construir outro vetor U com todos os elementos lidos de S e de T e imprimir este vetor obtido. (Intercalação)
 * 
 * 
 */


import java.util.Scanner;

public class Ex15 {
	
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
					
		int S[] = new int[N];		
		int T[] = new int[M];
		
		for (int i = 0; i < S.length; i++) {
			S[i] = (int) (Math.random() * 10);
		}
		
		for (int i = 0; i < T.length; i++) {
			T[i] = (int) (Math.random() * 10);
		}
		
		int U[] = new int[S.length + T.length];
		int index = 0;

        for (int i = 0; i < U.length; i++) {
            if (i < S.length) {
                U[index] = S[i];
                index++;
            }
            if (i < T.length) {
                U[index] = T[i];
                index++;
            }
        }
		
		System.out.println("Vetor S: ");
		for (int i = 0; i < S.length; i++) {
			System.out.print(S[i] + " ");
		}
		
		System.out.println("\n\nVetor T: ");
		for (int i = 0; i < T.length; i++) {
			System.out.print(T[i] + " ");
		}
		
		System.out.println("\n\nVetor U: ");
		for (int i = 0; i < U.length; i++) {
			System.out.print(U[i] + " ");
		}
	}
	
}



