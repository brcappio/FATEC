/* Bruno Rosa Cappio
 * 2)[POO-002]Crie programa que solicite ao usuário um número tipo double.
 * Após verifique se o número é zero ou não.
 * A verificação deve ser feita através de um método que receba um valor(parâmetro de entrada)e informe se ele é zero ou não através de um retorno do tipo boolean.
 * Declare como: boolean isZero(double num).
 */

import java.util.Scanner;

public class POO002 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um numero do tipo double: ");
		double numero = leia.nextDouble();
		
		if (isZero (numero)) {
			System.out.println("O numero " + numero + " eh zero.");
		} else {
			System.out.println("O numero " + numero + " nao eh zero.");
		}
	}
	
	static boolean isZero (double num) {
		return num == 0;
	}
}

