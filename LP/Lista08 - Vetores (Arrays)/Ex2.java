/* Bruno Rosa Cappio
 * 2) Escreva um programa para ler um vetor B de 15 posições e imprimir em ordem invertida.
 * 
 * 
 */

import java.util.Arrays;

public class Ex2 {
	
	public static void main (String[] args) {
		int tamanhoDoArray = 15;
		
		int b[] = new int[tamanhoDoArray];
		
		for (int i = 0; i < b.length; i++){
			b[i] = (int) (Math.random() * 100);
		}
        
        System.out.println("Ordem normal:");
        for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
        
        System.out.println("\nOrdem invertida:");
        for (int i = tamanhoDoArray - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}
		
	}
}

