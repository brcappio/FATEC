/* Bruno Rosa Cappio
49) Solicite ao usuário a quantidade de termos da sequência de números primos e imprima a sequência do final para o início.
*/

import java.util.Scanner;


public class Ex49 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite a quantidade de termos da sequência de números primos: ");
	int n = leia.nextInt();
	
	int[] primos = new int[n];
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
			primos[contador] = i;
			contador++;
		}
	}
	
	for (int i = primos.length - 1; i >= 0; i--) {
		System.out.println(primos[i]);
	}
	}
}

