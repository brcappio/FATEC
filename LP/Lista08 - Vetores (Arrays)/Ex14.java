/* Bruno Rosa Cappio
 * 14) Escreva um programa para ler um vetor de inteiros S de 10 elementos e imprimir o vetor lido. 
 * Ler outro vetor de inteiros T de 15 elementos e imprimir este vetor lido. 
 * Construir outro vetor U com todos os elementos lidos de S e de T e imprimir este vetor obtido. (Intercalação)
 * 
 * 
 */


import java.util.Scanner;

public class Ex14 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
					
		int S[] = new int[10];
		
		int T[] = new int[15];
		
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



