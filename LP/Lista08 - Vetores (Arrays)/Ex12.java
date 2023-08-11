/* Bruno Rosa Cappio
 * 12) Escreva um programa para ler um vetor de inteiros P de 10 elementos e imprimir o vetor lido. Ler outro vetor de inteiros Q de 15 elementos e imprimir este vetor lido. Construir outro vetor R com todos os elementos lidos de P e de Q e imprimir este vetor obtido. (Concatenação)
 * 
 * 
 */


import java.util.Scanner;

public class Ex12 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
			
		int P[] = new int[10];
		
		int Q[] = new int[15];
		
		for (int i = 0; i < P.length; i++) {
			P[i] = (int) (Math.random() * 10);
		}
		
		for (int i = 0; i < Q.length; i++) {
			Q[i] = (int) (Math.random() * 10);
		}
		
		int R[] = new int[P.length + Q.length];
		int indexR = 0;
		
		for (int i = 0; i < R.length; i++) {
			if (indexR < P.length) {
				R[indexR] = P[i];
				indexR++; 
			}
			else {
				R[indexR] = Q[i - P.length];
				indexR++; 
			}
		}
		
		System.out.println("Vetor P: ");
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



