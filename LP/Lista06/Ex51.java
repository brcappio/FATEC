/* Bruno Rosa Cappio
51) Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima o resultado.
*/

import java.util.Scanner;


public class Ex51 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
	int n = leia.nextInt();
	
	int a = 0;
	int b = 1;
	int c;
	System.out.print(a + " " + b);
	for (int i = 2; i < n; i++) {
		c = a + b;
		System.out.print(" " + c);
		a = b;
		b = c;
	}
	}
}

