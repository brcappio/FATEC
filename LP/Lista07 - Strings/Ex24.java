/* Bruno Rosa Cappio
 * 24) Desenvolva um programa que leia uma String (que representa uma sequência de digitos 0's e 1's) e que determine o tamanho da maior sequência consecutiva de números 1 existente na String. No exemplo seguinte a maior cadeia consecutiva de números 1 tem tamanho 8(oito).
 *001010100110110100001011101111111101101001011000
 * 
 * 
 */


import java.util.Scanner;

public class Ex24 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine();
		
		int sequenciaAtual = 0;
		int maiorSequencia = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == '1') {
				sequenciaAtual++;
				maiorSequencia = Math.max(maiorSequencia, sequenciaAtual);
			} else {
				sequenciaAtual = 0;
			}
		}
		
		System.out.println("Tamanho da maior sequencia de '1's: " + maiorSequencia);

	}
}

