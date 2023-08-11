/* Bruno Rosa Cappio
54) Solicite ao usuário o termo inicial e o termo final da sequência de Fibonacci (intervalo fechado) e imprima o resultado.
*/

import java.util.Scanner;


public class Ex54 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o termo inicial da sequência de Fibonacci: ");
		int inicio = leia.nextInt();
		System.out.print("Digite o termo final da sequência de Fibonacci: ");
		int fim = leia.nextInt();
		
		int a = 0;
		int b = 1;
		int c;
		int i = 1;
		while (i <= fim) {
			if (i >= inicio) {
				System.out.print(a + ", ");
			}
			c = a + b;
			a = b;
			b = c;
			i++;
		}
	}
}

