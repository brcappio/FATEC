/* Bruno Rosa Cappio
46) Solicite ao usuário um número e verifique se este número é primo ou não.
*/

import java.util.Scanner;


public class Ex46 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite um número inteiro positivo: ");
	int numero = leia.nextInt();
	
	boolean ehPrimo = true;
	if (numero <= 1) {
		ehPrimo = false;
	} else {
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				ehPrimo = false;
				break;
			}
		}
	}
	
	if (ehPrimo) {
		System.out.println(numero + " é primo");
	} else {
		System.out.println(numero + " não é primo");
	}
	}
}

