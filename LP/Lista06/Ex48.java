/* Bruno Rosa Cappio
48) Solicite ao usuário a quantidade de termos da sequência de números primos e imprima o resultado.
*/

import java.util.Scanner;

public class Ex48 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite a quantidade de termos da sequência de números primos: ");
	int n = leia.nextInt();
	
	int contador = 0;
	for (int i = 2; contador < n; i++) {
		boolean ehPrimo = true;
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				ehPrimo = false;
				break;
			}
		}
		if (ehPrimo) {
			System.out.println(i);
			contador++;
		}
	}
	}
}

