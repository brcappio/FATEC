/* Bruno Rosa Cappio
45) Solicite ao usuário a quantidade de termos da sequência de fatoriais e imprima a sequência do final para o início.
*/

import java.util.Scanner;


public class Ex45 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite a quantidade de termos da sequência de fatoriais: ");
	int n = leia.nextInt();
	
	for (int i = n; i > 0; i--) {
		int fatorial = 1;
		for (int j = i; j > 0; j--) {
			fatorial *= j;
		}
		System.out.println("O fatorial de " + i + " é " + fatorial);
	}
	}
}

