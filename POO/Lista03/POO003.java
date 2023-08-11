/* Bruno Rosa Cappio
 * 3)[POO-003]Com base nos dois exercícios anteriores, crie programa que solicite ao usuário um número tipo double. Após verifique se o número é positivo, negativo ou zero. As verificações devemser feitas através de métodos.
 *  
 */

import java.util.Scanner;

public class POO003 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um numero do tipo double: ");
		double numero = leia.nextDouble();
		
		if (isZero (numero)) {
			System.out.println("O numero " + numero + " eh zero.");
		} else if (isPositivo (numero)) {
		System.out.println("O numero " + numero + " eh positivo.");
		} else {
			System.out.println("O numero " + numero + " eh negativo.");
		}
	}
		
	static boolean isZero (double numero) {
		return numero == 0;
	}
	
	static boolean isPositivo (double numero) {
		return numero > 0;
	}
}

