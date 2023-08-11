/* Bruno Rosa Cappio
 *42) Construa um programa para mostrar o fatorial dos números inteiros na faixa de 1 a 10.
*/


public class Ex42 {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 10; i++) {
		int fatorial = 1;
		for (int j = i; j > 0; j--) {
			fatorial *= j;
		}
		System.out.println("O fatorial de " + i + " é " + fatorial);
	}
	}
}

